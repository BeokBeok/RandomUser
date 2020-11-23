package com.beok.randomuser.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RandomUserResponse(
    @Json(name = "results")
    val results: List<ResultsItem> = emptyList(),
    @Json(name = "info")
    val info: Info = Info()
)
