package com.example.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.PreviewScreenSizes
import androidx.compose.ui.unit.dp
import com.example.composable.jerrystore.CardItem
import com.example.composable.jerrystore.HomeCard
import com.example.composable.jerrystore.HomeHeaderContent
import com.example.composable.jerrystore.HomeSearch
import com.example.composable.jerrystore.SectionTitle
import com.example.data.CardDummyData
import com.example.tomandjerry.ui.theme.LightGrayBackground

@Composable
fun JerryStore(modifier: Modifier) {

    Column(
        modifier = modifier
            .fillMaxSize()
            .background(LightGrayBackground)
            .padding(start = 16.dp, end = 16.dp, top = 2.dp),
    ) {

        HomeHeaderContent()

        Spacer(Modifier.height(12.dp))

        Column(
            modifier = Modifier
                .fillMaxSize()
                .verticalScroll(rememberScrollState())
                .padding(bottom = 10.dp)
        ) {

            HomeSearch()

            Spacer(Modifier.height(8.dp))

            HomeCard()

            Spacer(Modifier.height(8.dp))

            SectionTitle()

            Spacer(Modifier.height(25.dp))

            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                userScrollEnabled = false,
                verticalArrangement = Arrangement.spacedBy(17.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier
                    .heightIn(max = 700.dp),
            ) {
                val cardDataList = CardDummyData().getCardData()
                items(cardDataList) { item ->
                    CardItem(item)
                }
            }
        }
    }
}


//@Preview(showBackground = true)
@PreviewScreenSizes()
@Composable
fun PreviewJerryStore() {
    JerryStore(modifier = Modifier)
}