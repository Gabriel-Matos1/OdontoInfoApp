package com.example.odontoinfo.adaptative

import android.icu.number.IntegerWidth
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
enum class WindowSize {
    COMPACT_WINDOW_SIZE,
    MEDIUM_WINDOW_SIZE,
    BIG_WINDOW_SIZE
}


fun WindowClassification(width: Dp): WindowSize{
    return when {
        width < 600.dp -> WindowSize.COMPACT_WINDOW_SIZE
        width < 840.dp -> WindowSize.MEDIUM_WINDOW_SIZE
        else -> WindowSize.BIG_WINDOW_SIZE
    }
}

