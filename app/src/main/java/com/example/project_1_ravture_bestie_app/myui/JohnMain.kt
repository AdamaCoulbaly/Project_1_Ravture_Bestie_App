package com.example.project_1_ravture_bestie_app.myui

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project_1_ravture_bestie_app.ui.theme.Project_1_Ravture_Bestie_AppTheme
import  com.example.project_1_ravture_bestie_app.*
import  com.example.project_1_ravture_bestie_app.*
import  com.example.project_1_ravture_bestie_app.myui.*

import com.example.project_1_ravture_bestie_app.*


class JohnMain : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Project_1_Ravture_Bestie_AppTheme {
                // A surface container using the 'background' color from the theme

                    // AreaRestaurants(RestaurantMex)
                    Column (
                        modifier = Modifier.fillMaxSize()
                                   .background(colorResource(id = com.example.project_1_ravture_bestie_app.R.color.purple_200))
                    )
                    {

                        MainBar()
                        Divider(color = androidx.compose.ui.graphics.Color.Gray)
                        FavoriteRestaurants("Restaurants")
                        FavoriteMusic("Music")

                        Spacer(modifier = Modifier.height(30.dp))

                        Image(painter = painterResource(com.example.project_1_ravture_bestie_app.R.drawable.restaurant1), contentDescription = "App logo",
                            modifier= Modifier
                                .fillMaxSize())
                    }
                }
            }
        }
}


@Composable
fun MainBar(){
    Box( modifier = Modifier
        .background(colorResource(id = com.example.project_1_ravture_bestie_app.R.color.purple_500))
    ) {
        TopAppBar(
            title={Text(
                text="FAVORITES", fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 25.sp)
            },
        )
    }

}


@Composable
fun FavoriteRestaurants(text: String) {
    val context = LocalContext.current

    Column {

        // shape is used to give the shape to Compose UI elements.
        Button(
            onClick = {
                context.startActivity(Intent(context, RestaurantActivity::class.java))
            },
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()

        ) {
            Text("Restaurants")
        }
    }
}

@Composable
fun FavoriteMusic(text: String) {
    val context = LocalContext.current

    Column {

        // shape is used to give the shape to Compose UI elements.
        Button(
            onClick = {
               context.startActivity(Intent(context, MusicActivity::class.java))
            },
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth(),

            ) {
            Text("Music")
        }

    }
}


