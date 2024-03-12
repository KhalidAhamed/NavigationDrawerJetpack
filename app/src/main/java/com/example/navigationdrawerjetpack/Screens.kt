package com.example.navigationdrawerjetpack

sealed class Screens (val screen: String){
    data object Home : Screens("home")
    data object Profile : Screens("profile")
    data object Settings : Screens("settings")
    data object Search : Screens("search")
    data object Post : Screens("post")


}