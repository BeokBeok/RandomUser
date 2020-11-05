package com.beok.randomuser.entity

import kotlinx.serialization.Serializable

@Serializable
data class Info(
	val seed: String,
	val page: Int,
	val results: Int,
	val version: String
)
