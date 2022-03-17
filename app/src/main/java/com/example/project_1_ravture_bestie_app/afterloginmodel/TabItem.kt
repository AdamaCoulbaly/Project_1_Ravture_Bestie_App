package com.example.project_1_ravture_bestie_app.afterloginmodel

import androidx.compose.runtime.Composable
import com.example.project_1_ravture_bestie_app.R
import com.example.project_1_ravture_bestie_app.afterloginui.EventsScreen
import com.example.project_1_ravture_bestie_app.afterloginui.FavoriteScreen

typealias ComposableFun = @Composable () -> Unit
sealed class TabItem(var icon: Int, var title: String, var screen: ComposableFun) {
    object Favorites : TabItem(R.drawable.favorites, "Favorites", { FavoriteScreen()})
    object Events : TabItem(R.drawable.event, "Events", { EventsScreen() })
}
