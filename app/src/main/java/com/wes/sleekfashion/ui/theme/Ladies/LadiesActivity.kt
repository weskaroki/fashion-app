package com.wes.sleekfashion.ui.theme.Ladies

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
import com.wes.sleekfashion.navigation.ROUTE_BAG
import com.wes.sleekfashion.navigation.ROUTE_DRESS
import com.wes.sleekfashion.navigation.ROUTE_GHOODIE
import com.wes.sleekfashion.navigation.ROUTE_HEELS
import com.wes.sleekfashion.navigation.ROUTE_HOODIE
import com.wes.sleekfashion.navigation.ROUTE_KIDS
import com.wes.sleekfashion.navigation.ROUTE_LADIES
import com.wes.sleekfashion.navigation.ROUTE_LOGIN
import com.wes.sleekfashion.navigation.ROUTE_MAIN_PRODUCTS_SCREEN
import com.wes.sleekfashion.navigation.ROUTE_MEN
import com.wes.sleekfashion.navigation.ROUTE_PANTS
import com.wes.sleekfashion.navigation.ROUTE_TOPS
import com.wes.sleekfashion.ui.theme.Ladies.ui.theme.SleekFashionTheme

class LadiesActivity : ComponentActivity() {


    companion object{
        val items = listOf(
            Item(

                title =   "Hoodie"

                ,
                image = R.drawable.ghoodies,
                Route = ROUTE_GHOODIE,
                price = 2500
            )
            ,
            Item(
                title = "Dress",
                image = R.drawable.dress,
                Route = ROUTE_DRESS,
                price = 2200
            )
            ,
            Item(
                title = "pants",
                image = R.drawable.pants
                ,
                Route = ROUTE_PANTS,
                price = 1000

            )

            ,
            Item(
                title = "Tops",
                image = R.drawable.tops,
                Route = ROUTE_TOPS,
                price = 800
            )
            ,


            Item(

                title =   "handbags"

                ,
                image = R.drawable.bag,
                Route = ROUTE_BAG,
                price = 1300
            )
            ,
            Item(
                title = "Heels",
                image = R.drawable.heels,
                Route = ROUTE_HEELS,
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
                    Greeting2(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting2(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview2() {
    SleekFashionTheme {
        Greeting2("Android")
    }
}