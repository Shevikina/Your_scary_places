package com.bloodmoon.yourscaryplaces.data.local.entity

data class TourDetails(
    val id: Int,
    val name: String,
    val imagePath: String,
    val stars: Int,
    val description: String = ""
)
