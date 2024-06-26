package com.kolee.composemusicexoplayer.ui.theme

import androidx.compose.material.Colors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

val Colors.TextDefaultColor: Color
    @Composable get() = if (isLight) Color(0xFF4B4B4B) else Color(0xFFEEEEEE)
val Colors.TintDefaultColor: Color
    @Composable get() = if (isLight) Color(0xFF4B4B4B) else Color(0xFFEEEEEE)