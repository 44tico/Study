package com.joao.study.components

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.joao.study.R
import com.joao.study.ui.theme.BackgroundButton
import com.joao.study.ui.theme.White30

@Composable
fun Options() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Box(
            modifier = Modifier.size(55.dp).background(color = BackgroundButton)
                .border(
                    width = 2.dp,
                    color = White30,
                    shape = RoundedCornerShape(10.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            IconButton(onClick = { TODO() }) {
                Icon(
                    painter = painterResource(id = R.drawable.google_icon),
                    contentDescription = null,
                    tint = Color.Unspecified,
                    modifier = Modifier.size(20.dp)
                )
            }
        }

        Box(
            modifier = Modifier.size(55.dp).background(color = BackgroundButton)
                .border(
                    width = 2.dp,
                    color = White30,
                    shape = RoundedCornerShape(10.dp)
                ),
            contentAlignment = Alignment.Center
        ) {
            IconButton(onClick = { TODO() }) {
                Icon(
                    painter = painterResource(id = R.drawable.phone_icon),
                    contentDescription = null,
                    tint = Color.Unspecified,
                    modifier = Modifier.size(25.dp)
                )
            }
        }
    }
}