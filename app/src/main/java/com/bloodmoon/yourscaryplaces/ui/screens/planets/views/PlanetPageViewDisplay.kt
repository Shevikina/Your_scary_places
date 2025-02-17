package com.bloodmoon.yourscaryplaces.ui.screens.planets.views

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
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
import com.bloodmoon.yourscaryplaces.ui.theme.JetYourScaryPlacesTheme
import com.bloodmoon.yourscaryplaces.ui.theme.YourScaryPlacesTheme
import com.bloodmoon.yourscaryplaces.ui.theme.components.JetGradientButton
import com.bloodmoon.yourscaryplaces.ui.theme.components.JetIconButton
import com.bloodmoon.yourscaryplaces.ui.theme.components.JetTextCard
import com.bloodmoon.yourscaryplaces.ui.theme.components.PlanetCard

@Composable
fun PlanetPageViewDisplay() {
    Column(
        verticalArrangement = Arrangement.spacedBy(24.dp),
        modifier = Modifier
            .background(JetYourScaryPlacesTheme.colorScheme.background)
            .padding(24.dp)
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        JetIconButton(
            vectorDrawableId = com.microsoft.fluent.mobile.icons.R.drawable.ic_fluent_chevron_left_16_filled,
            shape = JetYourScaryPlacesTheme.shapes.small,
            contentPadding = PaddingValues(12.dp)
        ) { println("Back") }
        Spacer(modifier = Modifier.height(14.dp))
        val cardLabel = "Ghost “Yenion”"
        Text(
            text = cardLabel,
            color = JetYourScaryPlacesTheme.colorScheme.onPrimary,
            style = JetYourScaryPlacesTheme.typography.bodyLarge.copy(
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold
            )
        )
        PlanetCard(
            label = cardLabel,
            rating = 3,
            imagePath = "file:///android_asset/App2_Image1.jpg"
        )
        JetTextCard(
            label = stringResource(R.string.description),
            value = "We are happy to show you lost places in our endless galaxy. Fear and horror will follow you all the way. Only the most desperate travelers will be able to reach the end. You are ready?"
        )
        Spacer(modifier = Modifier.weight(1f))
        JetGradientButton(stringResource(id = R.string.send_application)) {}
    }
}

@Preview
@Composable
fun PlanetPageViewDisplayPreview() {
    YourScaryPlacesTheme { PlanetPageViewDisplay() }
}