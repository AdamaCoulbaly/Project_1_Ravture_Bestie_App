package com.example.project_1_ravture_bestie_app.myui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.project_1_ravture_bestie_app.model.Restaurants
import com.example.project_1_ravture_bestie_app.myui.ui.theme.Project_1_Ravture_Bestie_AppTheme
import com.revature.bestiealphatest.ui.theme.RestaurantMex

class RestaurantList : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Project_1_Ravture_Bestie_AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    AreaRestaurants(RestaurantMex)
                }
            }
        }
    }
}

@Composable
fun AreaRestaurants(restaurantList:List<Restaurants>)
{

    Scaffold(

        topBar = {

            TopAppBar(backgroundColor = MaterialTheme.colors.primary,
                title = { Text(text = "Area Restaurants") }
            )

        }

    )
    {

        LazyColumn(
            Modifier.fillMaxWidth(),
            contentPadding = PaddingValues(16.dp)
        )
        {

            item {

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight()
                        .padding(vertical = 25.dp),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically


                ) {

                    Text(
                        text = "Mexican Restaurants",
                        style = MaterialTheme.typography.h5)

                }
            }

            items(restaurantList)
            {Restaurants->

                RestaurantCard(Restaurants.name, Restaurants.description, Restaurants.imageRes )
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview2() {
    Project_1_Ravture_Bestie_AppTheme {

    }
}