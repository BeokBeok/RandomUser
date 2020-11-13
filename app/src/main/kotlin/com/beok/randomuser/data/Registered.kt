package com.beok.randomuser.data

import kotlinx.serialization.Serializable

@Serializable
data class Registered(
	val date: String = "",
	val age: Int = -1
)
