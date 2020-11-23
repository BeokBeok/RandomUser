package com.beok.randomuser.data

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class DobTest {

    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()
    private lateinit var jsonAdapter: JsonAdapter<Dob>

    @BeforeEach
    fun setup() {
        jsonAdapter = moshi.adapter(Dob::class.java)
    }

    @Test
    fun `Dob 관련 Json 을 엔티티로 변환합니다`() {
        val response = jsonAdapter.fromJson(DOB_JSON) ?: Dob()

        assertThat(response.date).isEqualTo("1949-10-19T17:12:12.248Z")
        assertThat(response.age).isEqualTo(71)
    }

    companion object {
        private const val DOB_JSON =
            """
                {
                    "date":"1949-10-19T17:12:12.248Z",
                    "age":71
                }  
            """
    }
}
