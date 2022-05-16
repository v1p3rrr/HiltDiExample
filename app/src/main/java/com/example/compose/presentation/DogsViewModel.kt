package com.example.compose.presentation

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.example.compose.data.DemoRepository
import com.example.compose.domain.use_cases.GetDogsAgeWithNamesUseCase

class DogsViewModel(application: Application) : AndroidViewModel(application) {
    private val getDogsAgeWithNamesUseCase : GetDogsAgeWithNamesUseCase
    val getAllDogs : List<Pair<String, String>>

    init {
        getDogsAgeWithNamesUseCase = GetDogsAgeWithNamesUseCase(DemoRepository())
        getAllDogs = getDogsAgeWithNamesUseCase.invoke()
    }
}