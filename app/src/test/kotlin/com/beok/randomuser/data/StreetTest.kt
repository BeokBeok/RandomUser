package com.beok.randomuser.data

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class StreetTest {

    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()
    private lateinit var jsonAdapter: JsonAdapter<Street>

    @BeforeEach
    fun setup() {
        jsonAdapter = moshi.adapter(Street::class.java)
    }

    @Test
    fun `Street 관련 Json 을 엔티티로 변환합니다`() {
        val response = jsonAdapter.fromJson(STREET_JSON) ?: Street()

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
