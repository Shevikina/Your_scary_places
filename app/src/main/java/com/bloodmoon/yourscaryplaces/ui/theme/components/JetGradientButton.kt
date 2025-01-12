package com.bloodmoon.yourscaryplaces.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bloodmoon.yourscaryplaces.ui.theme.JetYourScaryPlacesTheme
import com.bloodmoon.yourscaryplaces.ui.theme.YourScaryPlacesTheme

@Composable
fun JetGradientButton(text: String, modifier: Modifier = Modifier, onClick: () -> Unit) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = modifier
            .clip(RoundedCornerShape(24.dp))
            .background(
                Brush.linearGradient(
                    listOf(
                        JetYourScaryPlacesTheme.colorScheme.background.copy(0.85f),
                        JetYourScaryPlacesTheme.colorScheme.secondary.copy(0.85f)
                    )
                )
            )
            .sizeIn(minHeight = 54.dp, minWidth = 366.dp)
            .clickable { onClick }
    ) {
        Text(
            text = text,
            style = JetYourScaryPlacesTheme.typography.bodyLarge
                .copy(fontWeight = FontWeight.Medium),
            color = JetYourScaryPlacesTheme.colorScheme.onSurface
        )
    }
}

@Preview(showBackground = true, backgroundColor = 0xFF1C1F1E)//primary
@Composable
fun JetGradientButtonPreview() {
    YourScaryPlacesTheme {
        JetGradientButton("Send an application") {
            println("BE SEND")
        }
    }
}