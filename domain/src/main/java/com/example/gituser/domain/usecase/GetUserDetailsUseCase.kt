package com.example.gituser.domain.usecase

import com.example.gituser.domain.model.UserDetails
import com.example.gituser.domain.repository.UserRemoteRepository

class GetUserDetailsUseCase(
    private val userRepository: UserRemoteRepository
) {
    suspend operator fun invoke(login: String): Result<UserDetails> {
        return userRepository.getUserDetails(login)
    }
}