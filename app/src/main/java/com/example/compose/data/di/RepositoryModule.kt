package com.example.compose.data.di

import com.example.compose.data.remote.DemoApi
import com.example.compose.data.repository.DemoRepositoryImpl
import com.example.compose.domain.repository.DemoRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideDemoRepository(
        demoApi: DemoApi
    ): DemoRepository =
        DemoRepositoryImpl(demoApi)
}