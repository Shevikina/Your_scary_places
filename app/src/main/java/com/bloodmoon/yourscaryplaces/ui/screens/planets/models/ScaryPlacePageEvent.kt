package com.bloodmoon.yourscaryplaces.ui.screens.planets.models

sealed class ScaryPlacePageEvent {
    data class EnterScreen(val planetId: Int) : ScaryPlacePageEvent()
    data object ReloadScreen : ScaryPlacePageEvent()
    data object BookTour : ScaryPlacePageEvent()
}