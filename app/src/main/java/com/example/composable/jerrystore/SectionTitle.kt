package com.example.composable.jerrystore

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.ColorItem
import com.example.tomandjerry.ui.theme.IbmPlex
import com.example.tomandjerry.ui.theme.TextTitleColor

@Composable
fun SectionTitle() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
    ) {

        Text(
            text = "Cheap tom section",
            fontFamily = IbmPlex,
            fontWeight = FontWeight.SemiBold,
            fontSize = 20.sp,
            color = TextTitleColor,
            letterSpacing = 0.sp,
            lineHeight = 20.sp,
        )

        Spacer(Modifier.weight(1f))

        Row (
            modifier = Modifier
                .align(Alignment.CenterVertically)
        ) {
            Text(
                text = "View all",
                fontFamily = IbmPlex,
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp,
                color = ColorItem,
                letterSpacing = 0.sp,
                lineHeight = 12.sp,
            )
            Icon(
                painter = painterResource(R.drawable.back_icon),
                contentDescription = "Back Icon",
                modifier = Modifier
                    .padding(start = 4.dp)
                    .align(Alignment.CenterVertically),
                tint = Color.Unspecified
            )
        }

    }

}