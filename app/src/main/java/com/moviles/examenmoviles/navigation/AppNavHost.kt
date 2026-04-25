package com.moviles.examenmoviles.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.moviles.examenmoviles.data.mockCoworkingSpaces
import com.moviles.examenmoviles.ui.screens.spaces.SpaceDetailScreen
import com.moviles.examenmoviles.ui.screens.spaces.SpacesListScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier
) {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = AppDestinations.SPACES_LIST,
        modifier = modifier
    ) {
        composable(route = AppDestinations.SPACES_LIST) {
            SpacesListScreen(
                onSpaceClick = { space ->
                    navController.navigate(
                        AppDestinations.spaceDetailRoute(space.id)
                    )
                }
            )
        }

        composable(
            route = AppDestinations.SPACE_DETAIL_ROUTE,
            arguments = listOf(
                navArgument(AppDestinations.SPACE_ID_ARG) {
                    type = NavType.IntType
                }
            )
        ) { backStackEntry ->
            val spaceId = backStackEntry.arguments?.getInt(AppDestinations.SPACE_ID_ARG)
            val selectedSpace = mockCoworkingSpaces.firstOrNull { space ->
                space.id == spaceId
            } ?: mockCoworkingSpaces.first()

            SpaceDetailScreen(
                space = selectedSpace,
                onBackClick = {
                    navController.popBackStack()
                }
            )
        }
    }
}