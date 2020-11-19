package com.beok.randomuser.data

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CoordinatesTest {

    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()
    private lateinit var jsonAdapter: JsonAdapter<Coordinates>

    @BeforeEach
    fun setup() {
        jsonAdapter = moshi.adapter(Coordinates::class.java)
    }

    @Test
    fun `Coordinates 관련 Json 을 엔티티로 변환합니다`() {
        val response = jsonAdapter.fromJson(COORDINATES_JSON) ?: Coordinates()

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
