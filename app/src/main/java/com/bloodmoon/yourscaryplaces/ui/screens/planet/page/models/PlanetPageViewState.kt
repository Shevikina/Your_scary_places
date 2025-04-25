package com.bloodmoon.yourscaryplaces.ui.screens.planet.page.models

sealed class PlanetPageViewState {
    data object Loading : PlanetPageViewState()
    data class Error(val description: String, val icon: Int) : PlanetPageViewState()
    data class Display(
        val planetName: String,
        val photo: String,
        val rating: Int,
        val description: String
    ) : PlanetPageViewState()
}