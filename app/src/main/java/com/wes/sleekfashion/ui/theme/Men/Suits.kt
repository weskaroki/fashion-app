package com.wes.sleekfashion.ui.theme.Men

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.wes.sleekfashion.R

@Composable
fun SuitsScreen(navController: NavController){
    Column (

        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)




    ){
        Navbar16()
        Spacer(modifier = Modifier.height(10.dp))
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
        ) {
            Image(
                painter = painterResource(id = R.drawable.suits
                ),
                contentDescription = "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.matchParentSize()
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
        AddProductsScreen(rememberNavController())


    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Navbar16(){
    val context = LocalContext.current.applicationContext
    TopAppBar(
        title = { Text(text = "Discover", color = Color.DarkGray) },
        navigationIcon = {
            IconButton(onClick = { Toast.makeText(context,"You have a clicked a home icon", Toast.LENGTH_SHORT).show() }) {
                Icon(imageVector = Icons.Filled.Home, contentDescription = "HOME", tint = Color.DarkGray)
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.White,
            titleContentColor = Color.White,
            navigationIconContentColor = Color.White
        ),
        actions = {
            IconButton(onClick = { Toast.makeText(context,"shopping cart", Toast.LENGTH_SHORT).show()}) {
                Icon(imageVector = Icons.Filled.ShoppingCart, contentDescription = "shop", tint = Color.DarkGray )
            }

        })
}

@Preview
@Composable
fun SuitsScreenPreview(){
    SuitsScreen(rememberNavController())
}

