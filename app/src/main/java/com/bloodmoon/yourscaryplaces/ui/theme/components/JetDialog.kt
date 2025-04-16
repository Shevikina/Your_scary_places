package com.bloodmoon.yourscaryplaces.ui.theme.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.bloodmoon.yourscaryplaces.ui.theme.JetYourScaryPlacesTheme
import com.bloodmoon.yourscaryplaces.ui.theme.YourScaryPlacesTheme
import com.bloodmoon.yourscaryplaces.utils.advancedShadow

@Composable
fun JetDialog(
    title: String = "Tour details",
    body: String = "Name ...",
    positiveButtonText: String = "Apply",
    negativeButtonText: String = "Cancel",
    onApply: () -> Unit,
    onClose: () -> Unit
) {
    val roundedRadius = 8.dp

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .width(381.dp)
            .advancedShadow(
                alpha = 0.1f,
                offsetY = 4.dp,
                shadowBlurRadius = 4.dp,
                cornersRadius = roundedRadius
            )
            .background(
                color = JetYourScaryPlacesTheme.colorScheme.primary,
                shape = JetYourScaryPlacesTheme.shapes.dialog
            )
            .padding(top = 19.dp)
    ) {
        Column(Modifier.width(IntrinsicSize.Max)) {
            Text(
                text = title,
                style = JetYourScaryPlacesTheme.typography.bodyLarge.copy(
                    fontWeight = FontWeight.Bold,
                    color = JetYourScaryPlacesTheme.colorScheme.onSurface
                ),
                modifier = Modifier.padding(horizontal = 15.dp)
            )
            Divider(color = JetYourScaryPlacesTheme.colorScheme.onSurface)
        }

        Spacer(modifier = Modifier.height(9.dp))

        Text(
            text = body,
            style = JetYourScaryPlacesTheme.typography.bodyLarge.copy(
                fontSize = 14.sp,
                color = JetYourScaryPlacesTheme.colorScheme.onSurface,
                textAlign = TextAlign.Center,
                letterSpacing = 0.em,
                lineHeight = 1.em
            )
        )

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center,
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = JetYourScaryPlacesTheme.colorScheme.onPrimary,
                    shape = RoundedCornerShape(
                        bottomStart = roundedRadius,
                        bottomEnd = roundedRadius
                    )
                )
        ) {
            Button(
                onClick = onApply,
                shape = RoundedCornerShape(bottomStart = roundedRadius),
                colors = ButtonDefaults.textButtonColors(
                    containerColor = Color.Transparent,
                    contentColor = JetYourScaryPlacesTheme.colorScheme.onSecondary
                ),
                modifier = Modifier
                    .fillMaxWidth(0.5f)
                    .heightIn(min = 48.dp)

            ) {
                Text(
                    positiveButtonText,
                    style = JetYourScaryPlacesTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold)
                )
            }
            Button(
                onClick = onClose,
                shape = RoundedCornerShape(bottomEnd = roundedRadius),
                colors = ButtonDefaults.textButtonColors(
                    containerColor = Color.Transparent,
                    contentColor = JetYourScaryPlacesTheme.colorScheme.primary
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(min = 48.dp)
            ) {
                Text(
                    negativeButtonText,
                    style = JetYourScaryPlacesTheme.typography.bodyLarge.copy(fontWeight = FontWeight.Bold)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun JetDialogPreview() {
    YourScaryPlacesTheme {
        JetDialog(
            title = "Tour details",
            body = "Name: Ghost “Yenion”\nDate: Tommorow",
            positiveButtonText = "Apply",
            negativeButtonText = "Cancel",
            onApply = { Log.i("My", "Apply") },
            onClose = { Log.i("My", "Close") }
        )
    }
}