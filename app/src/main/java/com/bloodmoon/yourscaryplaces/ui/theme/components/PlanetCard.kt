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
import com.bloodmoon.yourscaryplaces.data.local.Database
import com.bloodmoon.yourscaryplaces.ui.screens.planets.models.PlanetInfo
import com.bloodmoon.yourscaryplaces.ui.theme.JetPlanetsTheme
import com.bloodmoon.yourscaryplaces.ui.theme.PlanetsTheme

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
                .clip(JetPlanetsTheme.shapes.large)
                .border(
                    3.dp,
                    JetPlanetsTheme.colorScheme.onSecondary,
                    JetPlanetsTheme.shapes.large
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
                style = JetPlanetsTheme.typography.bodyLarge
                    .copy(fontWeight = FontWeight.Medium),
                color = JetPlanetsTheme.colorScheme.onSurface,
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
    PlanetsTheme {
        PlanetCard(
            info = Database.planetList[0]
        )
    }
}