package com.example.project_1_ravture_bestie_app

sealed class NavigationItem(var route:String, var icon:Int, var title:String){
    object Home:NavigationItem("home",R.drawable.home,"Home")
    object Info:NavigationItem("info",R.drawable.info,"Info")
    object SignIn:NavigationItem("signin",R.drawable.sigin,"SignIn")
    object SignUp:NavigationItem("signup",R.drawable.sigin,"SignUp")
}
