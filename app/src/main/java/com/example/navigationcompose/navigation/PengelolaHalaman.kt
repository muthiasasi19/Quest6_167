package com.example.navigationcompose.navigation

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationcompose.ui.view.screen.MahasiswaFormView
import com.example.navigationcompose.ui.view.screen.SplashView
import com.example.navigationcompose.ui.view.viewmodel.MahasiswaViewModel

enum class Halaman {
    Splash,
    Mahasiswa
}

@Composable
fun MahasiswaApp(
    mahasiswaViewModel: MahasiswaViewModel = viewModel(),
    RencanaStudyViewModel: RencanaStudyViewModel = viewModel(),
    navController: NavHostController = rememberNavController()
){

    val mahasiswaUiState = mahasiswaViewModel.mahasiswaUiState.collectAsState().value
    val rencanaStudiUiState = RencanaStudyViewModel.krsStateUi.collectAsState().value


    NavHost(
        navController = navController,
        startDestination = Halaman.Splash.name,
        modifier = Modifier.padding()

    ) {
        composable(route = Halaman.Splash.name) {
            SplashView (onMulaiButton = {
                navController.navigate(Halaman.Mahasiswa.name)
                })
        }


    }
}