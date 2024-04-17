package com.example.surfhomework2

import androidx.annotation.DrawableRes

data class Rocket(
    @DrawableRes val image: Int,
    val nameOfRocket: String,
    val typeOfRocket: String,
    val data: String,
    val isActive: Boolean = false
)
