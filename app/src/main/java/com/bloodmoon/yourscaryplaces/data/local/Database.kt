package com.bloodmoon.yourscaryplaces.data.local

import com.bloodmoon.yourscaryplaces.data.local.entity.TourDetails

object Database {
    val planetList = listOf(
        TourDetails(
            id = 0,
            name = "Ghost “Yenion”",
            stars = 3,
            imagePath = "file:///android_asset/App2_Image1.jpg",
            description = "We are happy to show you lost places in our endless galaxy. Fear and horror will follow you all the way. Only the most desperate travelers will be able to reach the end. You are ready?"
        ),
        TourDetails(
            id = 1,
            name = "Destroyed platform",
            stars = 4,
            imagePath = "file:///android_asset/App2_Image2.jpg"
        ),
        TourDetails(
            id = 2,
            name = "Gold mine",
            stars = 5,
            imagePath = "file:///android_asset/App2_Image3.jpg"
        )
    )
}