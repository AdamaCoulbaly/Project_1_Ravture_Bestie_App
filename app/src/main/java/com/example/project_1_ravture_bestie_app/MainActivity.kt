package com.example.project_1_ravture_bestie_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.Navigation
import androidx.navigation.compose.*
import com.example.project_1_ravture_bestie_app.ui.theme.Project_1_Ravture_Bestie_AppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
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
        composable(NavigationItem.SignIn.route){
            SignInScreen()
        }
    }
}

@Composable
fun TopBar(){
        TopAppBar(
            title={Text(
                    text="BESTIE :)", fontWeight = FontWeight.Bold,
                color = Color.White,
                //textAlign = TextAlign.Center,
                fontSize = 25.sp)
                  },
            backgroundColor = Color.Gray,
            contentColor = Color.White
        )
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
        NavigationItem.SignIn
        //NavigationItem.SignUp
    )
    BottomNavigation(
        backgroundColor = Color.Black,
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