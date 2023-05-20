package com.example.pertemuanketujuh

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class list_wisatavariabel(
    val fotoitm : Int = 0,
    val namaitm : String,
    val kategoriitm : String,
    val hargawitm : String,
    val merkitm : String,
) : Parcelable