package com.example.utsrecycleview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Buku(
    val imgBuku: Int,
    val nameBuku: String,
    val descBuku: String
) : Parcelable
