package com.beok.randomuser.entity

import com.beok.randomuser.MockData
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RandomUserResponseTest {

    @Test
    fun `한 사람의 정보에 대한 Json 을 엔티티로 변환합니다`() {
        val response = Json.decodeFromString<RandomUserResponse>(MockData.RANDOM_ONE_USER_JSON)

        assertThat(response.results.size).isEqualTo(1)
        assertThat(response.info.results).isEqualTo(1)
    }
}
