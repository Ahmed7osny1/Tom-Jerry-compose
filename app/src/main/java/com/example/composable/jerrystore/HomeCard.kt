package com.example.composable.jerrystore

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.CardDescriptionColor
import com.example.tomandjerry.ui.theme.IbmPlex

@Composable
fun HomeCard() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(128.dp),
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(92.dp)
                .clip(RoundedCornerShape(16.dp))
                .align(Alignment.Center)
                .background(
                    Brush.linearGradient(
                        colors = listOf(Color(0xFF03446A), Color(0xFF0685D0))
                    )
                )
        ) {
            Column(
                modifier = Modifier.padding(start = 12.dp, top = 12.dp)
            ) {
                Text(
                    text = "Buy 1 Tom and get 2 for free",
                    fontFamily = IbmPlex,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.SemiBold,
                    letterSpacing = 0.sp,
                    lineHeight = 16.sp,
                    color = Color(0xFFFFFFFF)
                )
                Text(
                    text = "Adopt Tom! (Free Fail-Free\nGuarantee)",
                    fontFamily = IbmPlex,
                    fontSize = 12.sp,
                    fontWeight = FontWeight.Normal,
                    color = CardDescriptionColor,
                    letterSpacing = 0.sp,
                    lineHeight = 18.sp,
                    modifier = Modifier
                        .padding(top = 8.dp)
                )
            }
        }
        Box(
            modifier = Modifier
                .size(width = 115.38.dp, height = 108.dp)
                .align(Alignment.TopEnd)
        ) {
            Image(
                painter = painterResource(R.drawable.tom_card),
                contentDescription = "Tom Card Offer",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )
        }
        Box(
            modifier = Modifier
                .size(width = 90.dp, height = 123.69.dp)
                .align(Alignment.BottomEnd),
        ) {
            Icon(
                painter = painterResource(R.drawable.ellipse_1),
                contentDescription = "ellipse",
                modifier = Modifier.fillMaxSize(),
                tint = Color.Unspecified
            )
        }
        Box(
            modifier = Modifier
                .size(width = 85.dp, height = 123.69.dp)
                .graphicsLayer(rotationZ = 0.87f)
                .align(Alignment.BottomEnd)
        ) {
            Icon(
                painter = painterResource(R.drawable.ellipse_2),
                contentDescription = "ellipse",
                modifier = Modifier.fillMaxSize(),
                tint = Color.Unspecified
            )
        }
    }
}