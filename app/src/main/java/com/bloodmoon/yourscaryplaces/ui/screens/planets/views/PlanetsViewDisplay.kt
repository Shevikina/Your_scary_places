package com.bloodmoon.yourscaryplaces.ui.screens.planets.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bloodmoon.yourscaryplaces.ui.theme.JetYourScaryPlacesTheme
import com.bloodmoon.yourscaryplaces.ui.theme.YourScaryPlacesTheme
import com.bloodmoon.yourscaryplaces.ui.theme.components.PlanetCard
import com.bloodmoon.yourscaryplaces.R

@Composable
fun PlanetsViewDisplay() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
            .background(JetYourScaryPlacesTheme.colorScheme.primary)
            .padding(24.dp)
    ) {
        Text(
            text = "Startup \n“BloodMoon”",
            style = JetYourScaryPlacesTheme.typography.bodyLarge.copy(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center
            ),
            color = JetYourScaryPlacesTheme.colorScheme.onPrimary
        )
        Spacer(modifier = Modifier.height(39.dp))
        PlanetCard(
            label = "Ghost “Yenion”",
            rating = 3,
            imageId = R.drawable.app2_image1
        )
        Spacer(modifier = Modifier.height(24.dp))

        PlanetCard(
            label = "Destroyed platform",
            rating = 4,
            imageId = R.drawable.app2_image2
        )
        Spacer(modifier = Modifier.height(24.dp))

        PlanetCard(
            label = "Gold mine",
            rating = 5,
            imageId = R.drawable.app2_image3
        )
    }
}


@Preview
@Composable
fun PlanetsViewDisplayPreview() {
    YourScaryPlacesTheme { PlanetsViewDisplay() }
}