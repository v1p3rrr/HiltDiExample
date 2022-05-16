package com.example.compose.data.repository

import com.example.compose.data.remote.DemoApi
import com.example.compose.domain.repository.DemoRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class DemoRepositoryImpl @Inject constructor(
    val demoApi: DemoApi
): DemoRepository {

    override fun getDogAge() = listOf(
        "7" to 1,
        "12" to 23,
        "3" to 157
    )
    override fun getDogName() = listOf(
        1 to "Marcus",
        23 to "Mickey",
        157 to "Moysha"
    )
}