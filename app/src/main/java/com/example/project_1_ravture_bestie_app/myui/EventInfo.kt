package com.example.project_1_ravture_bestie_app.myui

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.project_1_ravture_bestie_app.R

class EventInfo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            ClickableCardComponent()
        }
    }


    @Preview
    @Composable
    fun ClickableCardComponent() {
        Column() {
            val context = LocalContext.current
            Surface(color = Color.LightGray, modifier = Modifier.padding(16.dp)) {
                var text by remember { mutableStateOf(TextFieldValue("Search")) }
                // BaseTextField is a composable that is used to take input. It is similar to EditText.
                // onValueChange will be called when there is a change in content of text field.
                TextField(//was originally BaseTextField. This whole function is a place holder for a search bar that will replace it anyways.
                    value = text,
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth(),
                    onValueChange = {
                        text = it
                    }
                )
            }

            Card(
                shape = RoundedCornerShape(8.dp),
                backgroundColor =(colorResource(id = R.color.purple_700)) ,
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .clickable(onClick = {
                        Toast
                            .makeText(context, "Thanks for clicking!", Toast.LENGTH_SHORT)
                            .show()
                    })
            ) {
                Text(
                    text = "Your saved event",
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 16.sp
                    ),
                    modifier = Modifier.padding(16.dp)
                )
            }
            Card(
                shape = RoundedCornerShape(8.dp),
                backgroundColor = (colorResource(id = R.color.purple_700)),
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .clickable(onClick = {
                        Toast
                            .makeText(context, "Thanks for clicking!", Toast.LENGTH_SHORT)
                            .show()
                    })
            ) {
                Text(
                    text = "Your saved event",
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 16.sp
                    ),
                    modifier = Modifier.padding(16.dp)
                )
            }
            Card(
                shape = RoundedCornerShape(8.dp),
                backgroundColor = (colorResource(id = R.color.purple_700)),
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .clickable(onClick = {
                        Toast
                            .makeText(context, "Thanks for clicking!", Toast.LENGTH_SHORT)
                            .show()
                    })
            ) {
                Text(
                    text = "Your saved event",
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 16.sp
                    ),
                    modifier = Modifier.padding(16.dp)
                )
            }
            Card(
                shape = RoundedCornerShape(8.dp),
                backgroundColor = (colorResource(id = R.color.purple_700)),
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .clickable(onClick = {
                        Toast
                            .makeText(context, "Thanks for clicking!", Toast.LENGTH_SHORT)
                            .show()
                    })
            ) {
                Text(
                    text = "Your saved event",
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 16.sp
                    ),
                    modifier = Modifier.padding(16.dp)
                )
            }
            Card(
                shape = RoundedCornerShape(8.dp),
                backgroundColor = (colorResource(id = R.color.purple_700)),
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .clickable(onClick = {
                        Toast
                            .makeText(context, "Thanks for clicking!", Toast.LENGTH_SHORT)
                            .show()
                    })
            ) {
                Text(
                    text = "Your saved event",
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 16.sp
                    ),
                    modifier = Modifier.padding(16.dp)
                )
            }
            Card(
                shape = RoundedCornerShape(8.dp),
                backgroundColor = (colorResource(id = R.color.purple_700)),
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .clickable(onClick = {
                        Toast
                            .makeText(context, "Thanks for clicking!", Toast.LENGTH_SHORT)
                            .show()
                    })
            ) {
                Text(
                    text = "Your saved event",
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 16.sp
                    ),
                    modifier = Modifier.padding(16.dp)
                )
            }
            Card(
                shape = RoundedCornerShape(8.dp),
                backgroundColor = (colorResource(id = R.color.purple_700)),
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
                    .clickable(onClick = {
                        Toast
                            .makeText(context, "Thanks for clicking!", Toast.LENGTH_SHORT)
                            .show()
                    })
            ) {
                Text(
                    text = "Your saved event",
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 16.sp
                    ),
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}