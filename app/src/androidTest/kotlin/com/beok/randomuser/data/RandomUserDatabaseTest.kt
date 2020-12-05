package com.beok.randomuser.data

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import com.beok.randomuser.data.source.local.RandomUserDatabase
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.BeforeEach

open class RandomUserDatabaseTest {

    protected lateinit var database: RandomUserDatabase

    @BeforeEach
    open fun setup() {
        val context = ApplicationProvider.getApplicationContext<Context>()
        database = Room.inMemoryDatabaseBuilder(context, RandomUserDatabase::class.java)
            .build()
    }

    @AfterEach
    fun tearDown() {
        database.close()
    }
}
