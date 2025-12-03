package com.example.ecotrack.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {

    val api: EcoApiService by lazy {
        Retrofit.Builder()
            .baseUrl("https://suaapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(EcoApiService::class.java)
    }
}
