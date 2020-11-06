package com.beok.randomuser.entity

import kotlinx.serialization.Serializable

@Serializable
data class Location(
    val city: String = "",
    val street: Street = Street(),
    val timezone: Timezone = Timezone(),
    val coordinates: Coordinates = Coordinates(),
    val state: String = "",
    val country: String = ""
)
