package com.beok.randomuser.data

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class RegisteredTest {

    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()
    private lateinit var jsonAdapter: JsonAdapter<Registered>

    @BeforeEach
    fun setup() {
        jsonAdapter = moshi.adapter(Registered::class.java)
    }

    @Test
    fun `Registered 관련 Json 을 엔티티로 변환합니다`() {
        val response = jsonAdapter.fromJson(REGISTERED_JSON) ?: Registered()

        assertThat(response.date).isEqualTo("2016-10-11T20:21:14.933Z")
        assertThat(response.age).isEqualTo(4)
    }

    companion object {
        private const val REGISTERED_JSON = """
            {
                "date":"2016-10-11T20:21:14.933Z",
                "age":4
            }
        """
    }
}
