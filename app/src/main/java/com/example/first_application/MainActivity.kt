package com.example.first_application

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.first_application.ui.theme.First_ApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
           Main()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Main(){
    First_ApplicationTheme {
        Scaffold(
            topBar = {
                TopAppBar(title = {
                    Text("Evènements") },
                navigationIcon = { Icon(Icons.Default.Menu, contentDescription = null) },
                    actions = { Icon(Icons.Default.Favorite, contentDescription = null)})
            },
            modifier = Modifier.fillMaxSize()
        ) { innerPadding ->
            Box(modifier = Modifier.padding(innerPadding))
            Screen()

        }
    }
}

@Composable
fun Screen() {

    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceEvenly) {
        Image(
            painter = painterResource(R.drawable.isis_castres),
            contentDescription = "isis",
            modifier = Modifier.size(250.dp)
        )
        Column(){
            Text("Où : Ecole ingénieur ISIS")
            Text("Quand : 24 octobre")
        }
            InscriptionButton()


    }


}

@Composable
fun InscriptionButton() {
    Row (modifier = Modifier.padding(10.dp)){
        Button(onClick = {}){
            Text("Inscription")
        }
        Button(onClick = {}, colors = androidx.compose.material3.ButtonDefaults.outlinedButtonColors(), border = androidx.compose.material3.ButtonDefaults.outlinedButtonBorder){
            Text("Pas intéressé")
        }

    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
   Main()
}