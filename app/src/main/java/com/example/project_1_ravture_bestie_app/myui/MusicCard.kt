package com.example.project_1_ravture_bestie_app.myui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun MusicCard(venue:String, type:String, band:String, image:Int)
{
    var context = LocalContext.current
    Card(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
            .wrapContentHeight(),
        shape = MaterialTheme.shapes.medium,
        elevation = 5.dp,
        backgroundColor = MaterialTheme.colors.surface


    )
    {

        Row(
            verticalAlignment = Alignment.CenterVertically

        ){

            Image(painter = painterResource(id = image), contentDescription = null,
                modifier = Modifier
                    .size(130.dp)
                    .padding(8.dp),
                contentScale = ContentScale.Fit
            )
            Column(Modifier.padding(8.dp)) {

                Text(text = venue,
                    style= MaterialTheme.typography.h6,
                    color= MaterialTheme.colors.onSurface,
                    fontWeight= FontWeight.Bold,
                    fontStyle= FontStyle.Italic,
                    modifier= Modifier.padding(bottom=8.dp)
                )
                Text(text = band,
                    style= MaterialTheme.typography.body2,
                    color= MaterialTheme.colors.onSurface,
                    modifier= Modifier.padding(bottom=4.dp)

                )
                Text(text = type,
                    style = MaterialTheme.typography.body2,
                    color = MaterialTheme.colors.onSurface,
                    modifier = Modifier.padding(bottom=4.dp)

                    )
            }



        }
    }

}
