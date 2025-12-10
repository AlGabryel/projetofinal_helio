package com.example.ecotrack.ui.navigation

sealed class NavRoutes(val route: String) {
    object Home : NavRoutes("home")
    object Habits : NavRoutes("habits")
    object Challenges : NavRoutes("challenges")
}
