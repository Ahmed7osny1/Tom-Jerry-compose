package com.example.composable.tomkitchen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tomandjerry.ui.theme.BackgroundColorCard
import com.example.tomandjerry.ui.theme.CardColorText
import com.example.tomandjerry.ui.theme.CardColorTextNumber
import com.example.tomandjerry.ui.theme.CardColorTextNumberBorder
import com.example.tomandjerry.ui.theme.IbmPlex
import com.example.tomandjerry.ui.theme.TextTitleColorTomKitchen

@Composable
fun PreparationStepSection() {
    Column(
        modifier = Modifier.fillMaxWidth().background(Color.Transparent)
    ) {
        Text(
            text = "Preparation method",
            fontFamily = IbmPlex,
            fontWeight = FontWeight.Medium,
            fontSize = 18.sp,
            lineHeight = 32.sp,
            color = TextTitleColorTomKitchen,
            letterSpacing = 0.5.sp
        )

        Spacer(Modifier.height(8.dp))

        PreparationStepContainer(
            step = "Put the pasta in a toaster.", stepNumber = 1
        )

        Spacer(Modifier.height(10.dp))

        PreparationStepContainer(
            step = "Pour battery juice over it.", stepNumber = 2
        )

        Spacer(Modifier.height(10.dp))

        PreparationStepContainer(
            step = "Wait for the spark to ignite.", stepNumber = 3
        )

        Spacer(Modifier.height(10.dp))

        PreparationStepContainer(
            step = "Serve with an insulating glove.", stepNumber = 4
        )

        Spacer(Modifier.height(5.dp))
    }
}

@Composable
fun PreparationStepContainer(step: String, stepNumber: Int) {
    Box {
        Box(
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .fillMaxWidth()
                .height(37.dp)
                .background(
                    BackgroundColorCard, shape = RoundedCornerShape(
                        topEnd = 12.dp, bottomEnd = 12.dp, topStart = 100.dp, bottomStart = 100.dp
                    )
                )
                .padding(start = 46.dp),
            contentAlignment = Alignment.CenterStart,
        ) {
            Text(
                text = step,
                color = CardColorText,
                fontFamily = IbmPlex,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                lineHeight = 14.sp,
                letterSpacing = 0.5.sp
            )
        }
        Box(
            modifier = Modifier
                .size(37.dp)
                .clip(CircleShape)
                .border(
                    width = 1.dp, shape = CircleShape, color = CardColorTextNumberBorder
                )
                .background(color = BackgroundColorCard), contentAlignment = Alignment.Center
        ) {
            Text(
                text = "$stepNumber",
                color = CardColorTextNumber,
                fontFamily = IbmPlex,
                fontWeight = FontWeight(500),
                fontSize = 12.sp,
                lineHeight = 12.sp,
                letterSpacing = 0.5.sp
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPreparationStepSection() {
    PreparationStepSection()
}
