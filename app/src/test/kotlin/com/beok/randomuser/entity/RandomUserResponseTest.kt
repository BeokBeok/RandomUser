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

    @Test
    fun `필드값에 null 이 있는 경우 기본값으로 초기화합니다`() {
        val response = Json {
            coerceInputValues = true
        }.decodeFromString<RandomUserResponse>(MockData.NULL_VALUE_CONTAINED_JSON)

        assertThat(response.results.size).isEqualTo(1)
        assertThat(response.info.results).isEqualTo(1)
    }

    @Test
    fun `멀티 타입을 제공하는 변수 (postcode 필드) 는 무시합니다`() {
        val response = Json {
            ignoreUnknownKeys = true
        }.decodeFromString<RandomUserResponse>(MockData.MIXED_TYPE_JSON)

        assertThat(response.results.size).isEqualTo(2)
        assertThat(response.info.results).isEqualTo(2)
    }
}
