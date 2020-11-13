package com.beok.randomuser.domain

import com.beok.randomuser.data.RandomUserResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface RandomUserService {

    @GET
    suspend fun fetch(@Query("results") results: Int = 10): RandomUserResponse
}
