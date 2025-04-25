package com.bloodmoon.yourscaryplaces.ui.theme.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.bloodmoon.yourscaryplaces.R
import com.bloodmoon.yourscaryplaces.ui.theme.JetPlanetsTheme
import com.bloodmoon.yourscaryplaces.ui.theme.PlanetsTheme

@Composable
fun JetTextCard(label: String, value: String, modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp),
        modifier = modifier
            .fillMaxWidth()
            .background(
                color = JetPlanetsTheme.colorScheme.surface,
                shape = JetPlanetsTheme.shapes.medium
            )
            .padding(24.dp, 12.dp, 24.dp, 24.dp)
    ) {
        Text(
            text = label,
            style = JetPlanetsTheme.typography.bodyMedium.copy(
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                lineHeight = 1.em,
                letterSpacing = 0.em
            ),
            color = JetPlanetsTheme.colorScheme.onSurface
        )
        Text(
            text = value,
            style = JetPlanetsTheme.typography.bodyMedium.copy(
                fontWeight = FontWeight.Bold
            ),
            color = JetPlanetsTheme.colorScheme.onSurface
        )
    }
}

@Preview(showSystemUi = false)
@Composable
fun JetTextCardPreview() {
    PlanetsTheme {
        JetTextCard(
            modifier = Modifier.size(366.dp, 165.dp),
            label = stringResource(R.string.description),
            value = "We are happy to show you lost places in our endless galaxy. Fear and horror will follow you all the way. Only the most desperate travelers will be able to reach the end. You are ready?"
        )
    }
}

