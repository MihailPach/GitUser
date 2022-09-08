package com.example.gituser.data.mapper

import com.example.gituser.data.model.UserDetailsDTO
import com.example.gituser.data.model.UserDetailsEntity
import com.example.gituser.domain.model.UserDetails

internal fun UserDetailsDTO.toDomainModel(): UserDetails {
    return UserDetails(
        id = id,
        login = login,
        avatarUrl = avatarUrl,
        followers = followers,
        following = following
    )
}

internal fun UserDetailsEntity.toDomainModel(): UserDetails {
    return UserDetails(
        id = id,
        login = login,
        avatarUrl = avatarUrl,
        followers = followers,
        following = following
    )
}