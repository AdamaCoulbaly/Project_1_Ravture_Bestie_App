package com.example.project_1_ravture_bestie_app.myui

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
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
import com.example.project1.AllEvents
import com.example.project1.Events


class MainActivityJacob : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            ButtonComponent()
            AllEvents(Events)


            Divider(color = Color.Gray)
        }
    }

//    @Composable
//    fun ButtonComponent() {
//        Column() {
//
//            Spacer(modifier = Modifier.height(10.dp))
//
//            val context = LocalContext.current
//            Button(onClick = { context.startActivity(Intent(context, Activity2::class.java)) })
//            {
//                Text(text = "Your Events")
//            }
//            AllEvents(Events)
//        }
//    }
}










