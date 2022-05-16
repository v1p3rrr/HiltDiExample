package com.example.compose.data.di

import com.example.compose.data.remote.DemoApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {

    @Provides
    @Singleton
    fun provideRetrofit() = Retrofit.Builder()
        .baseUrl("https://example.com/api/")
        .build()

    @Provides
    @Singleton
    fun provideDemoApi(retrofit: Retrofit): DemoApi = retrofit.create()
}