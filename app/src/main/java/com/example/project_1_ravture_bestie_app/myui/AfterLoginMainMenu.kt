package com.example.project_1_ravture_bestie_app.myui

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
                    BestieTopBar()
                    MenuButtons()
                }
            }
        }
    }
}

@Composable
fun BestieTopBar(){
    Box( modifier = Modifier
        .background(colorResource(id = R.color.purple_500))
    ) {
        TopAppBar(
            title={Text(
                text="BESTIE -MAIN MENU-", fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 25.sp)
            },
        )
    }

}

@Composable
fun MenuButtons() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.purple_200))
            //.wrapContentSize(Alignment.Center)
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.fillMaxWidth().padding(8.dp)
        ) {
            Button(
                onClick = { /*TODO*/ },
            ) {
                Image(
                    painterResource(R.drawable.favorites),
                    contentDescription = "Cart button icon",
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
                    contentDescription = "Cart button icon",
                    modifier = Modifier.size(13.dp)
                        .background(colorResource(id = R.color.purple_700))
                )

                Text(text = "Favorites", Modifier.padding(start = 10.dp))
            }
            Button(
                onClick = { /*TODO*/ },

            ) {
                Image(
                    painterResource(R.drawable.help),
                    contentDescription = "Cart button icon",
                    modifier = Modifier.size(13.dp)
                        .background(colorResource(id = R.color.purple_700))
                )

                Text(text = "Favorites", Modifier.padding(start = 10.dp))
            }
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun MenuButtonsPreview(){
    MenuButtons()
}