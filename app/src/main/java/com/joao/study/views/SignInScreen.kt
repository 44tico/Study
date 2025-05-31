package com.joao.study.views

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.joao.study.R
import com.joao.study.ui.theme.Background
import com.joao.study.ui.theme.BackgroundButton
import com.joao.study.ui.theme.Gold
import com.joao.study.ui.theme.White50
import com.joao.study.ui.theme.White30
import com.joao.study.ui.theme.White20

@Composable
fun ForgotPasswordText(onSenhaClick: () -> Unit) {
    Row {
        Text(
            text = "Esqueceu sua ",
            color = Color.White
        )

        Text(
            text = "senha",
            color = Gold,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.clickable { onSenhaClick() }
        )

        Text(
            text = "?",
            color = Color.White
        )
    }
}

@Composable
fun SignUp(onSignUpClick: () -> Unit) {
    Row {
        Text("Não tem uma conta?", color = Color.White)

        Spacer(modifier = Modifier.width(4.dp))

        Text(
            text = "Cadastre-se",
            color = Gold,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.clickable { onSignUpClick() }
        )
    }
}

@Composable
fun SignInScreen(){
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier.fillMaxSize().background(Background).padding(WindowInsets.safeDrawing.asPaddingValues()),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = null,
            tint = Color.Unspecified,
            modifier = Modifier.size(100.dp)
        )

        Spacer(modifier = Modifier.height(25.dp))

        Text(
            text = "Entre na sua conta",
            fontSize = 25.sp,
            fontWeight = FontWeight.ExtraBold,
            color = Color.White
        )

        Spacer(modifier = Modifier.height(25.dp))

        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            label = { Text("E-mail") },
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
            modifier = Modifier.width(320.dp),
            singleLine = true,
            shape = RoundedCornerShape(5.dp)
        )

        Spacer(modifier = Modifier.height(15.dp))

        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            label = { Text("Senha") },
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
            singleLine = true,
            modifier = Modifier.width(320.dp),
            shape = RoundedCornerShape(5.dp)
        )

        Spacer(modifier = Modifier.height(10.dp))

        Row(
            modifier = Modifier.width(310.dp),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            ForgotPasswordText {}
        }

        Spacer(modifier = Modifier.height(25.dp))

        Button(
            onClick = { TODO() },
            modifier = Modifier.width(250.dp).height(45.dp),
            colors = ButtonDefaults.buttonColors(containerColor = Gold),
            shape = RoundedCornerShape(15.dp)
        ) {
            Text("Entrar", color = Color.White, fontWeight = FontWeight.Bold)
        }

        Spacer(modifier = Modifier.height(15.dp))

        Text("ou", color = Color.White, fontSize = 15.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(15.dp))

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

        Spacer(modifier = Modifier.height(25.dp))

        Row {
            SignUp {}
        }
    }
}

@Preview
@Composable
fun SignInScreenPreview(){
    Box(Modifier.fillMaxSize().background(color = Background)) {
        SignInScreen()
    }
}