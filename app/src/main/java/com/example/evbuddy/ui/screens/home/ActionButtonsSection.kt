package com.example.evbuddy.ui.screens.home

import android.text.Layout
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import com.example.evbuddy.ui.components.CustomActionButton


@Composable
fun ActionButtonsSection() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
        CustomActionButton(
            text= "Find Fixed Charger",
            onClick = { }
        )

        CustomActionButton(
            text = "Find Mobile Power Driver",
            onClick = { }
        )

    }

}