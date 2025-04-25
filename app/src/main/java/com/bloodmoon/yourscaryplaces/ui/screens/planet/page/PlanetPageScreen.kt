package com.bloodmoon.yourscaryplaces.ui.screens.planet.page

import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavController
import com.bloodmoon.yourscaryplaces.data.local.Database
import com.bloodmoon.yourscaryplaces.ui.screens.planet.page.models.PlanetPageAction
import com.bloodmoon.yourscaryplaces.ui.screens.planet.page.models.PlanetPageEvent
import com.bloodmoon.yourscaryplaces.ui.screens.planet.page.views.PlanetPageViewDisplay
import com.bloodmoon.yourscaryplaces.ui.theme.components.JetDialog

@Composable
fun PlanetPageScreen(navController: NavController, planetId: Int) {
    val viewAction = remember { mutableStateOf<PlanetPageAction?>(null) }
    when (val action = viewAction.value) {
        is PlanetPageAction.ShowDialog -> {
            Dialog(onDismissRequest = { viewAction.value = null }) {
                JetDialog(
                    title = action.title,
                    body = action.body,
                    positiveButtonText = action.positiveButtonText,
                    negativeButtonText = action.negativeButtonText,
                    onApply = { viewAction.value = null },
                    onClose = { viewAction.value = null }
                )
            }
        }

        else -> {}
    }

    PlanetPageViewDisplay(planetInfo = Database.planetList.first { it.id == planetId }) { event ->
        when (event) {
            is PlanetPageEvent.CloseScreen -> {
                navController.popBackStack()
            }

            is PlanetPageEvent.ShowDialog -> {
                viewAction.value = PlanetPageAction.ShowDialog(
                    title = event.title,
                    body = event.body,
                    positiveButtonText = event.positiveButtonText,
                    negativeButtonText = event.negativeButtonText
                )
            }

            else -> {}
        }
    }
}