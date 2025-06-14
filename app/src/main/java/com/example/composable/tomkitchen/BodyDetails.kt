package com.example.composable.tomkitchen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.tomandjerry.ui.theme.LightGrayBackground

@Composable
fun BodyDetails(){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 182.dp)
            .clip(RoundedCornerShape(topStart = 16.dp, topEnd = 16.dp))
            .background(color = LightGrayBackground),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 32.dp)
                .padding(horizontal = 16.dp)
        ) {
            HeaderBoxTomKitchen()

            Spacer(Modifier.height(24.dp))

            DetailsCards()

            Spacer(Modifier.height(24.dp))

            PreparationStepSection()
        }
    }

}
@Preview
@Composable
fun PreviewBodyDetails(){
    BodyDetails()
}
