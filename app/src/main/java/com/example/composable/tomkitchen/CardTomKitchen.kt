package com.example.composable.tomkitchen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
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
import com.example.data.TomDetailsCard
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.CardColor
import com.example.tomandjerry.ui.theme.IbmPlex
import com.example.tomandjerry.ui.theme.TextDescriptionBoard37
import com.example.tomandjerry.ui.theme.TextDescriptionBoard60

@Composable
fun CardTomKitchen(
    modifier: Modifier, tomDetailsCard: TomDetailsCard
) {

    Box(
        modifier = modifier
            .width(104.dp)
            .clip(RoundedCornerShape(12.dp))
            .background(color = CardColor)
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().padding(bottom = 12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                painter = painterResource(tomDetailsCard.image),
                contentDescription = null,
                tint = Color.Unspecified,
                modifier = Modifier.padding(top = 14.dp)
            )
            Text(
                text = tomDetailsCard.feature,
                fontFamily = IbmPlex,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp,
                lineHeight = 14.sp,
                color = TextDescriptionBoard60,
                letterSpacing = 0.5.sp,
                modifier = Modifier.padding(top = 12.dp)
            )
            Text(
                text = tomDetailsCard.featureName,
                fontFamily = IbmPlex,
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp,
                lineHeight = 12.sp,
                color = TextDescriptionBoard37,
                letterSpacing = 0.5.sp,
                modifier = Modifier.padding(top = 2.dp)
            )

        }
    }

}

@Preview
@Composable
fun PreviewCardTomKitchen() {
    CardTomKitchen(
        Modifier, TomDetailsCard(
            R.drawable.temperature,
            "1000 V",
            "Temperature"
        )
    )
}