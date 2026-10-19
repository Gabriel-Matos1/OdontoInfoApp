package com.example.odontoinfo.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = Branco,
    onPrimary = Preto,

    secondary = CinzaClaro,
    onSecondary = Preto,

    tertiary = CinzaMedio,
    onTertiary = Branco,

    background = Preto,
    onBackground = Branco,

    surface = Preto,
    onSurface = Branco,

    surfaceVariant = CinzaEscuro,
    outline = CinzaMedio
)

private val LightColorScheme = lightColorScheme(
    primary = Preto,
    onPrimary = Branco,

    secondary = CinzaMedio,
    onSecondary = Branco,

    tertiary = CinzaEscuro,
    onTertiary = Branco,

    background = Branco,
    onBackground = Preto,

    surface = Branco,
    onSurface = Preto,

    surfaceVariant = CinzaMuitoClaro,
    outline = CinzaClaro
)

@Composable
fun OdontoInfoTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}