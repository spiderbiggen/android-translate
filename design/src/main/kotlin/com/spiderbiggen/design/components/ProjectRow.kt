package com.spiderbiggen.design.components

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.spiderbiggen.design.theme.AppTheme
import com.spiderbiggen.design.theme.Fonts

@Composable
fun ProjectRow(name: String, path: String, modifier: Modifier = Modifier) {
    Surface(
        modifier,
        shape = RoundedCornerShape(8.dp),
        tonalElevation = 4.dp,
        shadowElevation = 4.dp,
    ) {
        Row(
            Modifier.padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            ProjectIcon(name, path)
            Column(
                Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                Text(
                    name,
                    style = MaterialTheme.typography.headlineSmall,
                    lineHeight = MaterialTheme.typography.headlineSmall.fontSize,
                    fontFamily = Fonts.notoSans()
                )
                Text(
                    path,
                    style = MaterialTheme.typography.labelLarge,
                    lineHeight = MaterialTheme.typography.labelLarge.fontSize,
                    fontFamily = Fonts.notoMonoSemiCondensed()
                )
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun previewProjectRow() {
    Column {
        val paddingSize = 16.dp
        Box(Modifier.weight(1f)) {
            AppTheme(true) {
                Scaffold {
                    Column(
                        Modifier.padding(paddingSize),
                        verticalArrangement = Arrangement.spacedBy(paddingSize)
                    ) {
                        ProjectRow(
                            name = "Translate",
                            path = "C:\\Users\\spiderbiggen\\projects\\translate"
                        )
                        ProjectRow(
                            name = "Translate",
                            path = "C:\\Users\\spiderbig\\projects\\translate"
                        )
                    }
                }
            }
        }
        Box(Modifier.weight(1f)) {
            AppTheme(false) {
                Scaffold {
                    Column(
                        Modifier.padding(paddingSize),
                        verticalArrangement = Arrangement.spacedBy(paddingSize)
                    ) {
                        ProjectRow(
                            name = "Translate",
                            path = "C:\\Users\\spiderbiggen\\projects\\translate"
                        )
                        ProjectRow(
                            name = "Translate",
                            path = "C:\\Users\\spiderbig\\projects\\translate"
                        )
                    }
                }
            }
        }
    }
}