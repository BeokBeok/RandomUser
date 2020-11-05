package com.beok.randomuser.entity

import kotlinx.serialization.Serializable

@Serializable
data class Location(
    val city: String,
    val street: Street,
    val timezone: Timezone,
    val postcode: String,
    val coordinates: Coordinates,
    val state: String,
    val country: String
)
