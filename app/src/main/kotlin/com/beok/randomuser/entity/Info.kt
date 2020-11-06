package com.beok.randomuser.entity

import kotlinx.serialization.Serializable

@Serializable
data class Info(
	val seed: String = "",
	val page: Int = -1,
	val results: Int = -1,
	val version: String = ""
)
