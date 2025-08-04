package com.example.evbuddy

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.evbuddy.ui.screens.home.DriversScreen
import com.example.evbuddy.ui.theme.EVBuddyTheme
import com.example.evbuddy.ui.screens.home.HomeScreen
//import com.example.evbuddy.ui.screens.home.DriversScreen
import com.example.evbuddy.ui.screens.profile.ProfileScreen
import com.example.evbuddy.ui.screens.requests.RequestsScreen

// Simple enum for navigation
enum class AppScreen {
    HOME,
    DRIVERS,
    PROFILE,
    REQUESTS
}

@Composable
fun EVBuddyApp(modifier: Modifier = Modifier) {
    // Simple state management - lifted state for the entire app
    var currentScreen by remember { mutableStateOf(AppScreen.HOME) }
    var selectedTab by remember { mutableStateOf(0) }

    // Simple navigation using when statement
    when (currentScreen) {
        AppScreen.HOME -> {
            HomeScreen(
                selectedTab = selectedTab,
                onTabSelected = { tab ->
                    selectedTab = tab
                    currentScreen = when (tab) {
                        0 -> AppScreen.HOME
                        1 -> AppScreen.REQUESTS
                        2 -> AppScreen.PROFILE
                        else -> AppScreen.HOME
                    }
                },
                onFindMobileDriver = {
                    currentScreen = AppScreen.DRIVERS
                }
            )
        }
        AppScreen.DRIVERS -> {
            DriversScreen(
                onBack = {
                    currentScreen = AppScreen.HOME
                    selectedTab = 0
                }
            )
        }
        AppScreen.PROFILE -> {
            ProfileScreen(
                selectedTab = selectedTab,
                onTabSelected = { tab ->
                    selectedTab = tab
                    currentScreen = when (tab) {
                        0 -> AppScreen.HOME
                        1 -> AppScreen.REQUESTS
                        2 -> AppScreen.PROFILE
                        else -> AppScreen.HOME
                    }
                }
            )
        }
        AppScreen.REQUESTS -> {
            RequestsScreen(
                selectedTab = selectedTab,
                onTabSelected = { tab ->
                    selectedTab = tab
                    currentScreen = when (tab) {
                        0 -> AppScreen.HOME
                        1 -> AppScreen.REQUESTS
                        2 -> AppScreen.PROFILE
                        else -> AppScreen.HOME
                    }
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun EVBuddyAppPreview() {
    EVBuddyTheme {
        EVBuddyApp()
    }
}