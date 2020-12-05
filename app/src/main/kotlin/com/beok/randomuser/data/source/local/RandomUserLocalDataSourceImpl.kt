package com.beok.randomuser.data.source.local

import com.beok.randomuser.data.entity.RandomUserTable
import kotlinx.coroutines.withContext

class RandomUserLocalDataSourceImpl(
    private val randomUserDao: RandomUserDao
) : RandomUserLocalDataSource {

    override suspend fun insert(users: List<RandomUserTable>) =
        withContext(ioDispatcher) {
            randomUserDao.insert(users)
        }
}
