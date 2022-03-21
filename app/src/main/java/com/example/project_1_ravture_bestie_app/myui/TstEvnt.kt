package com.example.project_1_ravture_bestie_app.myui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.project1.AllEvents
import com.example.project1.AllEventsPreview
import com.example.project1.Events

class TstEvnt : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AllEvents(Events)
        }
    }
}

@Preview
@Composable
fun PreviewAllEvents(){
    AllEvents(Events)
}
