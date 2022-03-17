package com.example.project_1_ravture_bestie_app.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.project_1_ravture_bestie_app.R
import kotlinx.coroutines.CoroutineScope
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.project_1_ravture_bestie_app.model.NavigationDrawerItem
import com.example.project_1_ravture_bestie_app.model.NavigationItem
import com.example.project_1_ravture_bestie_app.myui.TopBar
import kotlinx.coroutines.launch


@Composable
fun MyMainScreen(){
    val scaffoldState= rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    val scope= rememberCoroutineScope()
    val navController= rememberNavController()
    Scaffold(
        scaffoldState=scaffoldState,
        topBar={TopBar(scope=scope,scaffoldState=scaffoldState)},
        drawerBackgroundColor= colorResource(id = R.color.BestiePrimaryBackground),
        drawerContent = {
                MyDrawer(scope=scope, scaffoldState=scaffoldState, navController=navController)
        },
    ){

    }
}

@Preview(showBackground = true)
@Composable
fun MyMainScreenPreview() {
    Project_1_Ravture_Bestie_AppTheme {
        MyMainScreen()
    }
}

@Composable
fun TopBar(scope: CoroutineScope, scaffoldState: ScaffoldState){
    TopAppBar(
        title = { Text(text = "BESTIE", fontSize = 10.sp) },
        navigationIcon = {
            IconButton(onClick = {
                scope.launch {
                    scaffoldState.drawerState.open()
                }
            }) {
                Icon(Icons.Filled.Menu, "")
            }
        },
        backgroundColor = colorResource(id = R.color.BestiePrimaryBackground),
        contentColor = Color.White
    )
}

@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    val scope = rememberCoroutineScope()
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    TopBar(scope = scope, scaffoldState = scaffoldState)
}

@Composable
fun MyDrawer(scope:CoroutineScope, scaffoldState: ScaffoldState, navController: NavController){
    val items=listOf(
        NavigationDrawerItem.MyHome,
        NavigationDrawerItem.MyProfile,
        NavigationDrawerItem.Settings
    )
    Column(
        modifier= Modifier
            .background(colorResource(id = R.color.BestiePrimaryBackground))
    ){
        Image(painter = painterResource(id = R.drawable.smilling), contentDescription = null,
            modifier= Modifier
                .height(100.dp)
                .fillMaxWidth()
                .padding(5.dp)
        )
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .height(5.dp)
        )
        //The list of the navigation
        val navBackStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = navBackStackEntry?.destination?.route
        items.forEach{item->
            MyDrawerItem(item = item, selected =currentRoute==item.route , onItemClick ={navController.navigate(item.route){
                // Pop up to the start destination of the graph to
                // avoid building up a large stack of destinations
                // on the back stack as users select items
                navController.graph.startDestinationRoute?.let{
                    route->popUpTo(route){
                        saveState=true
                }
                }
                //Avoid multiple copies of the same destination when
                // reselecting the same item
                launchSingleTop=true
                // Restore state when reselecting a previously selected item
                restoreState=true
            }
                scope.launch {
                    scaffoldState.drawerState.close()
                }
            } )
        }
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text="",
            color = Color.White,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold,
            modifier = Modifier
                .padding(12.dp)
                .align(Alignment.CenterHorizontally)
        )
    }
}
@Preview(showBackground = true)
@Composable
fun myDrawerPreview() {
    val scope = rememberCoroutineScope()
    val scaffoldState = rememberScaffoldState(rememberDrawerState(DrawerValue.Closed))
    val navController = rememberNavController()
    MyDrawer(scope = scope, scaffoldState = scaffoldState, navController = navController)
}

@Composable
fun MyDrawerItem(item: NavigationItem, selected: Boolean, onItemClick: (NavigationItem) -> Unit) {
    val background = if (selected) R.color.BestiePrimaryBackground else android.R.color.transparent
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .clickable(onClick = { onItemClick(item) })
            .height(45.dp)
            .background(colorResource(id = background))
            .padding(start = 10.dp)
    ) {
        Image(
            painter = painterResource(id = item.icon),
            contentDescription = item.title,
            colorFilter = ColorFilter.tint(Color.White),
            contentScale = ContentScale.Fit,
            modifier = Modifier
                .height(35.dp)
                .width(35.dp)
        )
        Spacer(modifier = Modifier.width(7.dp))
        Text(
            text = item.title,
            fontSize = 10.sp,
            color = Color.White
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DrawerItemPreview() {
    MyDrawerItem(item =NavigationDrawerItem.MyHome , selected =false , onItemClick ={} )
}