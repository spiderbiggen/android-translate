package com.spiderbiggen.design.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.spiderbiggen.design.theme.Fonts
import com.spiderbiggen.design.theme.LocalDarkMode

@Composable
fun ProjectIcon(name: String, path: String) {
    val colors = remember {
        listOf(
            Color(path.lowercase().hashCode()).copy(alpha = 1f),
            Color(path.uppercase().hashCode()).copy(alpha = 1f),
        )
    }
    val iconCharacter = remember { derivedStateOf { name.substring(0, 1).uppercase() } }

    val isDarkMode = LocalDarkMode.current
    val bgLuminance = colors.map { it.luminance() }.average()
    val iconTextColor = if (bgLuminance > 0.4) {
        if (isDarkMode) {
            MaterialTheme.colorScheme.inverseOnSurface
        } else {
            MaterialTheme.colorScheme.onSurface
        }
    } else {
        if (isDarkMode) {
            MaterialTheme.colorScheme.onSurface
        } else {
            MaterialTheme.colorScheme.inverseOnSurface
        }
    }
    Box(
        modifier = Modifier.size(48.dp)
            .background(
                brush = Brush.linearGradient(colors),
                shape = RoundedCornerShape(8.dp)
            ),
        contentAlignment = Alignment.Center
    ) {
        Text(
            iconCharacter.value,
            fontWeight = FontWeight.Bold,
            color = iconTextColor,
            fontFamily = Fonts.notoSans()
        )
    }
}