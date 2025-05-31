package com.joao.study.components

import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.joao.study.R

@Composable
fun Logo() {
    Icon(
        painter = painterResource(id = R.drawable.logo),
        contentDescription = null,
        tint = Color.Unspecified,
        modifier = Modifier.size(100.dp)
    )
}