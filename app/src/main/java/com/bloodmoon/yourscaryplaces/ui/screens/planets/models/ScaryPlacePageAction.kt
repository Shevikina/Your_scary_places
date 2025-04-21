package com.bloodmoon.yourscaryplaces.ui.screens.planets.models

sealed class ScaryPlacePageAction {
    data class ShowDialog(
        val title: String,
        val body: String,
        val buttonText: String
    ) : ScaryPlacePageAction()
}