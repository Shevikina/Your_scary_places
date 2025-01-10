package com.bloodmoon.yourscaryplaces.ui.theme.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import com.bloodmoon.yourscaryplaces.R
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bloodmoon.yourscaryplaces.ui.theme.JetYourScaryPlacesTheme
import com.bloodmoon.yourscaryplaces.ui.theme.YourScaryPlacesTheme

@Composable
fun JetTextCard(label: String, value: String, modifier: Modifier){
    Column(
        modifier = modifier
            .background(
                color = JetYourScaryPlacesTheme.colorScheme.surface,
                shape = JetYourScaryPlacesTheme.shapes.medium
            )
            .padding(
                start = 24.dp,
                end = 24.dp,
                bottom = 24.dp,
                top = 14.dp
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(2.dp)
    ){
        Text(
            text = label,
            style = JetYourScaryPlacesTheme.typography.bodyMedium.copy(
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            ),
            color = JetYourScaryPlacesTheme.colorScheme.onSurface
        )
        Text(
            text = value,
            style = JetYourScaryPlacesTheme.typography.bodyMedium.copy(
                fontSize = 17.sp,
                fontWeight = FontWeight.Bold
            ),
            color = JetYourScaryPlacesTheme.colorScheme.onSurface,
            modifier = modifier.padding(6.dp)
        )
    }
}

@Preview(showSystemUi = false)
@Composable
fun JetTextCardPreview(){
    YourScaryPlacesTheme{
        JetTextCard(
            label = stringResource(R.string.description),
            value = "We are happy to show you lost places in our endless galaxy. Fear and horror will follow you all the way. Only the most desperate travelers will be able to reach the end. You are ready?",
            modifier = Modifier
        )
    }
}

