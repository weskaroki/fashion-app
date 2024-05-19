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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.wes.sleekfashion.R
import com.wes.sleekfashion.data.ProductViewModel
import com.wes.sleekfashion.navigation.ROUTE_ADD_TO_CART
import com.wes.sleekfashion.navigation.ROUTE_MAIN_PRODUCTS_SCREEN
import com.wes.sleekfashion.ui.theme.Products.AddProductsScreen


@Composable
fun JeansScreen(navController: NavHostController){

    Column (

        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)




    ){
    Navbar13(navController)
        Spacer(modifier = Modifier.height(10.dp))
        Box (
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.5f)
        ) {
            Image(
                painter = painterResource(id = R.drawable.jeans),
                contentDescription = "",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.matchParentSize()
            )
        }
        Spacer(modifier = Modifier.height(30.dp))
        AddProductsScreen(navController)

    }
}
//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun AddProductsScreen2(navController: NavHostController) {
//    Column(modifier = Modifier.fillMaxSize(),
//        horizontalAlignment = Alignment.CenterHorizontally) {
//        var context = LocalContext.current
////        Text(
////            text = "Add product",
////            fontSize = 30.sp,
////            fontFamily = FontFamily.Cursive,
////            color = Color.Red,
////            modifier = Modifier.padding(20.dp),
////            fontWeight = FontWeight.Bold,
////            textDecoration = TextDecoration.Underline
////        )
//
//        var productName by remember { mutableStateOf(TextFieldValue("")) }
//        var productQuantity by remember { mutableStateOf(TextFieldValue("")) }
//        var productPrice by remember { mutableStateOf(TextFieldValue("")) }
//
//        OutlinedTextField(
//            value = productName,
//            onValueChange = { productName = it},
//            label = { Text(text = "Jeans *") },
//
//
//            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
//        )
//
//        Spacer(modifier = Modifier.height(20.dp))
//
//        OutlinedTextField(
//            value = productQuantity,
//            onValueChange = { productQuantity = it },
//            label = { Text(text = "Product quantity *") },
//            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
//        )
//
//        Spacer(modifier = Modifier.height(20.dp))
//
//        OutlinedTextField(
//            value = productPrice,
//            onValueChange = { productPrice = it },
//            label = { Text(text = "Product price *") },
//            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
//        )
//
//        Spacer(modifier = Modifier.height(20.dp))
//
//        Button(onClick = {
//
//            val productRepository = ProductViewModel(navController,context)
//            productRepository.saveProduct(productName.text.trim(),productQuantity.text.trim(),
//                productPrice.text)
//            navController.navigate(ROUTE_ADD_TO_CART)
//
//
//        }) {
//            Text(text = "ADD TO CART")
//        }
//        Spacer(modifier = Modifier.height(20.dp))
//
//        //---------------------IMAGE PICKER START-----------------------------------//
//
////        ImagePicker(Modifier,context, navController, productName.text.trim(), productQuantity.text.trim(), productPrice.text.trim())
//
//
//    }
//}
//

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Navbar13(navController: NavController){
    val context = LocalContext.current.applicationContext
    TopAppBar(
        title = { Text(text = "Shop", color = Color.DarkGray) },
        navigationIcon = {
            IconButton(onClick = { navController.navigate(ROUTE_MAIN_PRODUCTS_SCREEN) }) {
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
@Preview
@Composable
fun JeansScreenPreview(){
    JeansScreen(rememberNavController())
}


