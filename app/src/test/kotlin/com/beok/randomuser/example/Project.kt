package com.beok.randomuser.example

import kotlinx.serialization.Serializable

@Serializable
data class Project(val name: String, val language: String)
