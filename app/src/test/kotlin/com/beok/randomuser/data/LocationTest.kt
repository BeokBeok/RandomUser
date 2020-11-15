package com.beok.randomuser.data

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LocationTest {

    @Test
    fun `Location 관련 Json 을 엔티티로 변환합니다`() {
        val response = Json.decodeFromString<Location>(LOCATION_JSON)

        assertThat(response.city).isEqualTo("Cambridge")
        assertThat(response.state).isEqualTo("Cleveland")
        assertThat(response.country).isEqualTo("United Kingdom")
    }

    companion object {
        private const val LOCATION_JSON = """
            {
                "street":{
                   "number":8409,
                   "name":"Mill Road"
                },
                "city":"Cambridge",
                "state":"Cleveland",
                "country":"United Kingdom",
                "coordinates":{
                   "latitude":"14.4031",
                   "longitude":"57.7706"
                },
                "timezone":{
                   "offset":"0:00",
                   "description":"Western Europe Time, London, Lisbon, Casablanca"
                }
            }
        """
    }
}
