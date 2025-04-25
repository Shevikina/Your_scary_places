package com.bloodmoon.yourscaryplaces.ui.theme.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import com.microsoft.fluent.mobile.icons.R
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bloodmoon.yourscaryplaces.ui.theme.JetPlanetsTheme
import com.bloodmoon.yourscaryplaces.ui.theme.PlanetsTheme

@Composable
fun JetStar(color: Color, modifier: Modifier = Modifier) {
    Icon(
        painter = painterResource(id = R.drawable.ic_fluent_star_24_filled),
        tint = color,
        contentDescription = "Icon with star",
        modifier = modifier
    )
}

@Composable
fun JetRatingBar(rating: Int, modifier: Modifier = Modifier) {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier
    ) {
        repeat(rating) { JetStar(JetPlanetsTheme.colorScheme.onSecondary) }
        repeat(5 - rating) { JetStar(JetPlanetsTheme.colorScheme.surface) }
    }
}

@Preview(showBackground = false)
@Composable
fun JetRatingBarPreview() {
    PlanetsTheme {
        JetRatingBar(
            rating = 3,
            modifier = Modifier
                .height(16.dp)
        )
    }
}