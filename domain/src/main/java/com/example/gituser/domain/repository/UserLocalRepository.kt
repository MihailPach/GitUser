package com.example.gituser.domain.repository

import com.example.gituser.domain.model.User

interface UserLocalRepository {
    suspend fun getUsers(): Result<List<User>>
    suspend fun insertUsers(users: List<User>)
}