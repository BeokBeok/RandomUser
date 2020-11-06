package com.beok.randomuser.entity

import kotlinx.serialization.Serializable

@Serializable
data class Id(
	val name: String = "",
	val value: String = ""
)
