package com.example.ecotrack.data.repository

import com.example.ecotrack.data.remote.RetrofitInstance
import com.example.ecotrack.domain.model.EcoTip
import com.example.ecotrack.domain.repository.EcoRepository

class EcoRepositoryImpl : EcoRepository {

    override suspend fun getDailyTips(): List<EcoTip> {
        val response = RetrofitInstance.api.getEcoTips()

        return response.map { dto ->
            EcoTip(
                id = dto.id,
                title = dto.title,
                description = dto.description,
                category = dto.category
            )
        }
    }
}