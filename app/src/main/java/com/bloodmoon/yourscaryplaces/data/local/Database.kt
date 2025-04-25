package com.bloodmoon.yourscaryplaces.data.local

import com.bloodmoon.yourscaryplaces.ui.screens.planets.models.PlanetInfo

object Database {
    val planetList = listOf(
        PlanetInfo(
            id = 0,
            label = "Ghost “Yenion”",
            rating = 3,
            imagePath = "file:///android_asset/App2_Image1.jpg",
            description = "We are happy to show you lost places in our endless galaxy. Fear and horror will follow you all the way. Only the most desperate travelers will be able to reach the end. You are ready?"
        ),
        PlanetInfo(
            id = 1,
            label = "Destroyed platform",
            rating = 4,
            imagePath = "file:///android_asset/App2_Image2.jpg"
        ),
        PlanetInfo(
            id = 2,
            label = "Gold mine",
            rating = 5,
            imagePath = "file:///android_asset/App2_Image3.jpg"
        )
    )
}