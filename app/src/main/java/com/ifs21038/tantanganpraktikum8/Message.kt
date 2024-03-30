package com.ifs21038.tantanganpraktikum8

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
@Parcelize
data class Message(
    var name: String,
    var icon: Int,
    var pesan: String,
) : Parcelable