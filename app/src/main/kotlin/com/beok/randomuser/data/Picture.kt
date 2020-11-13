package com.beok.randomuser.data

import kotlinx.serialization.Serializable

@Serializable
data class Picture(
	val thumbnail: String = "",
	val large: String = "",
	val medium: String = ""
)
