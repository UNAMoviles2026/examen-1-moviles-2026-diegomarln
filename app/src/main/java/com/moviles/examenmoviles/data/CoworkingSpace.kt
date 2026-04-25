package com.moviles.examenmoviles.data

import androidx.annotation.DrawableRes

data class CoworkingSpace(
    val id: Int,
    val name: String,
    @DrawableRes val imageRes: Int,
    val imageDescription: String,
    val description: String,
    val location: String,
    val capacity: Int,
    val pricePerHour: Double,
    val isAvailable: Boolean,
    val amenities: List<String>
)