package com.bloodmoon.yourscaryplaces.models.events

sealed class ScaryPlacePageEvent {
    data class EnterScreen(val planetId: Int) : ScaryPlacePageEvent()
    data object ReloadScreen : ScaryPlacePageEvent()
    data object BookTour : ScaryPlacePageEvent()
}