package com.example.data

import com.example.tomandjerry.R

class CardDummyData {
    fun getCardData(): List<CardData> {
        return listOf(
            CardData(
                image = R.drawable.sport_tom,
                title = "Sport Tom",
                description = "He runs 1 meter... trips over his boot.",
                numberOfCheese = 5,
                offerNumberOfCheese = 3
            ),
            CardData(
                image = R.drawable.tom_lover,
                title = "Tom the lover",
                description = "He loves one-sidedly... and is beaten by the other side.",
                numberOfCheese = 5
            ),
            CardData(
                image = R.drawable.tom_bomb,
                title = "Tom the bomb",
                description = "He blows himself up before Jerry can catch him.",
                numberOfCheese = 10
            ),
            CardData(
                image = R.drawable.spy_tom,
                title = "Spy Tom",
                description = "Disguises itself as a table.",
                numberOfCheese = 12
            ),
            CardData(
                image = R.drawable.frozen_tom,
                title = "Frozen Tom",
                description = "He was chasing Jerry, he froze after the first look",
                numberOfCheese = 10
            ),
            CardData(
                image = R.drawable.sleeping_tom,
                title = "Sleeping Tom",
                description = "He doesn't chase anyone, he just snores in stereo.",
                numberOfCheese = 10
            )
        )
    }
}