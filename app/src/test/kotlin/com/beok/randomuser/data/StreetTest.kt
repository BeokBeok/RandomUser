package com.beok.randomuser.data

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class StreetTest {

    @Test
    fun `Street 관련 Json 을 엔티티로 변환합니다`() {
        val response = Json.decodeFromString<Street>(STREET_JSON)

        assertThat(response.number).isEqualTo(8409)
        assertThat(response.name).isEqualTo("Mill Road")
    }

    companion object {
        private const val STREET_JSON = """
            {
               "number":8409,
               "name":"Mill Road"
            }
        """
    }
}
