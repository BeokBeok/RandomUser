package com.beok.randomuser.data.source.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.beok.randomuser.data.entity.RandomUserTable

@Database(
    entities = [RandomUserTable::class],
    version = 2
)
abstract class RandomUserDatabase : RoomDatabase() {

    abstract fun randomUserDao(): RandomUserDao

    companion object {
        val MIGRATION_1_2 = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL(
                    "CREATE TABLE user_2 (name TEXT PRIMARY KEY NOT NULL, gender TEXT NOT NULL)"
                )
                database.execSQL(
                    "INSERT INTO user_2 (name, gender) SELECT name, '' FROM user"
                )
                database.execSQL("DROP TABLE user")
                database.execSQL("ALTER TABLE user_2 RENAME TO user")
            }
        }
    }
}
