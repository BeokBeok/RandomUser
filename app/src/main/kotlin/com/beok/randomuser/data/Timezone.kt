package com.beok.randomuser.data

import kotlinx.serialization.Serializable

@Serializable
data class Timezone(
	val offset: String = "",
	val description: String = ""
)
