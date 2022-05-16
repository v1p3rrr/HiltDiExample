package com.example.compose.domain.use_cases

import com.example.compose.data.repository.DemoRepositoryImpl
import com.example.compose.domain.repository.DemoRepository
import javax.inject.Inject

class GetDogsAgeWithNamesUseCase @Inject constructor(
    private val repository: DemoRepository
) {
    operator fun invoke(): List<Pair<String, String>> {
        val age = repository.getDogAge()
        val name = repository.getDogName()

        return age.mapIndexed { index, pair ->
            pair.first to name[index].second
        }
    }

}