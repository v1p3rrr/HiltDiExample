package com.example.compose.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.compose.domain.use_cases.GetDogsAgeWithNamesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DogsViewModel @Inject constructor(
    private val getDogsAgeWithNamesUseCase : GetDogsAgeWithNamesUseCase
) : ViewModel() {

    private val _dogsFlow = MutableStateFlow<List<Pair<String, String>>>(listOf())
    val dogsFlow = _dogsFlow.asStateFlow()

    fun loadDogs() = viewModelScope.launch(Dispatchers.IO) {
        _dogsFlow.value = getDogsAgeWithNamesUseCase()
    }
}