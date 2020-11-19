package com.beok.randomuser.data

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class IdTest {

    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()
    private lateinit var jsonAdapter: JsonAdapter<Id>

    @BeforeEach
    fun setup() {
        jsonAdapter = moshi.adapter(Id::class.java)
    }

    @Test
    fun `ID 관련 Json 을 엔티티로 변환합니다`() {
        val response = jsonAdapter.fromJson(ID_JSON) ?: Id()

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
