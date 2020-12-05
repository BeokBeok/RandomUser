package com.beok.randomuser.data

import com.beok.randomuser.data.entity.RandomUserResponse
import com.beok.randomuser.data.source.RandomUserRemoteDataSource
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class RandomUserRepository @Inject constructor(
    private val remoteDataSource: RandomUserRemoteDataSource,
    private val ioDispatcher: CoroutineDispatcher = Dispatchers.IO
) {

    suspend fun fetchUsers(numberOfUser: Int): Result<RandomUserResponse> =
        withContext(ioDispatcher) {
            runCatching { remoteDataSource.fetchUsers(numberOfUser) }
        }
}
