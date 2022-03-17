package com.example.project_1_ravture_bestie_app.model

import com.example.project_1_ravture_bestie_app.R

sealed class NavigationItem(var route:String, var icon:Int, var title:String){
    object Home: NavigationItem("home", R.drawable.home,"Home")
    object Info: NavigationItem("info", R.drawable.info,"Info")
    object SignIn: NavigationItem("signin", R.drawable.sigin,"SignIn")
    object SignUp: NavigationItem("signup", R.drawable.sigin,"SignUp")
}

sealed class NavigationDrawerItem(var route:String, var icon:Int, var title:String){
    object MyHome: NavigationItem("myHome", R.drawable.home,"MyHome")
    object MyProfile: NavigationItem("myProfile", R.drawable.info,"MyProfile")
    object Settings: NavigationItem("settings", R.drawable.sigin,"Settings")

}



