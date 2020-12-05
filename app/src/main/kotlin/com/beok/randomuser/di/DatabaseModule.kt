package com.beok.randomuser.di

import android.content.Context
import androidx.room.Room
import com.beok.randomuser.data.source.local.RandomUserDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DatabaseModule {

    @Provides
    @Singleton
    fun providesRandomUserDatabase(@ApplicationContext context: Context) = Room
        .databaseBuilder(
            context,
            RandomUserDatabase::class.java,
            "user.db"
        )
        .build()

    @Provides
    @Singleton
    fun providesRandomUserDao(database: RandomUserDatabase) = database.randomUserDao()
}
