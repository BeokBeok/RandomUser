package com.beok.randomuser.data.source

import com.beok.randomuser.data.entity.RandomUserResponse
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

interface RandomUserRemoteDataSource {

    val ioDispatcher: CoroutineDispatcher
        get() = Dispatchers.IO

    suspend fun fetchUsers(results: Int): RandomUserResponse
}
