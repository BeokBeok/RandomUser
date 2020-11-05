package com.beok.randomuser.entity

import kotlinx.serialization.Serializable

@Serializable
data class ResultsItem(
    val nat: String,
    val gender: String,
    val phone: String,
    val dob: Dob,
    val name: Name,
    val registered: Registered,
    val location: Location,
    val id: Id,
    val login: Login,
    val cell: String,
    val email: String,
    val picture: Picture
)
