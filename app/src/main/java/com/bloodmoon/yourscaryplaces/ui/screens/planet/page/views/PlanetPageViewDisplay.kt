package com.bloodmoon.yourscaryplaces.ui.screens.planet.page.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bloodmoon.yourscaryplaces.R
import com.bloodmoon.yourscaryplaces.ui.screens.planet.page.models.PlanetPageEvent
import com.bloodmoon.yourscaryplaces.ui.screens.planets.models.PlanetInfo
import com.bloodmoon.yourscaryplaces.ui.theme.JetPlanetsTheme
import com.bloodmoon.yourscaryplaces.ui.theme.PlanetsTheme
import com.bloodmoon.yourscaryplaces.ui.theme.components.JetGradientButton
import com.bloodmoon.yourscaryplaces.ui.theme.components.JetIconButton
import com.bloodmoon.yourscaryplaces.ui.theme.components.JetTextCard
import com.bloodmoon.yourscaryplaces.ui.theme.components.PlanetCard

@Composable
fun PlanetPageViewDisplay(planetInfo: PlanetInfo, dispatcher: (PlanetPageEvent) -> Unit) {
    Column(
        verticalArrangement = Arrangement.spacedBy(24.dp),
        modifier = Modifier
            .background(JetPlanetsTheme.colorScheme.background)
            .padding(24.dp)
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        JetIconButton(
            vectorDrawableId = com.microsoft.fluent.mobile.icons.R.drawable.ic_fluent_chevron_left_16_filled,
            shape = JetPlanetsTheme.shapes.small,
            contentPadding = PaddingValues(12.dp)
        ) { dispatcher.invoke(PlanetPageEvent.CloseScreen) }
        Spacer(modifier = Modifier.height(14.dp))

        Text(
            text = planetInfo.label,
            color = JetPlanetsTheme.colorScheme.onPrimary,
            style = JetPlanetsTheme.typography.bodyLarge.copy(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        )
        PlanetCard(planetInfo)
        JetTextCard(
            label = stringResource(R.string.description),
            value = planetInfo.description
        )
        Spacer(modifier = Modifier.weight(1f))
        JetGradientButton(
            text = stringResource(id = R.string.send_application),
            modifier = Modifier.fillMaxWidth(),
            onClick = {
                dispatcher.invoke(
                    PlanetPageEvent.ShowDialog(
                        title = "Tour details",
                        body = "Name: ${planetInfo.label}\nDate: Tommorow",
                        positiveButtonText = "Apply",
                        negativeButtonText = "Cancel"
                    )
                )
            }
        )
    }
}

@Preview
@Composable
fun PlanetPageViewDisplayPreview() {
    PlanetsTheme {
        PlanetPageViewDisplay(
            PlanetInfo(
                id = 0,
                label = "Ghost “Yenion”",
                rating = 3,
                imagePath = "file:///android_asset/App2_Image1.jpg"
            )
        ) {}
    }
}