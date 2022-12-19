package com.flycode.fragments.model.data

import java.io.Serializable

data class Item(
    val id:Int,
    val title:String,
    val price:Int,
    val imageRes:Int? = null,
    val imageUrl:String? = null
):Serializable