package com.bloodmoon.yourscaryplaces.data.local.repository

import com.bloodmoon.yourscaryplaces.data.local.entity.TourDetails
import com.bloodmoon.yourscaryplaces.data.local.entity.TourPreview

class TourRepository {
    private val planetList = listOf(
        TourDetails(
            id = 1,
            name = "Ghost “Yenion”",
            stars = 3,
            imagePath = "file:///android_asset/App2_Image1.jpg",
            description = "We are happy to show you lost places in our endless galaxy. Fear and horror will follow you all the way. Only the most desperate travelers will be able to reach the end. You are ready?"
        ),
        TourDetails(
            id = 2,
            name = "Destroyed platform",
            stars = 4,
            imagePath = "file:///android_asset/App2_Image2.jpg",
            description = ""
        ),
        TourDetails(
            id = 3,
            name = "Gold mine",
            stars = 5,
            imagePath = "file:///android_asset/App2_Image3.jpg",
            description = ""
        )
    )

    fun getTours(): List<TourPreview> =
        planetList.map { TourPreview(it.id, it.name, it.imagePath, it.stars) }

    fun getTourPage(id: Int): TourDetails = planetList.first { it.id == id }
}