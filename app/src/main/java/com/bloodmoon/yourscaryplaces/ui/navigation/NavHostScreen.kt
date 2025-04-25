package com.bloodmoon.yourscaryplaces.ui.navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.bloodmoon.yourscaryplaces.ui.screens.planet.page.PlanetPageScreen
import com.bloodmoon.yourscaryplaces.ui.screens.planets.PlanetsScreen

@Composable
fun NavHostScreen(modifier: Modifier = Modifier) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = NavScreen.TouristPlanets,
        modifier = modifier.fillMaxSize()
    ) {
        composable<NavScreen.TouristPlanets> { PlanetsScreen(navController) }
        composable<NavScreen.TouristPlanetPage> { entry ->
            val page = entry.toRoute<NavScreen.TouristPlanetPage>()
            PlanetPageScreen(navController, page.planetId)
        }
    }
}