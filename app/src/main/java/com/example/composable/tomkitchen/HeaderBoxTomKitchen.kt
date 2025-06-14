package com.example.composable.tomkitchen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.CardColor
import com.example.tomandjerry.ui.theme.ColorItem
import com.example.tomandjerry.ui.theme.IbmPlex
import com.example.tomandjerry.ui.theme.TextDescriptionBoard60
import com.example.tomandjerry.ui.theme.TextTitleColorTomKitchen

@Composable
fun HeaderBoxTomKitchen() {

    Column {
        Row(
            modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            ) {
                Text(
                    text = "Electric Tom pasta",
                    fontFamily = IbmPlex,
                    fontWeight = FontWeight.Medium,
                    fontSize = 20.sp,
                    lineHeight = 32.sp,
                    color = TextTitleColorTomKitchen
                )
                Box(
                    modifier = Modifier
                        .padding(top = 12.dp)
                        .size(width = 91.dp, height = 30.dp)
                        .clip(shape = RoundedCornerShape(8.dp))
                        .background(CardColor)
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(start = 9.5.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.coin),
                            contentDescription = "coin",
                            tint = Color.Unspecified
                        )
                        Text(
                            text = "5 cheeses",
                            fontFamily = IbmPlex,
                            fontWeight = FontWeight.Medium,
                            fontSize = 12.sp,
                            color = ColorItem,
                            modifier = Modifier.padding(start = 4.dp)
                        )
                    }

                }
            }
            Icon(
                painter = painterResource(R.drawable.favoriteicon),
                contentDescription = null,
                tint = Color.Unspecified,
            )
        }

        Spacer(Modifier.height(8.dp))

        Text(
            text = "Pasta cooked with a charger cable and sprinkled with questionable cheese. Make sure to unplug it before eating (or not, you decide).",
            fontFamily = IbmPlex,
            fontWeight = FontWeight.Medium,
            fontSize = 14.sp,
            color = TextDescriptionBoard60,
            lineHeight = 20.sp,
            letterSpacing = 0.5.sp,
        )
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewHeaderBoxTomKitchen() {
    HeaderBoxTomKitchen()
}
