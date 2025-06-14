package com.example.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composable.tomaccount.BodyItems
import com.example.composable.tomaccount.CardFinalData
import com.example.composable.tomaccount.CardItemTomAccount
import com.example.composable.tomaccount.TopSectionTomAccount
import com.example.tomandjerry.R
import com.example.tomandjerry.ui.theme.IbmPlex

@Composable
fun TomAccount(modifier: Modifier) {

    Box(
        modifier = modifier
            .fillMaxSize()
            .clipToBounds()
            .verticalScroll(rememberScrollState())
            .background(color = Color(0xFFEEF4F6))
    ) {

        TopSectionTomAccount()

        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 166.dp)
                .clip(shape = RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp))

        ) {

            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .background(color = Color(0xFFEEF4F6))
            ) {

                CardItemTomAccount()

                BodyItems(
                    modifier = Modifier
                        .padding(top = 24.dp, start = 16.dp)
                        .fillMaxWidth(),
                    title = "Tom settings",
                    listOf(
                        CardFinalData(
                            R.drawable.sleep_place,
                            "Change sleeping place"
                        ),
                        CardFinalData(
                            R.drawable.meow,
                            "Meow settings"
                        ),
                        CardFinalData(
                            R.drawable.password,
                            "Password to open the fridge"
                        ),
                    )
                )

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 12.dp)
                        .height(1.dp)
                        .border(
                            width = 1.dp, color = Color(0x14001A1F)
                        )
                )

                BodyItems(
                    modifier = Modifier
                        .padding(top = 12.dp, start = 16.dp)
                        .fillMaxWidth(),
                    title = "His favorite foods",
                    listOf(
                        CardFinalData(
                            R.drawable.mouses,
                            "Mouses"
                        ),
                        CardFinalData(
                            R.drawable.meal,
                            "Last stolen meal"
                        ),
                        CardFinalData(
                            R.drawable.sleep_mode,
                            "Change sleep mood"
                        ),
                    )
                )

                Text(
                    text = "v.TomBeta",
                    fontFamily = IbmPlex,
                    fontWeight = FontWeight.Normal,
                    fontSize = 12.sp,
                    lineHeight = 12.sp,
                    color = Color(0x99121212),
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(top = 24.dp)
                )

                Spacer(Modifier.height(20.dp))

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewTomAccount() {
    TomAccount(modifier = Modifier)
}