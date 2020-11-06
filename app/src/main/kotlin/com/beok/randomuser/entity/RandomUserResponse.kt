package com.beok.randomuser.entity

import kotlinx.serialization.Serializable

@Serializable
data class RandomUserResponse(
	val results: List<ResultsItem> = emptyList(),
	val info: Info = Info()
)
