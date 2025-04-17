package com.bloodmoon.yourscaryplaces.models

sealed class ScaryPlacesViewState {
    data object Loading : ScaryPlacesViewState()
    data class Error(val description: String, val icon: Int) : ScaryPlacesViewState()
    data class Display(val scaryPlaces: List<String>) : ScaryPlacesViewState()
}