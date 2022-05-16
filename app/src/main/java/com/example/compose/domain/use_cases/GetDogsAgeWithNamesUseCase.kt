package com.example.compose.domain.use_cases

import com.example.compose.data.DemoRepository

class GetDogsAgeWithNamesUseCase(private val repository: DemoRepository) {
    operator fun invoke() : List<Pair<String, String>>{
        val age = repository.getDogAge()
        val name = repository.getDogName()

        return age.mapIndexed { index, pair ->
            pair.first to name[index].second
        }
    }

}