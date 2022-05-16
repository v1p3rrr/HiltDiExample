package com.example.compose.domain.repository

interface DemoRepository {
    fun getDogAge(): List<Pair<String, Int>>
    fun getDogName(): List<Pair<Int, String>>
}