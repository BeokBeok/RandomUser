package com.beok.randomuser.entity

import kotlinx.serialization.Serializable

@Serializable
data class Coordinates(
	val latitude: String,
	val longitude: String
)
