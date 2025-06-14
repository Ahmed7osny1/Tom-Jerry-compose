package com.example.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composable.tomkitchen.BodyDetails
import com.example.composable.tomkitchen.BottomPartTomKitchen
import com.example.composable.tomkitchen.HeaderTomKitchen
import com.example.tomandjerry.R

@Composable
fun TomKitchen(modifier: Modifier) {

    Box (
        modifier = modifier
            .fillMaxSize()
            .clipToBounds()
    ){
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(bottom = 86.dp)
                .verticalScroll(rememberScrollState())
        ) {

            HeaderTomKitchen()

            BodyDetails()

            Box(
                modifier = Modifier
                    .padding(top = 20.dp, end = 25.dp)
                    .align(Alignment.TopEnd)
            ) {
                Image(
                    painterResource(R.drawable.food_item),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.size(height = 178.dp, width = 205.dp)
                )
            }
        }
        BottomPartTomKitchen(
            modifier = Modifier.align(
                Alignment.BottomCenter
            )
        )
    }
}

@Preview(showBackground = true)
//@PreviewScreenSizes
@Composable
fun PreviewTomKitchen() {
    TomKitchen(Modifier)
}