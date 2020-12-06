package com.beok.randomuser.data.source.local

import com.beok.randomuser.data.RandomUserDatabaseTest
import com.beok.randomuser.data.entity.RandomUserTable
import kotlinx.coroutines.runBlocking
import org.junit.Assert.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class RandomUserDaoTest : RandomUserDatabaseTest() {

    private lateinit var randomUserDao: RandomUserDao

    @BeforeEach
    override fun setup() {
        super.setup()
        randomUserDao = database.randomUserDao()
    }

    @Test
    fun writeUserAndRead() = runBlocking {
        randomUserDao.insert(RandomUserTable(NAME, GENDER))
        val user = randomUserDao.findUserByName(NAME)

        assertEquals(user.name, NAME)
    }

    companion object {
        private const val NAME = "name"
        private const val GENDER = "gender"
    }
}
