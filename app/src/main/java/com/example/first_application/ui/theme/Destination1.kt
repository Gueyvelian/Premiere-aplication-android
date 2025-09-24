package com.example.first_application.ui.theme

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.first_application.InscriptionButton
import com.example.first_application.Main
import com.example.first_application.R
import com.example.first_application.Screen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MiseEnPage(onclickretour: () -> Unit) {

    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text("Evènements")
                },
                navigationIcon = { Icon(Icons.Default.Menu, contentDescription = null) },
                actions = { Icon(Icons.Default.Favorite, contentDescription = null) })
        },
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Box(modifier = Modifier.padding(innerPadding))
        Desole(onclickretour)

    }

}

@Composable
fun Desole(onclickretour: () -> Unit) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Text("Nous sommes désolé")
        Button(onClick = {onclickretour()}) {
            Text("Retour")

        }

    }


}