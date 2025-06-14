package com.example.tomandjerry

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.screens.JerryStore
import com.example.tomandjerry.ui.theme.LightGrayBackground
import com.example.tomandjerry.ui.theme.TomAndJerryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            TomAndJerryTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                )
                { innerPadding ->
                    JerryStore(
                        modifier = Modifier
                            .background(color = LightGrayBackground)
                            .padding(innerPadding)
                    )

//                    TomKitchen(
//                        modifier = Modifier
//                            .background(color = LightGrayBackground)
//                            .padding(innerPadding)
//                    )

//                    TomAccount(
//                        modifier = Modifier
//                            .background(color = LightGrayBackground)
//                            .padding(innerPadding)
//                    )
                }
            }
        }
    }
}