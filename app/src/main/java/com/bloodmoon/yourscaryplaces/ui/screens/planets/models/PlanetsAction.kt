package com.bloodmoon.yourscaryplaces.ui.screens.planets.models

sealed class PlanetsAction {
    data class ShowDialog(
        val title: String,
        val body: String,
        val positiveButtonText: String,
        val negativeButtonText: String
    ) : PlanetsAction()
}