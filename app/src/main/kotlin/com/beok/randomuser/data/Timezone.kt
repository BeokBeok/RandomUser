package com.beok.randomuser.data

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Timezone(
    @Json(name = "offset")
    val offset: String = "",
    @Json(name = "description")
    val description: String = ""
)
