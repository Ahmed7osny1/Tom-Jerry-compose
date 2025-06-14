package com.example.composable.jerrystore

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.CardData
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.BackgroundBtnCardColor
import com.example.tomandjerry.ui.theme.ColorItem
import com.example.tomandjerry.ui.theme.IbmPlex
import com.example.tomandjerry.ui.theme.TextSubTitleCardColor
import com.example.tomandjerry.ui.theme.TextTitleColor

@Composable
fun CardItem(tomCard: CardData) {

    Box(
        modifier = Modifier.size(160.dp, 219.dp),
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 16.dp)
                .background(
                    color = Color.White, shape = RoundedCornerShape(16.dp)
                ),
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(
                        top = 85.dp, start = 8.dp, end = 8.dp, bottom = 8.dp
                    ), horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = tomCard.title,
                    textAlign = TextAlign.Center,
                    fontFamily = IbmPlex,
                    fontSize = 18.sp,
                    letterSpacing = 0.sp,
                    lineHeight = 18.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = TextTitleColor
                )
                Text(
                    text = tomCard.description,
                    textAlign = TextAlign.Center,
                    fontFamily = IbmPlex,
                    fontSize = 12.sp,
                    letterSpacing = 0.sp,
                    lineHeight = 18.sp,
                    fontWeight = FontWeight.Normal,
                    color = TextSubTitleCardColor
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp, horizontal = 8.dp)
                    .height(30.dp)
                    .align(Alignment.BottomCenter)
                    .background(color = Color.White),
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(4f)
                        .clip(RoundedCornerShape(8.dp))
                        .background(BackgroundBtnCardColor)
                ) {
                    Row(
                        modifier = Modifier.fillMaxSize(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.coin),
                            contentDescription = "coin",
                            tint = Color.Unspecified
                        )
                        Text(
                            text = buildAnnotatedString {
                                if (tomCard.offerNumberOfCheese > 0) {
                                    withStyle(
                                        style = SpanStyle(textDecoration = TextDecoration.LineThrough)
                                    ) {
                                        append("${tomCard.numberOfCheese}")
                                    }
                                    append(" ${tomCard.offerNumberOfCheese} cheeses")
                                } else {
                                    append("${tomCard.numberOfCheese} cheeses")
                                }
                            },
                            fontFamily = IbmPlex,
                            fontWeight = FontWeight.Medium,
                            fontSize = 12.sp,
                            color = ColorItem,
                            letterSpacing = 0.sp,
                            lineHeight = 12.sp,
                            modifier = Modifier.padding(start = 4.dp)
                        )
                    }
                }

                Spacer(Modifier.width(8.dp))

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .weight(1f)
                        .clip(RoundedCornerShape(8.dp))
                        .border(
                            width = 1.dp, shape = RoundedCornerShape(8.dp), color = ColorItem
                        )
                ) {
                    Icon(
                        painter = painterResource(R.drawable.sell),
                        contentDescription = "sell",
                        modifier = Modifier.align(Alignment.Center),
                        tint = Color.Unspecified

                    )
                }

            }
        }

        Box(
            modifier = Modifier.align(Alignment.TopCenter),
        ) {
            Image(
                painter = painterResource(tomCard.image),
                contentDescription = "Card Image",
                modifier = Modifier
                    .size(100.dp)
                    .align(Alignment.TopCenter)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewCardItem() {
    CardItem(
        CardData(
            R.drawable.tom_bomb,
            "Sport Tom",
            "He runs 1 meter... trips over his boot.",
            numberOfCheese = 5,
            offerNumberOfCheese = 3
        )
    )
}