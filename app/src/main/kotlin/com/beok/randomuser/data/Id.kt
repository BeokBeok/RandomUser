package com.beok.randomuser.data

import kotlinx.serialization.Serializable

@Serializable
data class Id(
	val name: String = "",
	val value: String = ""
)
