package com.example.nakheiapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun SecondScreen(username: String?, age: Int?){
    Column(modifier = Modifier.fillMaxSize(),
    verticalArrangement = Arrangement.Center,
    horizontalAlignment = Alignment.CenterHorizontally) {

        Text(
            text = "SecondScreen",
            modifier = Modifier.padding(16.dp),
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold
        )

        Text(modifier = Modifier.padding(16.dp),
            fontSize = 19.sp,
            text = " khosh amadid '${username}'. sene shoma = ${1402 - age!!} ")
    }

    
}

