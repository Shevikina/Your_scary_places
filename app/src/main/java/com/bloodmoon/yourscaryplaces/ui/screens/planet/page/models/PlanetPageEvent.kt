package com.bloodmoon.yourscaryplaces.ui.screens.planet.page.models

sealed class PlanetPageEvent {
    data class EnterScreen(val planetId: Int) : PlanetPageEvent()
    data object ReloadScreen : PlanetPageEvent()
    data object CloseScreen : PlanetPageEvent()
    data class ShowDialog(
        val title: String,
        val body: String,
        val positiveButtonText: String,
        val negativeButtonText: String
    ) : PlanetPageEvent()

    data object BookTour : PlanetPageEvent()
}