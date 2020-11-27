package com.beok.randomuser.di

import com.beok.randomuser.BuildConfig
import com.beok.randomuser.domain.RandomUserService
import com.facebook.stetho.okhttp3.StethoInterceptor
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(ApplicationComponent::class)
class NetworkModule {

    @Provides
    @Singleton
    fun provideHttpLoggingInterceptor() = HttpLoggingInterceptor()
        .apply {
            level = if (BuildConfig.DEBUG) {
                HttpLoggingInterceptor.Level.BODY
            } else {
                HttpLoggingInterceptor.Level.NONE
            }
        }

    @Provides
    @Singleton
    fun provideStethoInterceptor() = StethoInterceptor()

    @Provides
    @Singleton
    fun provideKotlinJsonAdapterFactory() = KotlinJsonAdapterFactory()

    @Provides
    @Singleton
    fun provideMoshi(jsonAdapterFactory: KotlinJsonAdapterFactory): Moshi =
        Moshi.Builder()
            .add(jsonAdapterFactory)
            .build()

    @Provides
    @Singleton
    fun provideMoshiConverter(moshi: Moshi): MoshiConverterFactory =
        MoshiConverterFactory.create(moshi)

    @Provides
    @Singleton
    fun provideOkHttpClient(
        loggingInterceptor: HttpLoggingInterceptor,
        stethoInterceptor: StethoInterceptor
    ): OkHttpClient =
        OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .addNetworkInterceptor(stethoInterceptor)
            .build()

    @Provides
    @Singleton
    fun provideRetrofit(converterFactory: MoshiConverterFactory, client: OkHttpClient): Retrofit =
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(converterFactory)
            .client(client)
            .build()

    @Provides
    @Singleton
    fun provideService(retrofit: Retrofit): RandomUserService =
        retrofit.create(RandomUserService::class.java)

    companion object {
        private const val BASE_URL = "https://randomuser.me/"
    }
}
