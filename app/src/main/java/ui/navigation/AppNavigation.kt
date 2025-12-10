package com.example.ecotrack.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

import com.example.ecotrack.ui.home.HomeScreen
import com.example.ecotrack.ui.habits.HabitsScreen
import com.example.ecotrack.ui.challenges.ChallengesScreen

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavRoutes.Home.route) {

        composable(NavRoutes.Home.route) {
            HomeScreen(onNavigate = { route -> navController.navigate(route) })
        }

        composable(NavRoutes.Habits.route) {
            HabitsScreen()
        }

        composable(NavRoutes.Challenges.route) {
            ChallengesScreen()
        }
    }
}
