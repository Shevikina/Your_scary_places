package com.bloodmoon.yourscaryplaces.models.view_states

sealed class ScaryPlacePageViewState {
    data object Loading : ScaryPlacePageViewState()
    data class Error(val description: String, val icon: Int) : ScaryPlacePageViewState()
    data class Display(
        val planetName: String,
        val photo: String,
        val rating: Int,
        val description: String
    ) : ScaryPlacePageViewState()
}