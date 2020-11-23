package com.beok.randomuser.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Info(
    @Json(name = "seed")
    val seed: String = "",
    @Json(name = "page")
    val page: Int = -1,
    @Json(name = "results")
    val results: Int = -1,
    @Json(name = "version")
    val version: String = ""
)
