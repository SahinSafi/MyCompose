package com.comp.mycompose

import android.content.Context
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.comp.mycompose.ui.theme.MyComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyComposeTheme {
                Scaffold(topBar = {
                    MyTopAppBar(applicationContext)
                },
                floatingActionButton = {
                    FloatingActionButton(onClick = { }) {
                        IconButton(onClick = {}) {
                            Icon(Icons.Filled.Add, contentDescription = "")
                        }
                    }
                }) {

                }
            }
        }
    }
}

@Composable
fun MyTopAppBar(context : Context? = null) {
    TopAppBar(
        title = {
            Text(text = "My Compose")
        },
        navigationIcon = {
            IconButton(onClick = {}) {
                Icon(Icons.Filled.Menu, contentDescription = "")
            }
        },
        actions = {
            IconButton(onClick = {
                Toast.makeText(context, "Notification", Toast.LENGTH_LONG).show()
            }) {
                Icon(Icons.Filled.Notifications, contentDescription = "")
            }
            IconButton(onClick = {
                Toast.makeText(context, "Search", Toast.LENGTH_LONG).show()
            }) {
                Icon(Icons.Filled.Search, contentDescription = "")
            }
        }
    )
}



@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyComposeTheme {
        MyTopAppBar()
    }
}