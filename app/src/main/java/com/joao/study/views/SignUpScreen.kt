package com.joao.study.views

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.firebase.Firebase
import com.joao.study.components.DefaultTextField
import com.joao.study.components.EnterButton
import com.joao.study.components.Logo
import com.joao.study.components.Options
import com.joao.study.ui.theme.Background
import com.joao.study.ui.theme.Gold

@Composable
fun SignUpScreen(navController: NavHostController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmPassword by remember { mutableStateOf("") }
    var termsAccepted by remember { mutableStateOf(false) }

    Column(
        modifier = Modifier.fillMaxSize().background(Background).padding(WindowInsets.safeDrawing.asPaddingValues()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Logo()

        Spacer(modifier = Modifier.height(25.dp))

        Text(
            text = "Cadastre-se agora",
            fontSize = 25.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(25.dp))

        DefaultTextField(
            value = email,
            onValueChange = { email = it },
            label = "E-mail",
            isPassword = false
        )

        Spacer(modifier = Modifier.height(15.dp))

        DefaultTextField(
            value = password,
            onValueChange = { password = it },
            label = "Senha",
            isPassword = true
        )

        Spacer(modifier = Modifier.height(15.dp))

        DefaultTextField(
            value = confirmPassword,
            onValueChange = { confirmPassword = it },
            label = "Confirme sua senha",
            isPassword = true
        )

        Spacer(modifier = Modifier.height(20.dp))

        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Checkbox(
                checked = termsAccepted,
                onCheckedChange = { termsAccepted = it },
                modifier = Modifier.size(20.dp).offset(y = (-1).dp),
                colors = CheckboxDefaults.colors(
                    checkedColor = Gold,
                    uncheckedColor = Gold
                )
            )
            Text(
                text = buildAnnotatedString {
                    withStyle(SpanStyle(fontWeight = FontWeight.ExtraBold)) {
                        append("Eu concordo com os ")
                    }
                    withStyle(SpanStyle(color = Gold, fontWeight = FontWeight.ExtraBold)) {
                        append("Termos de privacidade")
                    }
                },
                color = Color.White,
                modifier = Modifier.padding(start = 20.dp)
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        EnterButton(
            text = "Cadastrar",
            onClick = { TODO() }
        )

        Spacer(modifier = Modifier.height(20.dp))

        Options(
            onGoogleClick = { TODO() },
            onPhoneClick = { TODO() }
        )

        Spacer(modifier = Modifier.height(25.dp))

        Row {
            Text("Já tem uma conta?", color = Color.White, fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.width(4.dp))

            Text(
                text = "Entre",
                color = Gold,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.clickable {
                    navController.navigate("sign_in")
                }
            )
        }
    }
}

@Preview()
@Composable
fun SignUpScreenPreview() {
    Box(Modifier.fillMaxSize().background(Background)) {
        val navController = rememberNavController()
        SignUpScreen(navController)
    }
}
