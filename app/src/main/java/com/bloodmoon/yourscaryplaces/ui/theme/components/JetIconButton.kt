package com.bloodmoon.yourscaryplaces.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bloodmoon.yourscaryplaces.ui.theme.JetPlanetsTheme
import com.bloodmoon.yourscaryplaces.ui.theme.PlanetsTheme

@Composable
fun JetIconButton(
    vectorDrawableId: Int,
    shape: CornerBasedShape,
    modifier: Modifier = Modifier,
    contentPadding: PaddingValues = PaddingValues(0.dp),
    onClick: () -> Unit
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .background(JetPlanetsTheme.colorScheme.surface, shape)
            .sizeIn(48.dp, 48.dp)
            .clip(shape)
            .clickable(onClick = onClick)
            .padding(contentPadding)
    ) {
        Icon(
            imageVector = ImageVector.vectorResource(id = vectorDrawableId),
            tint = JetPlanetsTheme.colorScheme.onSecondary,
            contentDescription = "icon"
        )
    }
}

@Preview
@Composable
fun JetIconButtonPreview() {
    PlanetsTheme {
        JetIconButton(
            vectorDrawableId = com.microsoft.fluent.mobile.icons.R.drawable.ic_fluent_chevron_left_16_filled,
            shape = RoundedCornerShape(8.dp),
            contentPadding = PaddingValues(12.dp),
            modifier = Modifier
        ) {
            println("Boop!")
        }
    }
}