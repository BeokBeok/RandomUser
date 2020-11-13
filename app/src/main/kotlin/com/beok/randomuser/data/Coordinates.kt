package com.beok.randomuser.data

import kotlinx.serialization.Serializable

@Serializable
data class Coordinates(
	val latitude: String = "",
	val longitude: String = ""
)
