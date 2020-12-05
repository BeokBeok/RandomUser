package com.beok.randomuser.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.beok.randomuser.data.entity.RandomUserTable

@Database(
    entities = [RandomUserTable::class],
    version = 1,
    exportSchema = false
)
abstract class RandomUserDatabase : RoomDatabase() {

    abstract fun randomUserDao(): RandomUserDao
}
