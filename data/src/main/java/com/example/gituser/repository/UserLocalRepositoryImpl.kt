package com.example.gituser.data.repository

import com.example.gituser.data.database.UserDao
import com.example.gituser.data.mapper.toDomainModel
import com.example.gituser.data.mapper.toUserEntity
import com.example.gituser.domain.model.User
import com.example.gituser.domain.repository.UserLocalRepository

internal class UserLocalRepositoryImpl(
    private val userDao: UserDao,
) : UserLocalRepository {
    override suspend fun getUsers(): Result<List<User>> {
        return runCatching {
            userDao.getUsers()
        }.map { userEntities -> userEntities.map { it.toDomainModel() } }
    }

    override suspend fun insertUsers(users: List<User>) {
        userDao.insertUsers(users.map { it.toUserEntity() })
    }
}