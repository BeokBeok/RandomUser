package com.beok.randomuser.di

import com.beok.randomuser.data.RandomUserRepository
import com.beok.randomuser.data.source.RandomUserRemoteDataSource
import com.beok.randomuser.data.source.RandomUserRemoteDataSourceImpl
import com.beok.randomuser.data.source.RandomUserService
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
    fun provideRemoteDataSource(service: RandomUserService): RandomUserRemoteDataSource =
        RandomUserRemoteDataSourceImpl(service)

    @Provides
    @Singleton
    fun provideRepository(remoteDataSource: RandomUserRemoteDataSource): RandomUserRepository =
        RandomUserRepository(remoteDataSource)
}
