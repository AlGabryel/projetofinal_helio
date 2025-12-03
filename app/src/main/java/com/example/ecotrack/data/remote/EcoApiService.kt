package com.example.ecotrack.data.remote

import com.example.ecotrack.data.model.EcoTipDTO
import retrofit2.http.GET

interface EcoApiService {

    @GET("tips")
    suspend fun getEcoTips(): List<EcoTipDTO>
}