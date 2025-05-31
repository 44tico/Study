package com.joao.study.components

import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.joao.study.ui.theme.Gold
import com.joao.study.ui.theme.White20
import com.joao.study.ui.theme.White30
import com.joao.study.ui.theme.White50

@Composable
fun DefaultTextField(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    isPassword: Boolean = false
) {
    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        label = { Text(label) },
        visualTransformation = if (isPassword) PasswordVisualTransformation() else VisualTransformation.None,
        colors = OutlinedTextFieldDefaults.colors(
            focusedLabelColor = White30,
            focusedBorderColor = White30,
            focusedPlaceholderColor = White20,
            focusedTextColor = White50,
            cursorColor = Gold,
            unfocusedLabelColor = White30,
            unfocusedBorderColor = White30,
            unfocusedPlaceholderColor = White20,
            unfocusedTextColor = White50,
        ),
        modifier = modifier.width(320.dp),
        singleLine = true,
        shape = RoundedCornerShape(5.dp)
    )
}