package com.bloodmoon.yourscaryplaces.ui.screens.planets

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavController
import com.bloodmoon.yourscaryplaces.ui.navigation.NavScreen
import com.bloodmoon.yourscaryplaces.ui.screens.planets.models.PlanetsAction
import com.bloodmoon.yourscaryplaces.ui.screens.planets.models.PlanetsEvent
import com.bloodmoon.yourscaryplaces.ui.screens.planets.views.PlanetsViewDisplay
import com.bloodmoon.yourscaryplaces.ui.theme.components.JetDialog

@Composable
fun PlanetsScreen(navController: NavController) {
    val viewAction = remember { mutableStateOf<PlanetsAction?>(null) }
    when (val action = viewAction.value) {
        is PlanetsAction.ShowDialog -> {
            Dialog(onDismissRequest = { viewAction.value = null }) {
                JetDialog(
                    title = action.title,
                    body = action.body,
                    positiveButtonText = action.positiveButtonText,
                    negativeButtonText = action.negativeButtonText,
                    onApply = {},
                    onClose = { viewAction.value = null }
                )
            }
        }

        else -> {}
    }

    PlanetsViewDisplay { event ->
        when (event) {
            is PlanetsEvent.OpenPlanetPageScreen -> {
                navController.navigate(NavScreen.TouristPlanetPage(event.planetInfoId))
            }

            else -> {}
        }
    }
}