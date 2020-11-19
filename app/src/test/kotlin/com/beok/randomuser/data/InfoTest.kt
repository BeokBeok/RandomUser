package com.beok.randomuser.data

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class InfoTest {

    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()
    private lateinit var jsonAdapter: JsonAdapter<Info>

    @BeforeEach
    fun setup() {
        jsonAdapter = moshi.adapter(Info::class.java)
    }
    @Test
    fun `Info 관련 Json 을 엔티티로 변환합니다`() {
        val response = jsonAdapter.fromJson(INFO_JSON) ?: Info()

        assertThat(response.seed).isEqualTo("a55a645d68a46915")
        assertThat(response.results).isEqualTo(1)
        assertThat(response.page).isEqualTo(1)
        assertThat(response.version).isEqualTo("1.3")
    }

    companion object {
        private const val INFO_JSON = """
            {
              "seed":"a55a645d68a46915",
              "results":1,
              "page":1,
              "version":"1.3"
            }
        """
    }
}
