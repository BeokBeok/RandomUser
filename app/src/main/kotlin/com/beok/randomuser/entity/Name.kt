package com.beok.randomuser.entity

import kotlinx.serialization.Serializable

@Serializable
data class Name(
    val last: String = "",
    val title: String = "",
    val first: String = ""
)
