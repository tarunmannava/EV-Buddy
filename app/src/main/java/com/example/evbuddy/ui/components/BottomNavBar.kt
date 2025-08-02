package com.example.evbuddy.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.NavigationBar

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector


@Composable
fun BottomNavBar(
    selectedTab: Int = 0,
    onTabSelected: (Int) -> Unit = {}
) {
    val tabs = listOf(
        BottomNavItem("Home", Icons.Default.Home),
        BottomNavItem("My Requests", Icons.Default.List),
        BottomNavItem("Profile", Icons.Default.Person)
    )

    NavigationBar {
        tabs.forEachIndexed { index, item ->
            NavigationBarItem(
                icon= {
                   Icon(
                       imageVector = item.icon,
                       contentDescription = item.title
                   )
                },
                label = {Text(item.title)},
                selected = selectedTab ==index,
                onClick = { onTabSelected(index) }
            )
        }
    }
}

data class BottomNavItem(
    val title: String,
    val icon: ImageVector
)