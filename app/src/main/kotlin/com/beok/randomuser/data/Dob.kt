package com.beok.randomuser.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Dob(
	@Json(name = "date")
	val date: String = "",
	@Json(name = "age")
	val age: Int = -1
)
