package com.example.basiclayoutsjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.basiclayoutsjetpackcompose.body.CreateAlignYourBodyElement
import com.example.basiclayoutsjetpackcompose.body.CreateFavoriteCollection
import com.example.basiclayoutsjetpackcompose.searchbar.CreateSearchBar
import com.example.basiclayoutsjetpackcompose.ui.theme.BasicLayoutsJetPackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BasicLayoutsJetPackComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    Column(
                        modifier = Modifier
                            .padding(20.dp)
                            .verticalScroll(rememberScrollState())
                    ) {
                        CreateSearchBar()
                        Text(
                            text = "Align your body",
                            style = MaterialTheme.typography.h5,
                            modifier = Modifier.padding(top = 20.dp, start = 20.dp, bottom = 11.dp)
                        )
                        CreateAlignYourBodyElement()

                        Text(
                            text = "FAVORITE COLLECTS",
                            style = MaterialTheme.typography.h5.copy(fontSize = 19.sp),
                            modifier = Modifier.padding(top = 20.dp, start = 20.dp, bottom = 11.dp)
                        )
                        CreateFavoriteCollection()
                    }

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BasicLayoutsJetPackComposeTheme {
        Greeting("Android")
    }
}