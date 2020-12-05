package com.beok.randomuser.data.source

import io.mockk.coVerify
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class RandomUserRemoteDataSourceImplTest {

    private val randomUserService: RandomUserService = mockk(relaxed = true)
    private lateinit var randomUserRemoteDataSource: RandomUserRemoteDataSource

    @BeforeEach
    fun setup() {
        randomUserRemoteDataSource = RandomUserRemoteDataSourceImpl(randomUserService)
    }

    @Test
    fun `랜덤으로 다수의 유저정보를 가져옵니다`() = runBlocking {
        randomUserRemoteDataSource.fetchUsers(10)
        coVerify {
            randomUserService.fetch(10)
        }
    }
}
