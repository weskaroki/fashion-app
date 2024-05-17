package com.wes.sleekfashion.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.google.firebase.database.collection.R
import com.wes.sleekfashion.ui.theme.Home.HomeScreen
import com.wes.sleekfashion.ui.theme.Home.HomeScreenPreview
import com.wes.sleekfashion.ui.theme.Kids.JerseyScreen
import com.wes.sleekfashion.ui.theme.Kids.KidsScreen
import com.wes.sleekfashion.ui.theme.Kids.KidsShirtScreen
import com.wes.sleekfashion.ui.theme.Kids.PajamasScreen
import com.wes.sleekfashion.ui.theme.Kids.SweatersScreen
import com.wes.sleekfashion.ui.theme.Ladies.BagScreen
import com.wes.sleekfashion.ui.theme.Ladies.DressScreen
import com.wes.sleekfashion.ui.theme.Ladies.GHoodieScreen
import com.wes.sleekfashion.ui.theme.Ladies.HeelsScreen
import com.wes.sleekfashion.ui.theme.Ladies.LadiesScreen
import com.wes.sleekfashion.ui.theme.Ladies.PantsScreen
import com.wes.sleekfashion.ui.theme.Ladies.TopsScreen
import com.wes.sleekfashion.ui.theme.Login.LoginScreen
import com.wes.sleekfashion.ui.theme.Men.HoodieScreen
import com.wes.sleekfashion.ui.theme.Men.JeansScreen
import com.wes.sleekfashion.ui.theme.Men.MensScreen
import com.wes.sleekfashion.ui.theme.Men.ShirtsScreen
import com.wes.sleekfashion.ui.theme.Men.ShoeScreen
import com.wes.sleekfashion.ui.theme.Men.SuitsScreen
import com.wes.sleekfashion.ui.theme.Men.TracksScreen
import com.wes.sleekfashion.ui.theme.Products.AddToCartScreen
import com.wes.sleekfashion.ui.theme.Products.MAINProductScreen
import com.wes.sleekfashion.ui.theme.Register.RegisterScreen


@Composable
fun AppNavHost(modifier: Modifier = Modifier,
               navController: NavHostController= rememberNavController()
               , startDestination:String = ROUTE_HOODIE) {

    NavHost(navController = navController ,
        modifier = Modifier,
        startDestination = startDestination) {
        composable(ROUTE_HOME){ HomeScreen(navController = navController)}
        composable(ROUTE_LOGIN){ LoginScreen(navController = navController) }
        composable(ROUTE_REGISTER){ RegisterScreen(navController = navController) }
        composable(ROUTE_MAIN_PRODUCTS_SCREEN){ MAINProductScreen(navController = navController) }
        composable(ROUTE_MEN){ MensScreen(navController = navController)}
        composable(ROUTE_LADIES){ LadiesScreen(navController = navController)}
        composable(ROUTE_KIDS){ KidsScreen(navController = navController)}
        composable(ROUTE_HOODIE){ HoodieScreen(navController = navController)}
        composable(ROUTE_JEANS){ JeansScreen(navController = navController) }
        composable(ROUTE_SHIRTS){ ShirtsScreen(navController = navController) }
        composable(ROUTE_SHOES){ ShoeScreen(navController = navController) }
        composable(ROUTE_SUITS){ SuitsScreen(navController = navController) }
        composable(ROUTE_TRACKS){ TracksScreen(navController = navController) }
        composable(ROUTE_BAG){ BagScreen(navController = navController) }
        composable(ROUTE_DRESS){ DressScreen(navController = navController) }
        composable(ROUTE_GHOODIE){ GHoodieScreen(navController = navController) }
        composable(ROUTE_HEELS){ HeelsScreen(navController = navController) }
        composable(ROUTE_PANTS){ PantsScreen(navController = navController) }
        composable(ROUTE_TOPS){ TopsScreen(navController = navController) }
        composable(ROUTE_JERSEY){ JerseyScreen(navController = navController) }
        composable(ROUTE_KIDSSHIRT){ KidsShirtScreen(navController = navController) }
        composable(ROUTE_PAJAMAS){ PajamasScreen(navController = navController) }
        composable(ROUTE_SWEATERS){ SweatersScreen(navController = navController) }
        composable(ROUTE_ADD_TO_CART){ AddToCartScreen(navController = navController)}

    }
}