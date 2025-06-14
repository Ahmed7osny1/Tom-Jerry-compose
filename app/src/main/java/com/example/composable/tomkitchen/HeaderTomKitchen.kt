package com.example.composable.tomkitchen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.BackgroundColor
import com.example.tomandjerry.ui.theme.IbmPlex
import com.example.tomandjerry.ui.theme.TextBoard

@Composable
fun HeaderTomKitchen() {

    Box (
        modifier = Modifier
            .fillMaxWidth()
            .height(400.dp)
            .background(color = BackgroundColor),
    ){
        Image(
            painter = painterResource(R.drawable.ellipse_3),
            contentDescription = "",
            modifier = Modifier
                .align(Alignment.TopStart)
                .offset(y = (-30).dp),
            contentScale = ContentScale.Crop,
        )
        Column(
            modifier = Modifier.padding(start = 16.dp, top = 40.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painterResource(R.drawable.ruler),
                    contentDescription = null,
                    tint = Color.Unspecified
                )
                Text(
                    text = "High tension",
                    fontSize = 16.sp,
                    lineHeight = 16.sp,
                    fontFamily = IbmPlex,
                    fontWeight = FontWeight.Medium,
                    color = TextBoard,
                    letterSpacing = 0.5.sp,
                    modifier = Modifier.padding(start = 9.25.dp)
                )
            }

            Spacer(modifier = Modifier.height(16.dp))

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painterResource(R.drawable.chef),
                    contentDescription = null,
                    tint = Color.Unspecified
                )
                Text(
                    text = "Shocking foods",
                    fontSize = 16.sp,
                    lineHeight = 16.sp,
                    fontFamily = IbmPlex,
                    fontWeight = FontWeight.Medium,
                    color = TextBoard,
                    letterSpacing = 0.5.sp,
                    modifier = Modifier.padding(start = 10.25.dp)
                )
            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun PreviewHeaderTomKitchen() {
    HeaderTomKitchen()
}
