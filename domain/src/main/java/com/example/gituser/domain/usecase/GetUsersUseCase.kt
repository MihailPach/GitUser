package com.example.gituser.domain.usecase

import com.example.gituser.domain.model.User
import com.example.gituser.domain.repository.UserRemoteRepository


class GetUsersUseCase(
    private val userRepository: UserRemoteRepository
) {
    suspend operator fun invoke(since: Int, perPage: Int): Result<List<User>> {
        return userRepository.getUsers(since, perPage)
    }
}