package com.beok.randomuser.domain

import com.beok.randomuser.data.RandomUserResponse
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

interface RandomUserRemoteDataSource {

    val ioDispatcher: CoroutineDispatcher
        get() = Dispatchers.IO

    suspend fun fetchUsers(results: Int): RandomUserResponse
}
