package com.beok.randomuser.data

import kotlinx.serialization.Serializable

@Serializable
data class Dob(
	val date: String = "",
	val age: Int = -1
)
