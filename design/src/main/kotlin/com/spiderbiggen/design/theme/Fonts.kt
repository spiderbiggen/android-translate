package com.spiderbiggen.design.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.platform.Font

object Fonts {
    @Composable
    fun notoMono() = FontFamily(
        Font("fonts/noto-mono/NotoSansMono-Regular.ttf"),
        Font("fonts/noto-mono/NotoSansMono-Bold.ttf", FontWeight.Bold),
    )

    @Composable
    fun notoMonoCondensed() = FontFamily(
        Font("fonts/noto-mono/NotoSansMono_Condensed-Regular.ttf"),
        Font("fonts/noto-mono/NotoSansMono_Condensed-Bold.ttf", FontWeight.Bold),
    )

    @Composable
    fun notoMonoSemiCondensed() = FontFamily(
        Font("fonts/noto-mono/NotoSansMono_SemiCondensed-Regular.ttf"),
        Font("fonts/noto-mono/NotoSansMono_SemiCondensed-Bold.ttf", FontWeight.Bold),
    )

    @Composable
    fun notoSerif() = FontFamily(
        Font("fonts/noto-serif/NotoSerif-Regular.ttf"),
        Font("fonts/noto-serif/NotoSerif-Medium.ttf", FontWeight.Medium),
        Font("fonts/noto-serif/NotoSerif-MediumItalic.ttf", FontWeight.Medium, FontStyle.Italic),
        Font("fonts/noto-serif/NotoSerif-Bold.ttf", FontWeight.Bold),
        Font("fonts/noto-serif/NotoSerif-Italic.ttf", style = FontStyle.Italic),
        Font("fonts/noto-serif/NotoSerif-BoldItalic.ttf", FontWeight.Bold, FontStyle.Italic),
    )

    @Composable
    fun notoSans() = FontFamily(
        Font("fonts/noto-sans/NotoSans-Regular.ttf"),
        Font("fonts/noto-sans/NotoSans-Medium.ttf", FontWeight.Medium),
        Font("fonts/noto-sans/NotoSans-MediumItalic.ttf", FontWeight.Medium, FontStyle.Italic),
        Font("fonts/noto-sans/NotoSans-Bold.ttf", FontWeight.Bold),
        Font("fonts/noto-sans/NotoSans-Italic.ttf", style = FontStyle.Italic),
        Font("fonts/noto-sans/NotoSans-BoldItalic.ttf", FontWeight.Bold, FontStyle.Italic),
    )
}
