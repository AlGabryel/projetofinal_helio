package com.example.ecotrack.data.repository

import com.example.ecotrack.domain.model.EcoTip

interface EcoRepository {
    suspend fun getDailyTips(): List<EcoTip>
}
