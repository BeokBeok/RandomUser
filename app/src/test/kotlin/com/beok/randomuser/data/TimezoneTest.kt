package com.beok.randomuser.data

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class TimezoneTest {

    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()
    private lateinit var jsonAdapter: JsonAdapter<Timezone>

    @BeforeEach
    fun setup() {
        jsonAdapter = moshi.adapter(Timezone::class.java)
    }

    @Test
    fun `Timezone 관련 Json 을 엔티티로 변환합니다`() {
        val response = jsonAdapter.fromJson(TIMEZONE_JSON) ?: Timezone()

        assertThat(response.offset).isEqualTo("0:00")
        assertThat(response.description)
            .isEqualTo("Western Europe Time, London, Lisbon, Casablanca")
    }

    companion object {
        private const val TIMEZONE_JSON =
            """
                {
                   "offset":"0:00",
                   "description":"Western Europe Time, London, Lisbon, Casablanca"
                }
            """
    }
}
