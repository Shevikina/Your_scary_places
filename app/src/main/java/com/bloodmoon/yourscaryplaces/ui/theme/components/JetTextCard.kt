package com.bloodmoon.yourscaryplaces.ui.theme.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import com.bloodmoon.yourscaryplaces.R
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bloodmoon.yourscaryplaces.ui.theme.robotoFonts
import com.bloodmoon.yourscaryplaces.ui.theme.shapes

@Composable
fun JetTextCard(label: String, value: String, modifier: Modifier){
    Column(
        modifier = modifier
            .background(
                color = Color.DarkGray,
                shape = shapes.medium
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
            fontFamily = robotoFonts,
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onSecondary.copy(0.2f),
            text = label
        )
        Text(
            fontFamily = robotoFonts,
            fontSize = 17.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onSecondary.copy(0.7f),
            text = value,
            modifier = modifier.padding(6.dp)
        )
    }
}

@Preview(showSystemUi = false)
@Composable
fun JetTextCardPreview(){
        JetTextCard(
            label = stringResource(R.string.description),
            value = "We are happy to show you lost places in our endless galaxy. Fear and horror will follow you all the way. Only the most desperate travelers will be able to reach the end. You are ready?",
            modifier = Modifier
        )
}

