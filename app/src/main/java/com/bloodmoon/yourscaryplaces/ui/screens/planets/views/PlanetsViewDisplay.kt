package com.bloodmoon.yourscaryplaces.ui.screens.planets.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
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
    Box(modifier = Modifier.fillMaxSize().background(JetYourScaryPlacesTheme.colorScheme.primary))
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(24.dp),
        modifier = Modifier
            .background(JetYourScaryPlacesTheme.colorScheme.primary)
            .padding(24.dp)
            .verticalScroll(rememberScrollState())
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
        Spacer(modifier = Modifier.height(15.dp))
        PlanetCard(
            label = "Ghost “Yenion”",
            rating = 3,
            imageId = R.drawable.app2_image1
        )
        PlanetCard(
            label = "Destroyed platform",
            rating = 4,
            imageId = R.drawable.app2_image2
        )
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