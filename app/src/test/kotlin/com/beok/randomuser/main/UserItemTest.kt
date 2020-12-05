package com.beok.randomuser.main

import com.beok.randomuser.data.entity.Name
import com.beok.randomuser.data.entity.Picture
import com.beok.randomuser.data.entity.ResultsItem
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UserItemTest {

    @Test
    fun `ResultsItem 을 UserItem 으로 변환합니다`() {
        val resultsItem = ResultsItem(
            name = Name(last = "Austin", title = "Mrs", first = "Steve"),
            picture = Picture(thumbnail = "https://www.naver.com")
        )
        val userItem = UserItem.toItem(resultsItem)

        userItem.run {
            assertThat(imageUrl).isEqualTo("https://www.naver.com")
            assertThat(name).isEqualTo("Mrs Steve Austin")
        }
    }
}
