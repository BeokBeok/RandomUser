package com.beok.randomuser.data

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class NameTest {

    @Test
    fun `Name 관련 Json 을 엔티티로 변환합니다`() {
        val response = Json.decodeFromString<Name>(NAME_JSON)

        assertThat(response.title).isEqualTo("Mrs")
        assertThat(response.first).isEqualTo("Kim")
        assertThat(response.last).isEqualTo("Bradley")
    }

    companion object {
        private const val NAME_JSON = """
            {
                "title":"Mrs",
                "first":"Kim",
                "last":"Bradley"
            }
        """
    }
}
