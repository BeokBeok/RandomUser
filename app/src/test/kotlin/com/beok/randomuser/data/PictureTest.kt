package com.beok.randomuser.data

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class PictureTest {

    @Test
    fun `Picture 관련 Json 을 엔티티로 변환합니다`() {
        val response = Json.decodeFromString<Picture>(PICTURE_JSON)

        assertThat(response.large).isEqualTo("https://randomuser.me/api/portraits/women/30.jpg")
        assertThat(response.medium).isEqualTo("https://randomuser.me/api/portraits/med/women/30.jpg")
        assertThat(response.thumbnail).isEqualTo("https://randomuser.me/api/portraits/thumb/women/30.jpg")
    }

    companion object {
        private const val PICTURE_JSON = """
            {
                "large":"https://randomuser.me/api/portraits/women/30.jpg",
                "medium":"https://randomuser.me/api/portraits/med/women/30.jpg",
                "thumbnail":"https://randomuser.me/api/portraits/thumb/women/30.jpg"
            }
        """
    }
}
