package com.example.e_commerceapp.models

import com.google.gson.annotations.SerializedName

data class ShopItemResponse(
    @SerializedName("id")
    val id : String,
    val title : String,
    val price : Float,
    val subtitle : String,
    val category : String,
    val image : String,
    val rank : String? = ""
)
