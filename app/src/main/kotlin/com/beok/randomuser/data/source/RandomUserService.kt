package com.beok.randomuser.data.source

import com.beok.randomuser.data.entity.RandomUserResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface RandomUserService {

    @GET("api/")
    suspend fun fetch(@Query("results") results: Int = 10): RandomUserResponse
}
