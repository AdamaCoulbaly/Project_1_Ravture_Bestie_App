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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.project_1_ravture_bestie_app.R
import com.example.project_1_ravture_bestie_app.myui.ui.theme.ui.theme.Project_1_Ravture_Bestie_AppTheme

class RestaurantActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Project_1_Ravture_Bestie_AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                        .background(colorResource(id = com.example.project_1_ravture_bestie_app.R.color.purple_200))
                ) {
                    RestaurantLocator()
                }
            }
        }
    }
}

@Composable
fun RestaurantLocator() {
    val context = LocalContext.current
    var textFieldState by remember {
        mutableStateOf("")
    }
    // placeholder is displayed when the TextField is focused and is empty.
    Column{

        TextField(
            value = textFieldState,
            modifier = Modifier.padding(16.dp).fillMaxWidth(),
            onValueChange = { textFieldState = it },
            label = { Text("Enter Restaurant Name") },
            placeholder = { Text("Mexican") },
            singleLine = true
        )
        Button(
            onClick = {
                context.startActivity(Intent(context,RestaurantList::class.java))
            },
            modifier = Modifier
                .padding(8.dp)
                .fillMaxWidth()

        ) {
            Text("Submit")
        }
    }





    Image(
        painterResource(id = R.drawable.restaurant1),
        contentDescription = "Restaurant promo",
        modifier = Modifier
            .size(30.dp),
    )




}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Project_1_Ravture_Bestie_AppTheme {

    }
}