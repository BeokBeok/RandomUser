package com.beok.randomuser.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Location(
    @Json(name = "city")
    val city: String = "",
    @Json(name = "street")
    val street: Street = Street(),
    @Json(name = "timezone")
    val timezone: Timezone = Timezone(),
    @Json(name = "coordinates")
    val coordinates: Coordinates = Coordinates(),
    @Json(name = "state")
    val state: String = "",
    @Json(name = "country")
    val country: String = ""
)
