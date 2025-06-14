package com.example.composable.tomkitchen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.TomDetailsCard
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.IbmPlex
import com.example.tomandjerry.ui.theme.TextTitleColorTomKitchen

@Composable
fun DetailsCards() {

    Column {
        Text(
            text = "Details",
            fontFamily = IbmPlex,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp,
            lineHeight = 32.sp,
            color = TextTitleColorTomKitchen,
            letterSpacing = 0.5.sp
        )
        Row(
            modifier = Modifier
                .padding(top = 8.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            CardTomKitchen(
                tomDetailsCard = TomDetailsCard(
                    R.drawable.temperature, "1000 V", "Temperature"
                ), modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            )
            CardTomKitchen(
                tomDetailsCard = TomDetailsCard(
                    R.drawable.timer, "3 sparks", "Time"
                ), modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)

            )
            CardTomKitchen(
                tomDetailsCard = TomDetailsCard(
                    R.drawable.evil, "1M 12K", "No. of deaths"
                ), modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewDetailsCards() {
    DetailsCards()
}
