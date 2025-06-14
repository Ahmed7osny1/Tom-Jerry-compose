package com.example.composable.tomkitchen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.IbmPlex

@Composable
fun BottomPartTomKitchen(modifier: Modifier){

    Box(
        modifier = modifier
            .height(86.dp)
            .fillMaxWidth()
            .border(
                width = 1.dp,
                color = Color(0x1F1F1F1E)
            )
            .background(color = Color(0xFFFFFFFF))
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(56.dp)
                .align(Alignment.Center)
                .padding(horizontal = 15.dp)
                .clip(shape = RoundedCornerShape(16.dp))
                .background(Color(0xFF226993)),
        ) {
            Row (
                modifier = Modifier
                    .align(Alignment.Center),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(8.dp)
            ){
                Text(
                    text = "Add to cart",
                    fontFamily = IbmPlex,
                    fontWeight = FontWeight.Medium,
                    fontSize = 16.sp,
                    lineHeight = 16.sp,
                    color = Color(0xDEFFFFFF),
                    letterSpacing = 0.5.sp,
                )
                Icon (
                    painterResource(R.drawable.ellipse_4),
                    contentDescription = null,
                    tint = Color.Unspecified
                )
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(
                        text = "3 cheeses",
                        fontFamily = IbmPlex,
                        fontWeight = FontWeight.Medium,
                        fontSize = 14.sp,
                        color = Color(0xFFFFFFFF),
                        letterSpacing = 0.5.sp
                    )
                    Text(
                        text = "5 cheeses",
                        fontFamily = IbmPlex,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp,
                        color = Color(0xCCFFFFFF),
                        textDecoration = TextDecoration.LineThrough,
                        letterSpacing = 0.5.sp
                    )
                }
            }
        }

    }

}

@Preview
@Composable
fun PreviewBottomPartTomKitchen(){
    BottomPartTomKitchen(Modifier)
}