package com.example.gituser.data.repository

import com.example.gituser.data.api.GitHubApi
import com.example.gituser.data.mapper.toDomainModel
import com.example.gituser.domain.repository.UserRemoteRepository

internal class UserRemoteRepositoryImpl(
    private val gitHubApi: GitHubApi
) : UserRemoteRepository {
    override suspend fun getUsers(since: Int, perPage: Int) = runCatching {
        gitHubApi.getUsers(since, perPage)
    }.map { users ->
        users.map { it.toDomainModel() }
    }

    override suspend fun getUserDetails(login: String) = runCatching {
        gitHubApi.getUserDetails(login)
    }.map {
        it.toDomainModel()
    }
}