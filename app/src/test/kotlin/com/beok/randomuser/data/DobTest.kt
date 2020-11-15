package com.beok.randomuser.data

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class DobTest {

    @Test
    fun `Dob 관련 Json 을 엔티티로 변환합니다`() {
        val response = Json.decodeFromString<Dob>(DOB_JSON)

        assertThat(response.date).isEqualTo("1949-10-19T17:12:12.248Z")
        assertThat(response.age).isEqualTo(71)
    }

    companion object {
        private const val DOB_JSON = """
            {
                "date":"1949-10-19T17:12:12.248Z",
                "age":71
            }  
        """
    }
}
