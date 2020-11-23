package com.beok.randomuser.data

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class PictureTest {

    private val moshi = Moshi.Builder()
        .add(KotlinJsonAdapterFactory())
        .build()
    private lateinit var jsonAdapter: JsonAdapter<Picture>

    @BeforeEach
    fun setup() {
        jsonAdapter = moshi.adapter(Picture::class.java)
    }

    @Test
    fun `Picture 관련 Json 을 엔티티로 변환합니다`() {
        val response = jsonAdapter.fromJson(PICTURE_JSON) ?: Picture()

        assertThat(response.large).isEqualTo("https://randomuser.me/api/portraits/women/30.jpg")
        assertThat(response.medium)
            .isEqualTo("https://randomuser.me/api/portraits/med/women/30.jpg")
        assertThat(response.thumbnail)
            .isEqualTo("https://randomuser.me/api/portraits/thumb/women/30.jpg")
    }

    companion object {
        private const val PICTURE_JSON =
            """
                {
                    "large":"https://randomuser.me/api/portraits/women/30.jpg",
                    "medium":"https://randomuser.me/api/portraits/med/women/30.jpg",
                    "thumbnail":"https://randomuser.me/api/portraits/thumb/women/30.jpg"
                }
            """
    }
}
