package com.beok.randomuser.data.entity

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Coordinates(
    @Json(name = "latitude")
    val latitude: String = "",
    @Json(name = "longitude")
    val longitude: String = ""
)
