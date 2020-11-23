package com.beok.randomuser.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Street(
    @Json(name = "number")
    val number: Int = -1,
    @Json(name = "name")
    val name: String = ""
)
