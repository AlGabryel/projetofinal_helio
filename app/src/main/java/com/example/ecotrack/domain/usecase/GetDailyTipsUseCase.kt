package com.example.ecotrack.domain.usecase

import com.example.ecotrack.domain.repository.EcoRepository

class GetDailyTipsUseCase(
    private val repository: EcoRepository
) {
    suspend operator fun invoke() = repository.getDailyTips()
}
