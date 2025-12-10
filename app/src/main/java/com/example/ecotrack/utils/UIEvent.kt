package com.example.ecotrack.utils

sealed class UiEvent {
    data class ShowMessage(val message: String) : UiEvent()
    data class Navigate(val route: String) : UiEvent()
}
