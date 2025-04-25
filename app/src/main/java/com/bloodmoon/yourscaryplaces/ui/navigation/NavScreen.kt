package com.bloodmoon.yourscaryplaces.ui.navigation

import kotlinx.serialization.Serializable

@Serializable
sealed class NavScreen {
    @Serializable
    data object TouristPlanets : NavScreen()

    @Serializable
    data class TouristPlanetPage(val planetId: Int) : NavScreen()
}