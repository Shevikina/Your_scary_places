package com.bloodmoon.yourscaryplaces.models.events

sealed class ScaryPlacesEvent {
    data object EnterScreen : ScaryPlacesEvent()
    data object ReloadScreen : ScaryPlacesEvent()
}