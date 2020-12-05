package com.beok.randomuser.data.entity

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ResultsItem(
    @Json(name = "nat")
    val nat: String = "",
    @Json(name = "gender")
    val gender: String = "",
    @Json(name = "phone")
    val phone: String = "",
    @Json(name = "dob")
    val dob: Dob = Dob(),
    @Json(name = "name")
    val name: Name = Name(),
    @Json(name = "registered")
    val registered: Registered = Registered(),
    @Json(name = "location")
    val location: Location = Location(),
    @Json(name = "id")
    val id: Id = Id(),
    @Json(name = "login")
    val login: Login = Login(),
    @Json(name = "cell")
    val cell: String = "",
    @Json(name = "email")
    val email: String = "",
    @Json(name = "picture")
    val picture: Picture = Picture()
)
