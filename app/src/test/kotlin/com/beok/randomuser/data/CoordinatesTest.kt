package com.beok.randomuser.data

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CoordinatesTest {

    @Test
    fun `Coordinates 관련 Json 을 엔티티로 변환합니다`() {
        val response = Json.decodeFromString<Coordinates>(COORDINATES_JSON)

        assertThat(response.latitude).isEqualTo("14.4031")
        assertThat(response.longitude).isEqualTo("57.7706")
    }

    companion object {
        private const val COORDINATES_JSON = """
            {
               "latitude":"14.4031",
               "longitude":"57.7706"
            }
        """
    }
}
