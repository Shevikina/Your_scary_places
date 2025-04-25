package com.bloodmoon.yourscaryplaces.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil3.compose.AsyncImage
import com.bloodmoon.yourscaryplaces.ui.screens.planets.models.PlanetInfo
import com.bloodmoon.yourscaryplaces.ui.theme.JetYourScaryPlacesTheme
import com.bloodmoon.yourscaryplaces.ui.theme.YourScaryPlacesTheme

@Composable
fun PlanetCard(
    info: PlanetInfo,
    modifier: Modifier = Modifier,
    onClick: (() -> Unit)? = null
) {
    if (info.rating > 5 || info.rating < 0 || info.label.isEmpty()) return

    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        AsyncImage(
            model = info.imagePath,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(136.dp)
                .clip(JetYourScaryPlacesTheme.shapes.large)
                .border(
                    3.dp,
                    JetYourScaryPlacesTheme.colorScheme.onSecondary,
                    JetYourScaryPlacesTheme.shapes.large
                )
                .background(Color.Gray)
                .let { if (onClick != null) it.clickable(onClick = onClick) else it }
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(16.dp, 10.dp)
        ) {
            Text(
                text = info.label,
                style = JetYourScaryPlacesTheme.typography.bodyLarge
                    .copy(fontWeight = FontWeight.Medium),
                color = JetYourScaryPlacesTheme.colorScheme.onSurface,
            )
            Spacer(modifier = Modifier.weight(1f))
            JetRatingBar(
                rating = info.rating,
                modifier = Modifier.height(16.dp)
            )
        }
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF1C1F1E)
@Composable
fun PlanetCardPreview() {
    YourScaryPlacesTheme {
        PlanetCard(
            PlanetInfo(
                label = "Ghost “Yenion”",
                rating = 3,
                imagePath = "file:///android_asset/App2_Image1.jpg"
            )
        )
    }
}