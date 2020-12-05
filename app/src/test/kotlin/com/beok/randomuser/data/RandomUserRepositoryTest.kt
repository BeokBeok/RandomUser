package com.beok.randomuser.data

import com.beok.randomuser.data.entity.RandomUserResponse
import com.beok.randomuser.data.source.RandomUserRemoteDataSource
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource

class RandomUserRepositoryTest {

    private val remoteDataSource: RandomUserRemoteDataSource = mockk(relaxed = true)
    private lateinit var repository: RandomUserRepository

    @BeforeEach
    fun setup() {
        repository = RandomUserRepository(remoteDataSource = remoteDataSource)
    }

    @ParameterizedTest
    @ValueSource(ints = [1, 10, 100, 1000])
    fun `임의의 유저의 정보를 불러옵니다`(numberOfUser: Int) = runBlocking {
        val mockResponse: RandomUserResponse = mockk()
        coEvery {
            remoteDataSource.fetchUsers(numberOfUser)
        } returns mockResponse

        val result = repository
            .fetchUsers(numberOfUser)
            .getOrNull()
        assertEquals(mockResponse, result)
    }
}
