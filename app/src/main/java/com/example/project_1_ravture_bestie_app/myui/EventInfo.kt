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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class EventInfo : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            SimpleTextFieldComponent()
            ClickableCardComponent2()
        }
    }

    //add context
    @Preview
    @Composable
    fun SimpleTextFieldComponent() {
        val context = LocalContext.current
        // Surface as the name suggests is used to have some UI elements over it. You can provide some
        // color, contentColor, shape, border, elevation, etc to a surface. If no contentColor is passed
        // then the surface will try to match its color with the background color.
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
    }
    @Preview
    @Composable
    fun ClickableCardComponent2() {
        Column() {


            val context = LocalContext.current
            Card(
                shape = RoundedCornerShape(8.dp),
                backgroundColor = Color(0xFFFFA867.toInt()),
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
                    text = "Your saved event with event info",
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 16.sp
                    ),
                    modifier = Modifier.padding(16.dp)
                )
            }
            Card(
                shape = RoundedCornerShape(8.dp),
                backgroundColor = Color(0xFFFFA867.toInt()),
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
                    text = "Your saved event with event info",
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 16.sp
                    ),
                    modifier = Modifier.padding(16.dp)
                )
            }
            Card(
                shape = RoundedCornerShape(8.dp),
                backgroundColor = Color(0xFFFFA867.toInt()),
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
                    text = "Your saved event with event info",
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 16.sp
                    ),
                    modifier = Modifier.padding(16.dp)
                )
            }
            Card(
                shape = RoundedCornerShape(8.dp),
                backgroundColor = Color(0xFFFFA867.toInt()),
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
                    text = "Your saved event with event info",
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 16.sp
                    ),
                    modifier = Modifier.padding(16.dp)
                )
            }
            Card(
                shape = RoundedCornerShape(8.dp),
                backgroundColor = Color(0xFFFFA867.toInt()),
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
                    text = "Your saved event with event info",
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 16.sp
                    ),
                    modifier = Modifier.padding(16.dp)
                )
            }
            Card(
                shape = RoundedCornerShape(8.dp),
                backgroundColor = Color(0xFFFFA867.toInt()),
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
                    text = "Your saved event with event info",
                    textAlign = TextAlign.Center,
                    style = TextStyle(
                        fontSize = 16.sp
                    ),
                    modifier = Modifier.padding(16.dp)
                )
            }
            Card(
                shape = RoundedCornerShape(8.dp),
                backgroundColor = Color(0xFFFFA867.toInt()),
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
                    text = "Your saved event with event info",
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