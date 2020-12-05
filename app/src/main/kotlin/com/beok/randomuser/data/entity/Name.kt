package com.beok.randomuser.data.entity

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Name(
    @Json(name = "last")
    val last: String = "",
    @Json(name = "title")
    val title: String = "",
    @Json(name = "first")
    val first: String = ""
)
