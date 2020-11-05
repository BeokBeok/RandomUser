package com.beok.randomuser.example

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SerializationExample {

    @Test
    fun `serialization 공식 예제`() {
        val string = Json.encodeToString(OBJECT_RESULT)

        assertThat(string).isEqualTo(JSON_RESULT)
    }

    @Test
    fun `deserialization 공식 예제`() {
        val obj = Json.decodeFromString<Project>(JSON_RESULT)

        assertThat(obj).isEqualTo(OBJECT_RESULT)
    }

    companion object {
        private const val JSON_RESULT =
            """{"name":"kotlinx.serialization","language":"Kotlin"}"""
        private val OBJECT_RESULT = Project(name = "kotlinx.serialization", language = "Kotlin")
    }
}
