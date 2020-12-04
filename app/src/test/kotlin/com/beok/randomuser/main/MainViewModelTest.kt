package com.beok.randomuser.main

import com.beok.randomuser.InstantExecutorExtension
import com.beok.randomuser.data.ResultsItem
import com.beok.randomuser.domain.RandomUserRepository
import com.beok.randomuser.getOrAwaitValue
import io.mockk.coEvery
import io.mockk.mockk
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.runBlocking
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(InstantExecutorExtension::class)
class MainViewModelTest {

    private val repository: RandomUserRepository = mockk(relaxed = true)
    private lateinit var viewModel: MainViewModel

    @BeforeEach
    fun setup() {
        viewModel = MainViewModel(repository)
    }

    @Test
    fun `유저 리스트를 불러옵니다`() = runBlocking {
        val mockResponse: List<ResultsItem> = listOf(mockk(relaxed = true))
        coEvery {
            repository.fetchUsers(1)
                .getOrNull()
                ?.results
        } returns mockResponse

        viewModel.fetchUsers(1)

        assertEquals(viewModel.users.getOrAwaitValue(), mockResponse.map(UserItem::toItem))
    }
}
