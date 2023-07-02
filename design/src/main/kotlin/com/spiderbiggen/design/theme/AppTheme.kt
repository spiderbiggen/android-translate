package com.spiderbiggen.design.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.compositionLocalOf

val LocalDarkMode = compositionLocalOf { false }

@Composable
fun AppTheme(
    useDarkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (!useDarkTheme) lightColorScheme() else darkColorScheme()
    CompositionLocalProvider(LocalDarkMode provides useDarkTheme) {
        MaterialTheme(
            colorScheme = colorScheme,
            content = content
        )
    }
}