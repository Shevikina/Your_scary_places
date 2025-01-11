package com.bloodmoon.yourscaryplaces.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import com.bloodmoon.yourscaryplaces.ui.theme.JetYourScaryPlacesTheme
import com.bloodmoon.yourscaryplaces.ui.theme.YourScaryPlacesTheme

@Composable
fun JetIconButton(
    vectorDrawableId: Int,
    shape: RoundedCornerShape,
    contentPadding: PaddingValues = PaddingValues(0.dp),
    modifier: Modifier = Modifier
) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .clip(shape)
            .background(JetYourScaryPlacesTheme.colorScheme.surface)
            .size(48.dp)
            .padding(contentPadding)
            .clickable{ println("Boop!") }
    ) {
        Icon(
            imageVector = ImageVector.vectorResource(id = vectorDrawableId),
            tint = JetYourScaryPlacesTheme.colorScheme.onSecondary,
            contentDescription = "icon",
            modifier = Modifier.fillMaxSize()
        )
    }
}

@Preview
@Composable
fun JetIconButtonPreview() {
    YourScaryPlacesTheme {
        JetIconButton(
            vectorDrawableId = com.microsoft.fluent.mobile.icons.R.drawable.ic_fluent_chevron_left_16_filled,
//            shape = JetYourScaryPlacesTheme.shapes.small, //разобраться поч не могу так сделать
            shape = RoundedCornerShape(8.dp),
            contentPadding = PaddingValues(12.dp),
            modifier = Modifier
        )
    }
}