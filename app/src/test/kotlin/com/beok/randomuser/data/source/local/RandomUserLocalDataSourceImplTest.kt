package com.beok.randomuser.data.source.local

import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class RandomUserLocalDataSourceImplTest {

    private val randomUserDao: RandomUserDao = mockk(relaxed = true)
    private lateinit var localDataSource: RandomUserLocalDataSource

    @BeforeEach
    fun setup() {
        localDataSource = RandomUserLocalDataSourceImpl(randomUserDao)
    }

    @Test
    fun `유저 정보를 삽입합니다`() = runBlocking {
        localDataSource.insert(emptyList())
        coVerify {
            randomUserDao.insert(emptyList())
        }
    }
}
