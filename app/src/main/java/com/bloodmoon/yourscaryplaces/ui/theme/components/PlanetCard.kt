package com.bloodmoon.yourscaryplaces.ui.theme.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
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
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bloodmoon.yourscaryplaces.R
import com.bloodmoon.yourscaryplaces.ui.theme.JetYourScaryPlacesTheme
import com.bloodmoon.yourscaryplaces.ui.theme.YourScaryPlacesTheme

@Composable
fun PlanetCard(label: String, rating: Int, imageId: Int, modifier: Modifier = Modifier) {
    if (rating > 5 || rating < 0 || label.isEmpty()) return

    Column(
        verticalArrangement = Arrangement.SpaceBetween,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
    ) {
        Image(
            painter = painterResource(id = imageId),
            contentDescription = "",
            modifier = Modifier
                .clip(JetYourScaryPlacesTheme.shapes.large)
                .border(
                    3.dp,
                    JetYourScaryPlacesTheme.colorScheme.onSecondary,
                    JetYourScaryPlacesTheme.shapes.large
                )
        )
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.padding(25.dp, 10.dp)
        ) {
            Text(
                text = label,
                style = JetYourScaryPlacesTheme.typography.bodyLarge
                    .copy(fontWeight = FontWeight.Medium),
                color = JetYourScaryPlacesTheme.colorScheme.onSurface,
            )
            Spacer(modifier = Modifier.weight(1f))
            JetRatingBar(
                rating = rating,
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
            label = "Ghost “Yenion”",
            rating = 3,
            imageId = R.drawable.app2_image1
        )
    }
}