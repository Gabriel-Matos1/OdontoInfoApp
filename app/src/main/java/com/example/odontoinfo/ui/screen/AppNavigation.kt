package com.example.odontoinfo.ui.screen

import androidx.annotation.DrawableRes
import androidx.compose.foundation.layout.padding

import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.odontoinfo.R
import com.example.odontoinfo.ui.theme.Branco

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = backStackEntry?.destination?.route

    Scaffold(

        containerColor = Branco,

        bottomBar = {
            NavigationBar {
                NavigationBarItem(
                    selected = currentRoute == "HomeScreen",
                    onClick = {
                        navController.navigate("HomeScreen") {
                            launchSingleTop = true
                        }
                    },
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.icon_book),
                            contentDescription = "book"
                        )
                    }
                )

                NavigationBarItem(
                    selected = currentRoute == "ExplorarScreen",
                    onClick = {
                        navController.navigate("ExplorarScreen") {
                            launchSingleTop = true
                        }
                    },
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.icon_3d),
                                    contentDescription = "3D"
                        )
                    }
                )


                NavigationBarItem(
                    selected = currentRoute == "QuizHomeScreen",
                    onClick = {
                        navController.navigate("QuizHomeScreen") {
                            launchSingleTop = true
                        }
                    },
                    icon = {
                        Icon(
                            painter = painterResource(R.drawable.icon_game),
                            contentDescription = "Quiz"
                        )
                    }
                )
            }
        }
    ) { innerPadding ->

        NavHost(
            navController = navController,
            startDestination = "HomeScreen",
            modifier = androidx.compose.ui.Modifier
                .padding(innerPadding)
        ) {
            composable("HomeScreen") {
                HomeScreen(
                    onHomeClick = {},
                    onBookClick = {},
                    onQuizHomeClick = {}
                )
            }

            composable("BookScreen") {
               BookScreen(
                    onBookClick = {}
                )
            }
            composable("QuizHomeScreen") {
                QuizHomeScreen (
                    onQuizHomeClick = {}
                )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun AppNavigationPreview(){
    AppNavigation()
}