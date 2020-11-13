package com.beok.randomuser.domain

import com.beok.randomuser.data.RandomUserResponse
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
