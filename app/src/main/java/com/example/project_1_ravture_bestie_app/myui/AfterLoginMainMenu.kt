package com.example.project_1_ravture_bestie_app.myui

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project_1_ravture_bestie_app.R
import com.example.project_1_ravture_bestie_app.myui.ui.theme.ui.theme.Project_1_Ravture_Bestie_AppTheme

class AfterLoginMainMenu : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Project_1_Ravture_Bestie_AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    MenuButtons()
                }
            }
        }
    }
}


@Composable
fun MenuButtons() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .fillMaxWidth()
            .fillMaxHeight()
            .background(colorResource(id = R.color.purple_200)),


            //.wrapContentSize(Alignment.Center)
    ) {Text(text="BESTIE MAIN PAGE", fontWeight = FontWeight.Bold,
        color = Color.White,
        fontSize = 25.sp)
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth().padding(8.dp)
        ) {
            Button(
                onClick = { },
            ) {
                Image(
                    painterResource(R.drawable.favorites),
                    contentDescription = "Favorites button icon",
                    modifier = Modifier.size(13.dp)
                        .background(colorResource(id = R.color.purple_700))
                )

                Text(text = "Favorites", Modifier.padding(start = 10.dp))
            }
            Button(
                onClick = { /*TODO*/ },

            ) {
                Image(
                    painterResource(R.drawable.event),
                    contentDescription = "Events button icon",
                    modifier = Modifier.size(13.dp)
                        .background(colorResource(id = R.color.purple_700))
                )

                Text(text = "Events", Modifier.padding(start = 10.dp))
            }
            Button(
                onClick = {context.startActivity(Intent(context,MainActivityJacob::class.java))},

            ) {
                Image(
                    painterResource(R.drawable.help),
                    contentDescription = "Help button icon",
                    modifier = Modifier.size(13.dp)
                        .background(colorResource(id = R.color.purple_700))
                )

                Text(text = "Help", Modifier.padding(start = 10.dp))
            }
        }

        Card(
            elevation = 10.dp,
            modifier = Modifier.fillMaxWidth().padding(0.dp)
                .background(colorResource(id = R.color.purple_200))
        ){
            Image(painter= painterResource(id = R.drawable.backgroung), contentDescription = null)
            Column(modifier=Modifier.fillMaxSize().fillMaxWidth()
                .padding(2.dp)){
                Text(
                    text = "Welcome!",
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    modifier = Modifier.align(Alignment.CenterHorizontally),
                    textAlign = TextAlign.Center,
                    fontSize = 25.sp
                )
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun MenuButtonsPreview(){
    MenuButtons()
}