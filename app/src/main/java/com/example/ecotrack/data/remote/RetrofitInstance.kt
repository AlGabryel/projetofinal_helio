package com.example.ecotrack.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    val api: EcoApiService by lazy {
        Retrofit.Builder()
            .baseUrl("https://api.api-ninjas.com/v1/quotes?category=environment")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(EcoApiService::class.java)
    }
}
