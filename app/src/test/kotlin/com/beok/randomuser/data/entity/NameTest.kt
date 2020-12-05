package com.beok.randomuser.data.entity

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class NameTest {

    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()
    private lateinit var jsonAdapter: JsonAdapter<Name>

    @BeforeEach
    fun setup() {
        jsonAdapter = moshi.adapter(Name::class.java)
    }

    @Test
    fun `Name 관련 Json 을 엔티티로 변환합니다`() {
        val response = jsonAdapter.fromJson(NAME_JSON) ?: Name()

        assertThat(response.title).isEqualTo("Mrs")
        assertThat(response.first).isEqualTo("Kim")
        assertThat(response.last).isEqualTo("Bradley")
    }

    companion object {
        private const val NAME_JSON =
            """
                {
                    "title":"Mrs",
                    "first":"Kim",
                    "last":"Bradley"
                }
            """
    }
}
