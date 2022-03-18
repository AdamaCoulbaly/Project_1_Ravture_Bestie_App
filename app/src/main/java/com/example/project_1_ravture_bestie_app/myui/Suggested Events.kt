package com.example.project1

import android.content.Intent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.project_1_ravture_bestie_app.data.Event


@Composable
fun AllEvents(eventList:List<Event>)
{

    Scaffold(

        topBar = {

            TopAppBar(backgroundColor = MaterialTheme.colors.primary,

                title = { Text(text = "Events")})

        }
    )

    {

        LazyColumn(

            Modifier.fillMaxWidth(),
            contentPadding= PaddingValues(16.dp)

        )
        {

            item {

                Row(
                    modifier= Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(vertical = 25.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically

                ) {

                    Text(text = "Some Events You May Like",
                        style= MaterialTheme.typography.h5 )
                }

            }// end of item

            items(eventList)
            { event->

                EventCard(event.name,event.date,event.description,event.imageRes)

            }



        }

    }
}