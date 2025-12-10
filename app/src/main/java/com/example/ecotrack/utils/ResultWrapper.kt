package com.example.ecotrack.utils

sealed class ResultWrapper<out T> {
    data class Success<out T>(val data: T) : ResultWrapper<T>()
    data class Error(val message: String) : ResultWrapper<Nothing>()
    data object Loading : ResultWrapper<Nothing>()
}
