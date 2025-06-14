package com.example.composable.tomaccount

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
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
import com.example.tomandjerry.ui.theme.IbmPlex

@Composable
fun RowCardItem(modifier: Modifier, image: Int,title: String){
    Row (
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically
    ){

        Box (
            modifier = Modifier
                .size(40.dp)
                .clip(shape = RoundedCornerShape(8.dp))
                .background(color = Color(0xFFFFFFFF)),
            contentAlignment = Alignment.Center
        ){
            Icon(
                painter = painterResource(image),
                contentDescription = null,
                tint = Color.Unspecified,
            )
        }

        Text(
            text = title,
            fontFamily = IbmPlex,
            fontWeight = FontWeight.Medium,
            fontSize = 16.sp,
            lineHeight = 16.sp,
            color = Color(0xDE1F1F1E),
            modifier = Modifier
                .padding(start = 8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewRowCardItem(){
    RowCardItem(Modifier, R.drawable.sleep_place, "Change sleeping place")
}