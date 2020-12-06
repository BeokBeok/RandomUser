package com.beok.randomuser.data.source.local.migration

import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase
import androidx.room.Room
import androidx.room.testing.MigrationTestHelper
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory
import androidx.test.core.app.ApplicationProvider
import androidx.test.platform.app.InstrumentationRegistry
import com.beok.randomuser.data.source.local.RandomUserDatabase
import kotlinx.coroutines.runBlocking
import org.junit.Rule
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class MigrationTest {

    private lateinit var room: RandomUserDatabase

    @get:Rule
    val migrationTestHelper = MigrationTestHelper(
        InstrumentationRegistry.getInstrumentation(),
        RandomUserDatabase::class.java.canonicalName,
        FrameworkSQLiteOpenHelperFactory()
    )

    @BeforeEach
    fun setup() {
        room = Room
            .databaseBuilder(
                ApplicationProvider.getApplicationContext(),
                RandomUserDatabase::class.java,
                DB_NAME
            )
            .addMigrations(RandomUserDatabase.MIGRATION_1_2)
            .build()
    }

    @Test
    fun migrationFrom_1_2() = runBlocking {
        insertAtVersion1Table()

        migrationTestHelper.runMigrationsAndValidate(
            DB_NAME,
            2,
            true,
            RandomUserDatabase.MIGRATION_1_2
        )

        val user = room.randomUserDao().findUserByName(NAME)
        assertEquals(user.name, NAME)
        assertEquals(user.gender, GENDER)
    }

    private fun insertAtVersion1Table() = runBlocking {
        val db = migrationTestHelper.createDatabase(DB_NAME, 1)
        val values = ContentValues().apply {
            put("name", NAME)
        }
        db.insert("user", SQLiteDatabase.CONFLICT_REPLACE, values)
        db.close()
    }

    companion object {
        private const val DB_NAME = "test"
        private const val NAME = "name"
        private const val GENDER = ""
    }
}
