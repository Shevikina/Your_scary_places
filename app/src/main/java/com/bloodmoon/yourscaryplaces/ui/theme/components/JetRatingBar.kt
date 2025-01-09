package com.bloodmoon.yourscaryplaces.ui.theme.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import com.microsoft.fluent.mobile.icons.R
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bloodmoon.yourscaryplaces.ui.theme.JetYourScaryPlacesTheme
import com.bloodmoon.yourscaryplaces.ui.theme.YourScaryPlacesTheme

@Composable
fun JetStar(color:Color, modifier: Modifier = Modifier) {
    Icon(
        painter = painterResource(id = R.drawable.ic_fluent_star_32_filled),
        tint = color,
        contentDescription = "Icon with star",
        modifier = modifier.padding(2.dp)
    )
}
@Composable
fun JetRatingBar(rating:Int, modifier: Modifier = Modifier){
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        modifier = modifier.padding(5.dp)
    ){
        repeat(rating){JetStar(JetYourScaryPlacesTheme.colorScheme.onSecondary, modifier)}
        repeat(5-rating){JetStar(JetYourScaryPlacesTheme.colorScheme.surface, modifier)}
    }
}

@Preview(showBackground = false)
@Composable
fun JetRatingBarPreview(){
    YourScaryPlacesTheme{
        JetRatingBar(
            rating = 3,
            modifier = Modifier
        )
    }
}