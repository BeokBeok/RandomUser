package com.beok.randomuser.data

import kotlinx.serialization.Serializable

@Serializable
data class ResultsItem(
    val nat: String = "",
    val gender: String = "",
    val phone: String = "",
    val dob: Dob = Dob(),
    val name: Name = Name(),
    val registered: Registered = Registered(),
    val location: Location = Location(),
    val id: Id = Id(),
    val login: Login = Login(),
    val cell: String = "",
    val email: String = "",
    val picture: Picture = Picture()
)
