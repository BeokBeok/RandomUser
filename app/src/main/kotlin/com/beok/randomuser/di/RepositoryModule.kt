package com.beok.randomuser.di

import com.beok.randomuser.data.RandomUserRepository
import com.beok.randomuser.data.source.local.RandomUserDao
import com.beok.randomuser.data.source.local.RandomUserLocalDataSource
import com.beok.randomuser.data.source.local.RandomUserLocalDataSourceImpl
import com.beok.randomuser.data.source.remote.RandomUserRemoteDataSource
import com.beok.randomuser.data.source.remote.RandomUserRemoteDataSourceImpl
import com.beok.randomuser.data.source.remote.RandomUserService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class RepositoryModule {

    @Provides
    @Singleton
    fun providesLocalDataSource(randomUserDao: RandomUserDao): RandomUserLocalDataSource =
        RandomUserLocalDataSourceImpl(randomUserDao)

    @Provides
    @Singleton
    fun provideRemoteDataSource(service: RandomUserService): RandomUserRemoteDataSource =
        RandomUserRemoteDataSourceImpl(service)

    @Provides
    @Singleton
    fun provideRepository(
        localDataSource: RandomUserLocalDataSource,
        remoteDataSource: RandomUserRemoteDataSource
    ): RandomUserRepository =
        RandomUserRepository(localDataSource, remoteDataSource)
}
