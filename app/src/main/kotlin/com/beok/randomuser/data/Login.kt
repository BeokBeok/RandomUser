package com.beok.randomuser.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Login(
	@Json(name = "sha1")
	val sha1: String = "",
	@Json(name = "password")
	val password: String = "",
	@Json(name = "salt")
	val salt: String = "",
	@Json(name = "sha256")
	val sha256: String = "",
	@Json(name = "uuid")
	val uuid: String = "",
	@Json(name = "username")
	val username: String = "",
	@Json(name = "md5")
	val md5: String = ""
)
