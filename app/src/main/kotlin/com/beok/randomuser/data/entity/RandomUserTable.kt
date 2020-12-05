package com.beok.randomuser.data.entity

import androidx.room.Entity

@Entity(tableName = "user")
data class RandomUserTable(
    val name: String
)
