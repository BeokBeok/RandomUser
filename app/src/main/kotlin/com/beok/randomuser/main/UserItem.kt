package com.beok.randomuser.main

import com.beok.randomuser.data.ResultsItem

data class UserItem(val imageUrl: String, val name: String) {

    companion object {

        fun toItem(resultsItem: ResultsItem) = UserItem(
            imageUrl = resultsItem.picture.thumbnail,
            name = "${resultsItem.name.title} ${resultsItem.name.first} ${resultsItem.name.last}"
        )
    }
}
