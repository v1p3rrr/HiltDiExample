package com.example.compose.data

class DemoRepository {
    fun getDogAge() = listOf(
        "7" to 1,
        "12" to 23,
        "3" to 157
    )
    fun getDogName() = listOf(
        1 to "Marcus",
        23 to "Mickey",
        157 to "Moysha"
    )
}