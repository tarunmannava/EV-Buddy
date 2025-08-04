package com.example.evbuddy.ui.screens.home

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DirectionsCar
import androidx.compose.material.icons.filled.FlashOn
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.evbuddy.ui.components.CustomActionButton

@Composable
fun ActionButtonsSection(
    onFindMobileDriver: () -> Unit = {}
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        CustomActionButton(
            text = "Find Fixed Charger",
            onClick = {

                println("Find Fixed Charger clicked") // Debug log
            },
            icon = {
                Row {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                }
            }
        )

        CustomActionButton(
            text = "Find Mobile Power Driver",
            onClick = {
                println("Find Mobile Power Driver clicked") // Debug log
                onFindMobileDriver() // This should navigate to drivers screen
            },
            icon = {
                Row {
                    Icon(
                        imageVector = Icons.Default.DirectionsCar,
                        contentDescription = null
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                }
            }
        )
    }
}