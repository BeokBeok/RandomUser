package com.beok.randomuser.data.entity

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class LocationTest {

    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()
    private lateinit var jsonAdapter: JsonAdapter<Location>

    @BeforeEach
    fun setup() {
        jsonAdapter = moshi.adapter(Location::class.java)
    }

    @Test
    fun `Location 관련 Json 을 엔티티로 변환합니다`() {
        val response = jsonAdapter.fromJson(LOCATION_JSON) ?: Location()

        assertThat(response.city).isEqualTo("Cambridge")
        assertThat(response.state).isEqualTo("Cleveland")
        assertThat(response.country).isEqualTo("United Kingdom")
    }

    companion object {
        private const val LOCATION_JSON =
            """
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
