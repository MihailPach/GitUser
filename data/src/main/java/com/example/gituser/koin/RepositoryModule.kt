package com.example.gituser.data.koin

import com.example.gituser.data.repository.UserLocalRepositoryImpl
import com.example.gituser.data.repository.UserRemoteRepositoryImpl
import com.example.gituser.domain.repository.UserLocalRepository
import com.example.gituser.domain.repository.UserRemoteRepository
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module

internal val repositoryModule = module {
    singleOf(::UserRemoteRepositoryImpl){bind<UserRemoteRepository>()}
    singleOf(::UserLocalRepositoryImpl){bind<UserLocalRepository>()}
}