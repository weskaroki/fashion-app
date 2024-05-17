package com.wes.sleekfashion.ui.theme.Men

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.wes.sleekfashion.Item
import com.wes.sleekfashion.R
import com.wes.sleekfashion.navigation.ROUTE_HOODIE
import com.wes.sleekfashion.navigation.ROUTE_JEANS
import com.wes.sleekfashion.navigation.ROUTE_KIDS
import com.wes.sleekfashion.navigation.ROUTE_LADIES
import com.wes.sleekfashion.navigation.ROUTE_LOGIN
import com.wes.sleekfashion.navigation.ROUTE_MAIN_PRODUCTS_SCREEN
import com.wes.sleekfashion.navigation.ROUTE_MEN
import com.wes.sleekfashion.navigation.ROUTE_SHIRTS
import com.wes.sleekfashion.navigation.ROUTE_SHOES
import com.wes.sleekfashion.navigation.ROUTE_SUITS
import com.wes.sleekfashion.navigation.ROUTE_TRACKS
import com.wes.sleekfashion.ui.theme.Men.ui.theme.SleekFashionTheme

class MensActivity : ComponentActivity() {

    companion object{
        val items = listOf(
            Item(

                title =   "Hoodie"

                ,
                image = R.drawable.hoodies,
                Route = ROUTE_HOODIE,
                price = 2500
            )
            ,
            Item(
                title = "Tracks",
                image = R.drawable.tracks,
                Route = ROUTE_TRACKS,
                price = 1800
            )
            ,
            Item(
                title = "Jeans",
                image = R.drawable.jeans,
                Route = ROUTE_JEANS,
                price = 1000

            )

            ,
            Item(
                title = "suits",
                image = R.drawable.suits

                ,
                Route = ROUTE_SUITS,
                price = 3000
            )
            ,


            Item(

                title =   "Shirt"

                ,
                image = R.drawable.shirtss,
                Route = ROUTE_SHIRTS,
                price = 600
            )
            ,
            Item(
                title = "Air Force",
                image = R.drawable.shoes,
                Route = ROUTE_SHOES,
                price = 3500
            )

        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SleekFashionTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    SleekFashionTheme {
        Greeting("Android")
    }
}