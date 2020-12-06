package com.beok.randomuser.data.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class RandomUserTable(
    @PrimaryKey
    val name: String,
    val gender: String
) {

    companion object {
        fun mapToTable(resultsItem: ResultsItem) = RandomUserTable(
            name = "${resultsItem.name.title} ${resultsItem.name.first} ${resultsItem.name.last}",
            gender = resultsItem.gender
        )
    }
}
