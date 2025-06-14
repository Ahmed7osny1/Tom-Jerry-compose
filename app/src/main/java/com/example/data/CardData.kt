package com.example.data

data class CardData(
    val image: Int,
    val title: String,
    val description: String,
    val numberOfCheese: Int,
    val offerNumberOfCheese: Int = 0
)
