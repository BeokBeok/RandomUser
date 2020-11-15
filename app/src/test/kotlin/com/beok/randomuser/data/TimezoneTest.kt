package com.beok.randomuser.data

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class TimezoneTest {

    @Test
    fun `Timezone 관련 Json 을 엔티티로 변환합니다`() {
        val response = Json.decodeFromString<Timezone>(TIMEZONE_JSON)

        assertThat(response.offset).isEqualTo("0:00")
        assertThat(response.description).isEqualTo("Western Europe Time, London, Lisbon, Casablanca")
    }

    companion object {
        private const val TIMEZONE_JSON = """
            {
               "offset":"0:00",
               "description":"Western Europe Time, London, Lisbon, Casablanca"
            }
        """
    }
}
