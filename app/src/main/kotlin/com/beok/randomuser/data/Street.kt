package com.beok.randomuser.data

import kotlinx.serialization.Serializable

@Serializable
data class Street(
	val number: Int = -1,
	val name: String = ""
)
