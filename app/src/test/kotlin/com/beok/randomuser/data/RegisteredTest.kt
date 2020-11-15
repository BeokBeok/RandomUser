package com.beok.randomuser.data

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class RegisteredTest {

    @Test
    fun `Registered 관련 Json 을 엔티티로 변환합니다`() {
        val response = Json.decodeFromString<Registered>(REGISTERED_JSON)

        assertThat(response.date).isEqualTo("2016-10-11T20:21:14.933Z")
        assertThat(response.age).isEqualTo(4)
    }

    companion object {
        private const val REGISTERED_JSON = """
            {
                "date":"2016-10-11T20:21:14.933Z",
                "age":4
            }
        """
    }
}
