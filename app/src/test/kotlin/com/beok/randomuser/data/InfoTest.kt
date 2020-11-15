package com.beok.randomuser.data

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class InfoTest {

    @Test
    fun `Info 관련 Json 을 엔티티로 변환합니다`() {
        val response = Json.decodeFromString<Info>(INFO_JSON)

        assertThat(response.seed).isEqualTo("a55a645d68a46915")
        assertThat(response.results).isEqualTo(1)
        assertThat(response.page).isEqualTo(1)
        assertThat(response.version).isEqualTo("1.3")
    }

    companion object {
        private const val INFO_JSON = """
            {
              "seed":"a55a645d68a46915",
              "results":1,
              "page":1,
              "version":"1.3"
            }
        """
    }
}
