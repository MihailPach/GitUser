package com.example.gituser.domain.repository

import com.example.gituser.domain.model.User
import com.example.gituser.domain.model.UserDetails

interface UserRemoteRepository {
    suspend fun getUsers(since: Int, perPage: Int): Result<List<User>>
    suspend fun getUserDetails(login: String): Result<UserDetails>
}