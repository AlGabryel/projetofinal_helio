package com.example.ecotrack.domain.usecase

import com.example.ecotrack.data.repository.EcoRepository

class GetDailyTipsUseCase(
    private val repository: EcoRepository
) {
    suspend operator fun invoke() = repository.getDailyTips()
}
