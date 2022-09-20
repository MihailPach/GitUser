package com.example.gituser.data.model

import com.google.gson.annotations.SerializedName

internal data class UserDTO(
    val id: Int,
    val login: String,
    @SerializedName("avatar_url")
    val avatarUrl: String
)