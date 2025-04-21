package com.bloodmoon.yourscaryplaces.ui.screens.planets.models

sealed class ScaryPlacesEvent {
    data object EnterScreen : ScaryPlacesEvent()
    data object ReloadScreen : ScaryPlacesEvent()
}