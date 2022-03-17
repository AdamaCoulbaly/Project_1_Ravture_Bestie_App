package com.example.project_1_ravture_bestie_app.ui.theme

import androidx.compose.material.DrawerValue
import androidx.compose.material.Scaffold
import androidx.compose.material.rememberDrawerState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.project_1_ravture_bestie_app.R

@Composable
fun MyMainScreen(){
    val scaffoldState= rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    val scope= rememberCoroutineScope()
    val navController= rememberNavController()
    Scaffold(
        scaffoldState=scaffoldState,
        topBar={},
        drawerBackgroundColor= colorResource(id = R.color.BestiePrimaryBackground),
        drawerContent = {

        },
    ){

    }
}

@Preview(showBackground = true)
@Composable
fun MyMainScreenPreview() {
    MyMainScreen()
}