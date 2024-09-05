package br.senai.jandira.sp.rickandmotty

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.compose.rememberNavController
import br.senai.jandira.sp.rickandmotty.screens.CharacterDetails
import br.senai.jandira.sp.rickandmotty.screens.ListAllCharacters
import br.senai.jandira.sp.rickandmotty.ui.theme.RickAndMottyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
          //  enableEdgeToEdge()
            setContent {
                RickAndMottyTheme {

                    val navController = rememberNavController()
                    ListAllCharacters()
                }
        }
    }
}

