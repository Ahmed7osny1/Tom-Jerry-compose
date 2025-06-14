package com.example.composable.tomaccount

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.theme.IbmPlex

@Composable
fun BodyItems(modifier: Modifier, title: String, cardData: List<CardFinalData>) {
    Column (
        modifier = modifier
    ) {

        Text(
            text = title,
            fontFamily = IbmPlex,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            lineHeight = 20.sp,
            color = Color(0xDE1F1F1E)
        )

        RowCardItem(
            Modifier.padding(top = 8.dp),
            cardData[0].image,
            cardData[0].title
        )
        RowCardItem(
            Modifier.padding(top = 12.dp),
            cardData[1].image,
            cardData[1].title
        )
        RowCardItem(
            Modifier.padding(top = 12.dp),
            cardData[2].image,
            cardData[2].title
        )
    }
}

@Preview
@Composable
fun PreviewBodyItems() {
    BodyItems(modifier = Modifier, "His favorite foods", listOf())
}
