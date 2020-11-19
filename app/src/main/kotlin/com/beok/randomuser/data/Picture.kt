package com.beok.randomuser.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Picture(
	@Json(name = "thumbnail")
	val thumbnail: String = "",
	@Json(name = "large")
	val large: String = "",
	@Json(name = "medium")
	val medium: String = ""
)
