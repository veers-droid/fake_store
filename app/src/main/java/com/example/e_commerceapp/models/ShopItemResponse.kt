package com.example.e_commerceapp.models

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class ShopItemResponse(
    @SerializedName("id")
    val id : String,
    val title : String,
    val price : Float,
    val subtitle : String,
    val category : String,
    val image : String,
    val rank : String? = ""
) : Parcelable
