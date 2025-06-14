package com.example.composable.tomaccount

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.IbmPlex

@Composable
fun TopSectionTomAccount(){
    Box (
        modifier = Modifier.fillMaxSize()
    ){
        Image(
            painter = painterResource(R.drawable.background_container),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .offset(y = (-60).dp),
            contentScale = ContentScale.Crop
        )
        Column (
            modifier = Modifier
                .align(Alignment.TopCenter)
                .padding(top = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Image(
                painter = painterResource(R.drawable.profile_tom_image),
                contentDescription = null,
            )
            Text(
                text = "Tom",
                fontFamily = IbmPlex,
                fontWeight = FontWeight.Medium,
                fontSize = 18.sp,
                lineHeight = 18.sp,
                color = Color(0xFFFFFFFF),
                modifier = Modifier.padding(top = 4.dp)
            )
            Text(
                text = "specializes in failure!",
                fontFamily = IbmPlex,
                fontWeight = FontWeight.Normal,
                fontSize = 12.sp,
                lineHeight = 12.sp,
                color = Color(0xCCFFFFFF),
            )
            Box (
                modifier = Modifier
                    .padding(top = 4.dp)
                    .size(width = 97.dp, height = 25.dp)
                    .clip(shape = RoundedCornerShape(40.dp))
                    .background(color = Color(0x26FFFFFF)),
                contentAlignment = Alignment.Center
            ){
                Text(
                    text = "Edit foolishness",
                    fontFamily = IbmPlex,
                    fontWeight = FontWeight.Medium,
                    fontSize = 10.sp,
                    lineHeight = 10.sp,
                    color = Color(0xFFFFFFFF),
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTopSectionTomAccount(){
    TopSectionTomAccount()
}