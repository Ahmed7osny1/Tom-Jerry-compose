package com.example.composable.jerrystore

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.BorderProfileImageColor
import com.example.tomandjerry.ui.theme.ColorItem
import com.example.tomandjerry.ui.theme.IbmPlex
import com.example.tomandjerry.ui.theme.LightGrayBackground
import com.example.tomandjerry.ui.theme.TextSubTitleColor
import com.example.tomandjerry.ui.theme.TextTitleColor

@Composable
fun HomeHeaderContent() {

    Row(
        modifier = Modifier.fillMaxWidth()
            .height(height = 56.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(R.drawable.profile_image),
                modifier = Modifier
                    .size(48.dp)
                    .clip(shape = RoundedCornerShape(12.dp))
                    .border(
                        width = 0.5.dp, color = BorderProfileImageColor,
                        shape = RoundedCornerShape(12.dp)
                    ),
                contentScale = ContentScale.Crop,
                contentDescription = "Profile Image",
            )
            Column(
                modifier = Modifier
                    .padding(start = 8.dp)
            ) {
                Text(
                    text = "Hi, Jerry \uD83D\uDC4B\uD83C\uDFFB",
                    color = TextTitleColor,
                    fontFamily = IbmPlex,
                    fontSize = 14.sp,
                    letterSpacing = 0.sp,
                    lineHeight = 14.sp,
                    fontWeight = FontWeight.Medium,
                )
                Text(
                    text = "Which Tom do you want to buy?",
                    color = TextSubTitleColor,
                    fontFamily = IbmPlex,
                    fontSize = 12.sp,
                    letterSpacing = 0.sp,
                    lineHeight = 14.sp,
                    fontWeight = FontWeight.Normal,
                )
            }

        }

        Spacer(modifier = Modifier.weight(1f))

        Box(
            modifier = Modifier
                .size(48.dp)
                .align(Alignment.CenterVertically),
            contentAlignment = Alignment.Center
        ) {

            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(LightGrayBackground)
                    .border(
                        width = 1.dp,
                        color = BorderProfileImageColor,
                        shape = RoundedCornerShape(12.dp)
                    )
            ) {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    Image(
                        painter = painterResource(R.drawable.notification),
                        contentDescription = "Notification"
                    )
                }
            }

            Box(
                modifier = Modifier
                    .size(16.dp)
                    .align(Alignment.TopEnd)
                    .background(ColorItem, shape = CircleShape),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "3",
                    color = Color(0xFFFFFFFF),
                    fontSize = 10.sp,
                    fontFamily = IbmPlex,
                    fontWeight = FontWeight.Medium,
                    textAlign = TextAlign.Center,
                    lineHeight = 10.sp,
                    modifier = Modifier.fillMaxSize()
                )
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHomeHeaderContent(){
    HomeHeaderContent()
}