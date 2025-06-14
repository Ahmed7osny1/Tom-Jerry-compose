package com.example.composable.jerrystore

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.ColorItem
import com.example.tomandjerry.ui.theme.IbmPlex
import com.example.tomandjerry.ui.theme.SearchTextColor

@Composable
fun HomeSearch() {

    Row (
        modifier = Modifier.fillMaxWidth()
    ) {

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .clip(RoundedCornerShape(12.dp))
                .background(Color(0xFFFFFFFF))
                .border(width = 1.dp,
                    shape = RoundedCornerShape(12.dp), color = Color(0x24A5A6A4)
                )
                .height(48.dp),
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 12.dp, vertical = 13.5.dp)
                    .background(color = Color(0xFFFFFFFF)),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(R.drawable.search_normal),
                    contentDescription = "Search",
                    tint = Color.Unspecified
                )

                Spacer(modifier = Modifier.width(10.25.dp))

                BasicTextField(
                    value = "",
                    onValueChange = {},
                    modifier = Modifier.fillMaxWidth(),
                    textStyle = LocalTextStyle.current
                        .copy(
                            fontSize = 14.sp,
                            color = SearchTextColor,
                            fontFamily = IbmPlex,
                            letterSpacing = 0.sp,
                            lineHeight = 14.sp,
                            fontWeight = FontWeight.Normal
                        ),
                    decorationBox = { innerTextField ->
                        if ("".isEmpty()) {
                            Text(
                                text = "Search about tom ...",
                                color = SearchTextColor,
                                fontSize = 14.sp,
                                letterSpacing = 0.sp,
                                lineHeight = 14.sp,
                                fontFamily = IbmPlex,
                                fontWeight = FontWeight.Normal
                            )
                        }
                        innerTextField()
                    }
                )
            }
        }

        Spacer(Modifier.width(8.dp))

        Box(
            modifier = Modifier
                .size(48.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(ColorItem),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painterResource(R.drawable.filter_horizontal),
                contentDescription = "filter_horizontal",
                tint = Color.Unspecified
            )
        }

    }

}
