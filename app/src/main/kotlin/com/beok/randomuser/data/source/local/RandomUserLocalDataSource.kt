package com.beok.randomuser.data.source.local

import com.beok.randomuser.data.entity.RandomUserTable
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers

interface RandomUserLocalDataSource {

    val ioDispatcher: CoroutineDispatcher
        get() = Dispatchers.IO

    suspend fun insert(users: List<RandomUserTable>)
}
