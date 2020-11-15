package com.beok.randomuser.data

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class IdTest {

    @Test
    fun `ID 관련 Json 을 엔티티로 변환합니다`() {
        val response = Json.decodeFromString<Id>(ID_JSON)

        assertThat(response.name).isEqualTo("NINO")
        assertThat(response.value).isEqualTo("KE 47 46 34 N")
    }

    companion object {
        private const val ID_JSON = """
            {
                "name":"NINO",
                "value":"KE 47 46 34 N"
            }  
        """
    }
}
