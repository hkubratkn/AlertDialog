package com.kapirti.groupwork.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.kapirti.groupwork.ui.theme.GroupWorkTheme

@Composable
fun ProfileScreen(){
    GroupWorkTheme {
        Surface(color = MaterialTheme.colors.error) {
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                var text by remember { mutableStateOf("") }

                Text(text="ProfileScreen")
                OutlinedTextField(
                    value = text,
                    onValueChange = { text= it },
                    label = { Text("Email") }
                )
            }
        }
    }
}