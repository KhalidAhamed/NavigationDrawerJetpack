package com.example.navigationdrawerjetpack

import android.annotation.SuppressLint
import android.graphics.drawable.Icon
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material.icons.rounded.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHost
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationdrawerjetpack.ui.theme.GreenJc
import com.example.navigationdrawerjetpack.ui.theme.NavigationDrawerJetpackTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NavigationDrawerJetpackTheme {
                // A surface container using the 'background' color from the theme
                Surface(
//                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    LearnBottomNav()
//                    LearnNavDrawer()
                }
            }
        }
    }
}

//@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter", "CoroutineCreationDuringComposition")
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun LearnNavDrawer(){
//    val navigationController = rememberNavController()
//    val coroutineScope = rememberCoroutineScope()
//    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
//    val context = LocalContext.current.applicationContext
//
//    ModalNavigationDrawer( drawerState = drawerState,
//        gesturesEnabled = true,
//        drawerContent = {
//            ModalDrawerSheet {
//                Box (modifier = Modifier
//                    .background(GreenJc)
//                    .fillMaxWidth()
//                    .height(150.dp)){
//
//                    Divider()
//
//                    NavigationDrawerItem(label = { Text(text = "HOME", color = GreenJc)}, selected = false,
//                    icon = { androidx.compose.material3.Icon(imageVector = Icons.Default.Home, contentDescription = "", tint = GreenJc) },
//                        onClick = {
//                        coroutineScope.launch {
//                            drawerState.close()
//                        }
//                            navigationController.navigate(Screens.Home.screens){
//                                popUpTo(0)
//                            }
//                    })
//
//                    NavigationDrawerItem(label = { Text(text = "PROFILE", color = GreenJc)}, selected = false,
//                        icon = { androidx.compose.material3.Icon(imageVector = Icons.Default.AccountBox, contentDescription = "", tint = GreenJc) },
//                        onClick = {
//                            coroutineScope.launch {
//                                drawerState.close()
//                            }
//                            navigationController.navigate(Screens.Profile.screens){
//                                popUpTo(0)
//                            }
//                        })
//
//                    NavigationDrawerItem(label = { Text(text = "SETTTINGS", color = GreenJc)}, selected = false,
//                        icon = { androidx.compose.material3.Icon(imageVector = Icons.Default.Settings, contentDescription = "", tint = GreenJc) },
//                        onClick = {
//                            coroutineScope.launch {
//                                drawerState.close()
//                            }
//                            navigationController.navigate(Screens.Settings.screens){
//                                popUpTo(0)
//                            }
//                        })
//
//
//                }
//            }
//        }) {
//
//        // Modal Navigation Drawer starts
//
//        Scaffold (
//            topBar = {
//                val coroutineScope = rememberCoroutineScope()
//                TopAppBar(title = { Text(text = "WhatsApp") },
//                    colors = TopAppBarDefaults.topAppBarColors(
//                        containerColor = GreenJc,
//                        titleContentColor = Color.White,
//                        navigationIconContentColor = Color.White,
//                    ),
//                    navigationIcon = {
//                        IconButton(onClick = { }) {
//                            coroutineScope.launch {
//                                drawerState.open()
//                            }
//
//                        }
//
//                        androidx.compose.material3.Icon(imageVector = Icons.Rounded.Menu, contentDescription = "")
//
//                    })
//
//            }
//        ){
//
//            NavHost(navController = navigationController, startDestination = Screens.Home.screens){
//                composable(Screens.Home.screens){ Home()}
//                composable(Screens.Profile.screens){ Profile()}
//                composable(Screens.Settings.screens){ Settings() }
//
//            }
//        }
//
//
//
//
//    }
//
//}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    NavigationDrawerJetpackTheme{
//        LearnNavDrawer()
//    }
//}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LearnBottomNav(){
    val navigationController = rememberNavController()
    val context = LocalContext.current.applicationContext
    val selected = remember{
        mutableStateOf(Icons.Default.Home)
    }
    val sheetState = rememberModalBottomSheetState()
    var showBottomSheet by remember {
        mutableStateOf(false)
    }

    Scaffold (
        bottomBar = {
            BottomAppBar(containerColor = GreenJc) {
                IconButton(onClick = { selected.value = Icons.Default.Home
                navigationController.navigate(Screens.Home.screen){
                    popUpTo(0)
                }
                }, modifier = Modifier.weight(1f)) {
                    androidx.compose.material3.Icon(imageVector = Icons.Default.Home, contentDescription = null, modifier = Modifier.size(26.dp), tint = if (selected.value == Icons.Default.Home) Color.White else Color.DarkGray)


                }

                IconButton(onClick = { selected.value = Icons.Default.AccountBox
                    navigationController.navigate(Screens.Profile.screen){
                        popUpTo(0)
                    }
                }, modifier = Modifier.weight(1f)) {
                    androidx.compose.material3.Icon(imageVector = Icons.Default.AccountBox, contentDescription = null, modifier = Modifier.size(26.dp), tint = if (selected.value == Icons.Default.AccountBox) Color.White else Color.DarkGray)


                }

                Box (modifier = Modifier
                    .weight(1f)
                    .padding(16.dp) , contentAlignment = Alignment.Center) {
                    FloatingActionButton(onClick = { showBottomSheet = true }
                    ) {
                        androidx.compose.material3.Icon(imageVector = Icons.Default.Add, contentDescription = null, tint = GreenJc)
                    }
                }

                IconButton(onClick = { selected.value = Icons.Default.Settings
                    navigationController.navigate(Screens.Settings.screen){
                        popUpTo(0)
                    }
                }, modifier = Modifier.weight(1f)) {
                    androidx.compose.material3.Icon(imageVector = Icons.Default.Settings, contentDescription = null, modifier = Modifier.size(26.dp), tint = if (selected.value == Icons.Default.Settings) Color.White else Color.DarkGray)


                }

                IconButton(onClick = { selected.value = Icons.Default.Search
                    navigationController.navigate(Screens.Search.screen){
                        popUpTo(0)
                    }
                }, modifier = Modifier.weight(1f)) {
                    androidx.compose.material3.Icon(imageVector = Icons.Default.Search, contentDescription = null, modifier = Modifier.size(26.dp), tint = if (selected.value == Icons.Default.Search) Color.White else Color.DarkGray)
                }



            }
        }
    ) {paddingValues ->
        NavHost(navController = navigationController, startDestination = Screens.Home.screen, modifier = Modifier.padding(paddingValues)){
            composable(Screens.Home.screen){ Home()}
            composable(Screens.Profile.screen){ Profile() }
            composable(Screens.Settings.screen){ Settings() }
            composable(Screens.Search.screen){ Search()}
            composable(Screens.Post.screen){ Post() }

            }



    }

    if (showBottomSheet){
        ModalBottomSheet(onDismissRequest = { showBottomSheet = false },
            sheetState = sheetState) {

          Column (modifier = Modifier.fillMaxWidth()
              .padding(18.dp),
              verticalArrangement = Arrangement.spacedBy(20.dp)) {

              BottomSheetItem(icon = Icons.Default.ThumbUp, title = "Create a post")
              {
                  showBottomSheet = false
                  navigationController.navigate(Screens.Post.screen){
                      popUpTo(0)
                  }
              }

              BottomSheetItem(icon = Icons.Default.Call, title = "Call")
              {
                  Toast.makeText(context,"Call",Toast.LENGTH_SHORT).show()

              }

              BottomSheetItem(icon = Icons.Default.AddCircle, title = "Create a story")
              {
                  Toast.makeText(context,"Story",Toast.LENGTH_SHORT).show()

              }

              BottomSheetItem(icon = Icons.Default.Info, title = "Info")
              {
                  Toast.makeText(context,"Info",Toast.LENGTH_SHORT).show()

              }


          }
        }
    }
}

@Composable
fun BottomSheetItem(icon : ImageVector,title: String, onClick : () -> Unit){
    Row(verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        modifier = Modifier.clickable { onClick() })
    {

        androidx.compose.material3.Icon(imageVector = icon, contentDescription = null, tint = GreenJc)
        Text(text = title, fontSize = 22.sp)

    }
}

@Preview(showSystemUi = true)
@Composable
fun ShowPreview(){
    NavigationDrawerJetpackTheme{
        LearnBottomNav()
    }
}