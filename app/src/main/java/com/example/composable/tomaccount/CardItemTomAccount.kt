package com.example.composable.tomaccount

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import com.example.data.TomAccountDataCard
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.IbmPlex

@Composable
fun CardItemTomAccount() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 23.dp, start = 16.dp, end = 16.dp),
    ) {

        val cardData = listOf(
            TomAccountDataCard(
                Color(0xFFD0E5F0), R.drawable.quarrels, "2M 12K", "No. of quarrels"
            ),
            TomAccountDataCard(
                Color(0xFFDEEECD), R.drawable.chase, "+500 h", "Chase time"
            ),
            TomAccountDataCard(
                Color(0xFFF2D9E7), R.drawable.hunting, "2M 12K", "Hunting times"
            ),
            TomAccountDataCard(
                Color(0xFFFAEDCF), R.drawable.heart_broken, "3M 7K", "Heartbroken"
            ),
        )
        val rows = cardData.chunked(2)

        rows.forEach { rowItems ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 4.dp),
                horizontalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                rowItems.forEach { item ->
                    Box(
                        modifier = Modifier
                            .weight(1f)
                            .height(58.dp)
                            .clip(shape = RoundedCornerShape(12.dp))
                            .background(item.backgroundColor)
                    ) {
                        Row {
                            Icon(
                                painter = painterResource(item.image),
                                contentDescription = null,
                                tint = Color.Unspecified,
                                modifier = Modifier
                                    .padding(start = 12.dp)
                                    .align(Alignment.CenterVertically)
                            )
                            Column(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(start = 10.dp),
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = item.title,
                                    fontFamily = IbmPlex,
                                    fontWeight = FontWeight.SemiBold,
                                    fontSize = 16.sp,
                                    lineHeight = 16.sp,
                                    letterSpacing = 0.5.sp,
                                    color = Color(0x99121212)
                                )
                                Text(
                                    text = item.description,
                                    fontFamily = IbmPlex,
                                    fontWeight = FontWeight.Medium,
                                    fontSize = 12.sp,
                                    lineHeight = 12.sp,
                                    letterSpacing = 0.5.sp,
                                    color = Color(0x5E121212)
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewCardItemTomAccount() {
    CardItemTomAccount()
}