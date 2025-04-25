package com.bloodmoon.yourscaryplaces.ui.screens.planets.models

sealed class PlanetsViewState {
    data object Loading : PlanetsViewState()
    data class Error(val description: String, val icon: Int) : PlanetsViewState()
    data class Display(val scaryPlaces: List<String>) : PlanetsViewState()
}