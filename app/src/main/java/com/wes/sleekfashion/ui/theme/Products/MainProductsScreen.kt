package com.wes.sleekfashion.ui.theme.Products

import android.graphics.drawable.Icon
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.lazy.LazyColumn
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


@Composable
fun MAINProductScreen(navController: NavController){
    Column (

        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)



    ){
        Navbar()
        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Explore", color = Color.White, fontSize = 30.sp)
        Text(text = "Our Collections", color = Color.White, fontSize = 30.sp)

        Spacer(modifier = Modifier.height(20.dp))



        LazyColumnScreen( navController)
//        ImageCard(
//            painter = painterResource(id = R.drawable.child
//            ),
//            contentDescription = "mycard",
//            title = "Children's Collection"
//        )
//        Spacer(modifier = Modifier.height(5.dp))
//        ImageCard2(
//            painter2 = painterResource(id = R.drawable.ladyy
//            ),
//            contentDescription2 = "mycard2",
//            title2 = "Ladies Collection"
//        )


    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Navbar(){
    val context = LocalContext.current.applicationContext
    TopAppBar(
        title = { Text(text = "Sleek Fashion", color = Color.DarkGray) },
        navigationIcon = {
            IconButton(onClick = { Toast.makeText(context,"You have a clicked a home icon",Toast.LENGTH_SHORT).show() }) {
                Icon(imageVector = Icons.Filled.Home, contentDescription = "HOME", tint = Color.DarkGray)
            }
        },
        colors = TopAppBarDefaults.topAppBarColors(
            containerColor = Color.White,
            titleContentColor = Color.White,
            navigationIconContentColor = Color.White
        ),
        actions = {
            IconButton(onClick = { Toast.makeText(context,"shopping cart",Toast.LENGTH_SHORT).show()}) {
                Icon(imageVector = Icons.Filled.ShoppingCart, contentDescription = "shop", tint = Color.DarkGray )
            }
            IconButton(onClick = { Toast.makeText(context,"You can now share",Toast.LENGTH_SHORT) .show()}) {
                Icon(imageVector = Icons.Filled.AccountCircle, contentDescription = "Account", tint = Color.DarkGray)
            }
        })
}
@Composable
fun ImageCard(painter: Painter, contentDescription: String, title: String) {
    Column() {


        Card(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(),


            shape = RoundedCornerShape(15.dp),
            elevation = CardDefaults.cardElevation(20.dp)
        ) {
            Box(
                modifier = Modifier.height(200.dp)
            ) {
                Image(
                    painter = painter,
                    contentDescription = contentDescription,
                    contentScale = ContentScale.Crop
                )
                Box(
                    modifier = Modifier
                        .matchParentSize()
                        .padding(15.dp),
                    contentAlignment = Alignment.BottomStart

                ) {
                    Text(
                        text = title,
                        fontSize = 20.sp,
                        color = Color.DarkGray,

                        )

                }
            }
        }
    }
}
@Composable
fun ImageCard2(painter2: Painter, contentDescription2: String, title2: String) {
    Column() {


        Card(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentWidth(),
            shape = RoundedCornerShape(15.dp),
            elevation = CardDefaults.cardElevation(20.dp)
        ) {
            Box(
                modifier = Modifier.height(200.dp)
            ) {
                Image(
                    painter = painter2,
                    contentDescription = contentDescription2,
                    contentScale = ContentScale.Crop
                )
                Box(
                    modifier = Modifier
                        .matchParentSize()
                        .padding(15.dp),
                    contentAlignment = Alignment.BottomStart

                ) {
                    Text(
                        text = title2,
                        fontSize = 20.sp,
                        color = Color.DarkGray,

                        )

                }
            }
        }
    }
}



@Composable
fun LazyColumnScreen(navController:NavController){
    LazyColumn (
        modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues(16.dp)
    )
    {

        itemsIndexed(MainActivity.items){ index, item ->
            ColumnItem(item = item)
            Spacer(modifier = Modifier.width(8.dp))
            Spacer(modifier = Modifier.height(15.dp))
            Button(onClick = { navController.navigate(item.Route)  }, colors = ButtonDefaults.buttonColors(Color.Yellow)) {
                Text(text = item.title)
            }
        }


    }
}
@Composable
fun ColumnItem(item: Item){
    Column (
        modifier = Modifier
            .clip(RoundedCornerShape(30.dp))
            .height(250.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = item.image),
            contentDescription = item.title,
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(8.dp))


    }
}



@Preview(showBackground = true, showSystemUi = true)
@Composable
fun  MAINProductScreenPreview(){
    MAINProductScreen(rememberNavController())



}