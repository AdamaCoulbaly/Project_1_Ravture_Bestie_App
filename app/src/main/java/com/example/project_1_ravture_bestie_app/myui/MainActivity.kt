package com.example.project_1_ravture_bestie_app.myui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.Navigation
import androidx.navigation.compose.*
import com.example.project_1_ravture_bestie_app.R
import com.example.project_1_ravture_bestie_app.model.NavigationDrawerItem
import com.example.project_1_ravture_bestie_app.model.NavigationItem
import com.example.project_1_ravture_bestie_app.ui.theme.Project_1_Ravture_Bestie_AppTheme
import com.example.project_1_ravture_bestie_app.myui.*
import com.example.project_1_ravture_bestie_app.ui.theme.MyMainScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Project_1_Ravture_Bestie_AppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(colorResource(id = R.color.BestiePrimaryBackground)),
                    //color = MaterialTheme.colors.onPrimary
                ) {
                    MainScreen()
                }
            }

        }
    }
}
@Composable
fun MainScreen(){
    val navController= rememberNavController()
    Scaffold(topBar = { TopBar()},
        bottomBar = { BottomNavigationBar(navController)}
        ) {
        //androidx.navigation.Navigation
        Navigation(navController = navController)
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview(){
    MainScreen()
}

@Composable
fun Navigation(navController: NavHostController){

    NavHost(navController,startDestination = NavigationItem.Home.route){
        composable(NavigationItem.Home.route){
            HomeScreen()
        }
        composable(NavigationItem.Info.route){
            InfoScreen()
        }
        composable(NavigationItem.SignUp.route){
            SignUpScreen()
        }
        composable(NavigationItem.SignIn.route){
            SignInScreen()
        }
    }
}

@Composable
fun MyNavigation(navController: NavHostController) {
    NavHost(navController, startDestination = NavigationDrawerItem.MyHome.route) {
        composable(NavigationDrawerItem.MyHome.route) {
            MyHomeScreen()
        }
        composable(NavigationDrawerItem.MyProfile.route) {
            MyProfileScreen()
        }
        composable(NavigationDrawerItem.Settings.route) {
            SettingsScreen()
        }
    }
}

@Composable
fun TopBar(){
    Box( modifier = Modifier
        .background(colorResource(id = R.color.BestieSecondaryBackground))
    ) {
        TopAppBar(
            title={Text(
                text="BESTIE", fontWeight = FontWeight.Bold,
                color = Color.White,
                fontSize = 25.sp)
            },
        )
    }

}

@Preview(showBackground = true)
@Composable
fun TopBarPreview(){
    TopBar()
}

@Composable
fun BottomNavigationBar(navController: NavController) {
    val items = listOf(
        NavigationItem.Home,
        NavigationItem.Info,
        NavigationItem.SignUp,
        NavigationItem.SignIn

    )
    BottomNavigation(
        modifier = Modifier
            .background(colorResource(id = R.color.BestiePrimaryBackground)),
            contentColor = Color.White
    ) {
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.forEach { item ->
            BottomNavigationItem(
                icon = { Icon(painterResource(id = item.icon), contentDescription = item.title) },
                label = { Text(text = item.title) },
                selectedContentColor = Color.White,
                unselectedContentColor = Color.White.copy(0.4f),
                alwaysShowLabel = true,
                selected = currentRoute == item.route,
                onClick = {
                    navController.navigate(item.route) {
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }
                        launchSingleTop=true
                        restoreState=true
                    }
                }

            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun BottomNavigationBarPreview(){
    //BottomNavigationBar(navController = navController)
}