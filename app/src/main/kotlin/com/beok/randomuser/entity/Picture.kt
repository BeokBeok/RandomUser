package com.beok.randomuser.entity

import kotlinx.serialization.Serializable

@Serializable
data class Picture(
	val thumbnail: String,
	val large: String,
	val medium: String
)
