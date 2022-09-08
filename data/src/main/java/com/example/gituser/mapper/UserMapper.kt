package com.example.gituser.data.mapper

import com.example.gituser.data.model.UserDTO
import com.example.gituser.data.model.UserEntity
import com.example.gituser.domain.model.User

internal fun UserDTO.toDomainModel(): User {
    return User(
        id = id,
        login = login,
        avatarUrl = avatarUrl
    )
}
internal fun UserEntity.toDomainModel(): User {
    return User(
        id = id,
        login = login,
        avatarUrl = avatarUrl
    )
}
internal fun User.toUserEntity():UserEntity{
    return UserEntity(
        id = id,
        login = login,
        avatarUrl = avatarUrl
    )
}