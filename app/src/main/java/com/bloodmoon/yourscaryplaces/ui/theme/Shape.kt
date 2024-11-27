package com.bloodmoon.yourscaryplaces.ui.theme

import android.app.Dialog
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ShapeDefaults
import androidx.compose.material3.Shapes
import androidx.compose.ui.unit.dp

data class JetYouScaryPlacesShapes(
    val small: CornerBasedShape = ShapeDefaults.Small,
    val medium: CornerBasedShape = ShapeDefaults.Medium,
    val large: CornerBasedShape = ShapeDefaults.Large,
    val dialog: CornerBasedShape = ShapeDefaults.Small
)

val shapes = JetYouScaryPlacesShapes(
    small = RoundedCornerShape(8.dp),
    medium = RoundedCornerShape(16.dp),
    large = RoundedCornerShape(32.dp),
    dialog = RoundedCornerShape(8.dp)
)