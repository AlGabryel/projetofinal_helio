package com.example.ecotrack.ui.home

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import com.example.ecotrack.ui.navigation.NavRoutes

@Composable
fun HomeScreen(onNavigate: (String) -> Unit) {
    Column {
        Text("Bem-vindo ao EcoTrack!")

        Button(onClick = { onNavigate(NavRoutes.Habits.route) }) {
            Text("Hábitos")
        }

        Button(onClick = { onNavigate(NavRoutes.Challenges.route) }) {
            Text("Desafios")
        }
    }
}
