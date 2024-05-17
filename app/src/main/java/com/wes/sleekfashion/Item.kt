package com.wes.sleekfashion

import androidx.annotation.DrawableRes

data class Item(
    val  title :String,
    @DrawableRes val image :Int,
    val Route :String,
    val price :Int
)
