package com.wes.sleekfashion.ui.theme.Kids

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.wes.sleekfashion.Item
import com.wes.sleekfashion.MainActivity
import com.wes.sleekfashion.R
import com.wes.sleekfashion.navigation.ROUTE_ADD_TO_CART
import com.wes.sleekfashion.navigation.ROUTE_MAIN_PRODUCTS_SCREEN

@Composable
fun KidsScreen(navController: NavController){

    Column (

        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)




    ){
        Navbar(navController)
        Spacer(modifier = Modifier.height(20.dp))
        ImageCard(
            painter = painterResource(id = R.drawable.kids

            ),
            contentDescription = "mycard",

            )
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Kids Collection", color = Color.Black, fontSize = 30.sp)
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "New Arrivals", color = Color.DarkGray, fontSize = 19.sp)
        LazyGridScreen(navController)




    }


}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Navbar(navController: NavController){
    val context = LocalContext.current.applicationContext
    TopAppBar(
        title = { Text(text = "Discover", color = Color.DarkGray) },
        navigationIcon = {
            IconButton(onClick = { navController.navigate(ROUTE_MAIN_PRODUCTS_SCREEN)}) {
                Icon(imageVector = Icons.Filled.Home, contentDescription = "HOME", tint = Color.DarkGray)
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.White,
            titleContentColor = Color.White,
            navigationIconContentColor = Color.White
        ),
        actions = {
            IconButton(onClick = { navController.navigate(ROUTE_ADD_TO_CART)}) {
                Icon(imageVector = Icons.Filled.ShoppingCart, contentDescription = "shop", tint = Color.DarkGray )
            }

        })
}
@Composable
fun LazyGridScreen(navController: NavController){
    LazyVerticalGrid (
        modifier = Modifier
            .fillMaxSize()
        ,
        contentPadding = PaddingValues( vertical = 16.dp),
        columns = GridCells.Fixed(2)
    )
    {

        itemsIndexed(KidsActivity.items){ index, item ->
            GridItem(item = item ,navController)
//            Spacer(modifier = Modifier.width(10.dp))
//            Spacer(modifier = Modifier.height(10.dp))
        }


    }
}
@Composable
fun GridItem(item: Item, navController: NavController){
    Column(
        modifier = Modifier
            .padding(16.dp)
            .clip(RoundedCornerShape(8.dp))
            .background(Color.White)
            .fillMaxWidth()
            .wrapContentHeight()
            .padding(16.dp)
    ) {
        // Image
        Image(
            painter = painterResource(id = item.image),
            contentDescription = null,
            modifier = Modifier
                .height(200.dp)
                .fillMaxWidth(),
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(4.dp))

        // Item Name
        Text(
            text = "Fashion Kids ${item.title}",
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp,
            maxLines = 2,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(4.dp))

        // Price and Discount
        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "KSh ${item.price}",
                fontWeight = FontWeight.Bold,
                color = Color(0xFF00C853),
                fontSize = 16.sp,

                )
//            Spacer(modifier = Modifier.width(8.dp))

        }

        Spacer(modifier = Modifier.height(4.dp))

        // Rating and Express
//        Row(
//            verticalAlignment = Alignment.CenterVertically,
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            Text(
//                text = "★★★★☆",
//                color = Color(0xFFFFD700),
//                fontSize = 14.sp
//            )
//            Spacer(modifier = Modifier.width(4.dp))
//            Text(
//                text = "(15)",
//                color = Color.Gray,
//                fontSize = 14.sp
//            )
//            Spacer(modifier = Modifier.weight(1f))
//            Text(
//                text = "JUMIA EXPRESS",
//                color = Color(0xFFFF5722),
//                fontSize = 12.sp,
//                fontWeight = FontWeight.Bold
//            )
//        }

        Spacer(modifier = Modifier.height(4.dp))

        // Add to Cart Button
        Button(
            onClick = { navController.navigate(item.Route) },
            colors = ButtonDefaults.buttonColors( Color.Yellow),
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(
                text = "Proceed",
                color = Color.White,
//                fontWeight = FontWeight.Bold
            )
        }
    }
}





@Composable
fun ImageCard(painter: Painter, contentDescription: String, ) {
    Column(
    ) {


        Card(
            modifier = Modifier
                .fillMaxWidth()

                .wrapContentWidth()
                .fillMaxHeight(0.2f),



            shape = RoundedCornerShape(20.dp),
            elevation = CardDefaults.cardElevation(20.dp)
        ) {
            Box(
                modifier = Modifier.fillMaxSize()
            ) {
                Image(
                    painter = painter,
                    contentDescription = contentDescription,
                    contentScale = ContentScale.FillBounds,
                    modifier =Modifier.matchParentSize()

                    ,

                    )

            }
        }
    }
}

@Preview
@Composable
fun KidsPreview(){
    KidsScreen(rememberNavController())
}