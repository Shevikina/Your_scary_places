package com.bloodmoon.yourscaryplaces.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.Typography
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = PrimaryColor,
    secondary = SecondaryColor,
    surface = SurfaceColor,
    tertiary = Pink80,
    onPrimary = OnPrimaryColor,
    onSecondary = OnSecondaryColor,
    onSurface = OnSurfaceColor,
    background = BackgroundColor
)

private val LightColorScheme = lightColorScheme(
    primary = PrimaryColor,
    secondary = SecondaryColor,
    surface = SurfaceColor,
    tertiary = Pink40,
    onPrimary = OnPrimaryColor,
    onSecondary = OnSecondaryColor,
    onSurface = OnSurfaceColor,
    background = BackgroundColor
)

// CompositionLocal позволяет объявлять состояние на самом высоком уровне,
// а затем получать к нему доступ на любых нижних уровнях
// без необходимости передавать состояние через промежуточные дочерние элементы.

val LocalJetYourScaryPlacesColors = staticCompositionLocalOf<ColorScheme> {
    error("No colors provided")
}

val LocalJetYourScaryPlacesTypography = staticCompositionLocalOf<Typography> {
    error("No font provided")
}

val LocalJetYourScaryPlacesShape = staticCompositionLocalOf<JetYouScaryPlacesShapes> {
    error("No shapes provided")
}


object JetYourScaryPlacesTheme{ //вместо MaterialTheme
    val colorScheme: ColorScheme
        @Composable
        get() = LocalJetYourScaryPlacesColors.current

    val typography: Typography
        @Composable
        get() = LocalJetYourScaryPlacesTypography.current

    val shapes: JetYouScaryPlacesShapes
        @Composable
        get() = LocalJetYourScaryPlacesShape.current
}

@Composable
fun YourScaryPlacesTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) {
        DarkColorScheme
    } else {
        LightColorScheme
    }

// При вызове CompositionLocalProvider объекту ProvidableCompositionLocal передается некоторое
// значение с помощью слова provides
    CompositionLocalProvider(
        LocalJetYourScaryPlacesColors provides colorScheme,
        LocalJetYourScaryPlacesTypography provides typography,
        LocalJetYourScaryPlacesShape provides shapes,
        content = content
    )
}