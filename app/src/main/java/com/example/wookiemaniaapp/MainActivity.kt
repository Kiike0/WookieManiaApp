package com.example.wookiemaniaapp

import android.os.Bundle
import android.view.WindowManager
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.core.view.WindowCompat
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.wookiemaniaapp.navigation.Routes
import com.example.wookiemaniaapp.ui.theme.WookieManiaAppTheme
import com.example.wookiemaniaapp.ui.views.FirstScreenView
import com.example.wookiemaniaapp.ui.views.HomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Para ocultar la barra "toolbar" de arriba del movil
        WindowCompat.setDecorFitsSystemWindows(window, false)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,
            WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS
        )

        setContent {
            WookieManiaAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()

                    NavHost(
                        navController = navController,
                        startDestination = Routes.FirstScreen.route
                    ) {
                        composable(Routes.FirstScreen.route) {
                            FirstScreenView(
                                navController = navController
                            )
                        }
                        composable(Routes.Home.route) {
                            HomeScreen(
                                navController = navController
                            )
                        }
                    }
                }
            }
        }
    }
}