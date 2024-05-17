package com.wes.sleekfashion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.wes.sleekfashion.navigation.AppNavHost
import com.wes.sleekfashion.navigation.ROUTE_KIDS
import com.wes.sleekfashion.navigation.ROUTE_LADIES
import com.wes.sleekfashion.navigation.ROUTE_MEN
import com.wes.sleekfashion.ui.theme.SleekFashionTheme

class MainActivity : ComponentActivity() {


    companion object{
        val items = listOf(
            Item(

                title =   "Ladies Collection"

                ,
                image = R.drawable.lady,
                Route = ROUTE_LADIES,
                price = 2
            )
            ,
            Item(
                title = "Kids Collection",
                image = R.drawable.child,
                Route = ROUTE_KIDS,
                price = 2
            )
            ,
            Item(
                title = "Mens Collection",
                image = R.drawable.man,
                Route = ROUTE_MEN,
                price = 2

            )




        )
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SleekFashionTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                   AppNavHost()
                }
            }
        }
    }
}

