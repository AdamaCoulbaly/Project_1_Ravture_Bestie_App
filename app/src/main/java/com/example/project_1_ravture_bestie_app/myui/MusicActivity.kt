package com.example.project_1_ravture_bestie_app.myui

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project_1_ravture_bestie_app.R
import com.example.project_1_ravture_bestie_app.myui.ui.theme.Project_1_Ravture_Bestie_AppTheme

class MusicActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Project_1_Ravture_Bestie_AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                    MusicLocator()
                }
            }
        }
    }
}



@Composable
fun MusicLocator() {
    val context = LocalContext.current
    var textFieldState by remember {
        mutableStateOf("")
    }
    // placeholder is displayed when the TextField is focused and is empty.
    Column(modifier = Modifier.fillMaxSize()
        .background(colorResource(id = R.color.purple_200)))
    {
       TextField(
            value = textFieldState,
            modifier = Modifier.padding(16.dp).fillMaxWidth(),
            onValueChange = { textFieldState = it },
            label = { Text("Enter Location or City") },
            placeholder = { Text("Houston") },
            singleLine = true
        )
        Button(
            onClick = {
                context.startActivity(Intent(context,MusicList::class.java))
            },
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()

        ) {
            Text("Submit")
        }
    }





    Image(
        painterResource(id = R.drawable.venue4),
        contentDescription = "Music promo",
        modifier = Modifier
            .size(30.dp),
    )




}


@Preview(showBackground = true)
@Composable
fun DefaultPreview4() {
    Project_1_Ravture_Bestie_AppTheme {

    }
}