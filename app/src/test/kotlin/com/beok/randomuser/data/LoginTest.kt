package com.beok.randomuser.data

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class LoginTest {

    @Test
    fun `Login 관련 Json 을 엔티티로 변환합니다`() {
        val response = Json.decodeFromString<Login>(LOGIN_JSON)

        assertThat(response.uuid).isEqualTo("9197d721-8670-4157-add3-c01d4829652f")
        assertThat(response.username).isEqualTo("brownrabbit100")
        assertThat(response.password).isEqualTo("starfire")
        assertThat(response.salt).isEqualTo("xEbgwCO1")
        assertThat(response.md5).isEqualTo("7b556c36ecf675978a691b2b0d4223a6")
        assertThat(response.sha1).isEqualTo("0b8f294b77252f29491bf81c62c036230896e501")
        assertThat(response.sha256).isEqualTo("c3b6d1f34553fe539e6fe4c2f46fc7e58006af88252cbb51ab4b0eb0605ce246")
    }

    companion object {
        private const val LOGIN_JSON = """
            {
                "uuid":"9197d721-8670-4157-add3-c01d4829652f",
                "username":"brownrabbit100",
                "password":"starfire",
                "salt":"xEbgwCO1",
                "md5":"7b556c36ecf675978a691b2b0d4223a6",
                "sha1":"0b8f294b77252f29491bf81c62c036230896e501",
                "sha256":"c3b6d1f34553fe539e6fe4c2f46fc7e58006af88252cbb51ab4b0eb0605ce246"
            }
        """
    }
}
