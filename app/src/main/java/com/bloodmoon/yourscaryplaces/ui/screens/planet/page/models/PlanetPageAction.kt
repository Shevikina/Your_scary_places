package com.bloodmoon.yourscaryplaces.ui.screens.planet.page.models

sealed class PlanetPageAction {
    data class ShowDialog(
        val title: String,
        val body: String,
        val positiveButtonText: String,
        val negativeButtonText: String
    ) : PlanetPageAction()
}