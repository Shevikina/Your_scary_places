package com.bloodmoon.yourscaryplaces.ui.screens.planets.models

sealed class PlanetsEvent {
    data object EnterScreen : PlanetsEvent()
    data object ReloadScreen : PlanetsEvent()
    data class OpenPlanetPageScreen(val planetInfoId: Int) : PlanetsEvent()
}