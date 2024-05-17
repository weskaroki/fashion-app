package com.wes.sleekfashion.ui.theme.Kids

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
import com.wes.sleekfashion.navigation.ROUTE_JERSEY
import com.wes.sleekfashion.navigation.ROUTE_KIDS
import com.wes.sleekfashion.navigation.ROUTE_LADIES
import com.wes.sleekfashion.navigation.ROUTE_LOGIN
import com.wes.sleekfashion.navigation.ROUTE_MAIN_PRODUCTS_SCREEN
import com.wes.sleekfashion.navigation.ROUTE_MEN
import com.wes.sleekfashion.navigation.ROUTE_PAJAMAS
import com.wes.sleekfashion.navigation.ROUTE_SHIRTS
import com.wes.sleekfashion.navigation.ROUTE_SWEATERS
import com.wes.sleekfashion.ui.theme.Kids.ui.theme.SleekFashionTheme

class KidsActivity : ComponentActivity() {

    companion object {
    val items = listOf(
        Item(

            title = "shirts",
            image = R.drawable.kidsshirt,
            Route = ROUTE_SHIRTS,
            price = 700
        ),
        Item(
            title = "Pajamas",
            image = R.drawable.pajamas,
            Route = ROUTE_PAJAMAS,
            price = 1800
        ),
        Item(
            title = "sweaters",
            image = R.drawable.sweaters,
            Route = ROUTE_SWEATERS,
            price = 550

        ),
        Item(
            title = "Hot Sleevless basketball jerseys",
            image = R.drawable.bake,
            Route = ROUTE_JERSEY,
            price = 1800
//        )
//        ,
//
//
//        Item(
//
//            title = "handbags",
//            image = R.drawable.bag,
//            Route = ROUTE_LADIES,
//            price = 600
//        ),
//        Item(
//            title = "Heels",
//            image = R.drawable.heels,
//            Route = ROUTE_KIDS,
//            price = 3500
//        )

    )
    )

    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            SleekFashionTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting3(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}


@Composable
fun Greeting3(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview3() {
    SleekFashionTheme {
        Greeting3("Android")
    }
}