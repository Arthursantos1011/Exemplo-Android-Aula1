package com.example.exemploaula1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.exemploaula1.ui.theme.ExemploAula1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ExemploAula1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Inicial()
                }
            }
        }
    }
}

@Composable
fun TextCustomizado(texto: String) {
 Text(text = texto, color = Color.White)
}


@Composable
fun Inicial(){
    Column(modifier = Modifier.background(color = Color.Red)){
        TextCustomizado(texto = "Arthur da Silva Santos")
        Row {
            TextCustomizado(texto = "Android Studio")
            TextCustomizado(texto = "JetPack Compose")
        }
    }
}
