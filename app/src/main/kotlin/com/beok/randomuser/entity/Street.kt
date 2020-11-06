package com.beok.randomuser.entity

import kotlinx.serialization.Serializable

@Serializable
data class Street(
	val number: Int = -1,
	val name: String = ""
)
