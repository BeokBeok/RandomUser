package com.beok.randomuser.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class RandomUserTable(
    @PrimaryKey
    val name: String
)
