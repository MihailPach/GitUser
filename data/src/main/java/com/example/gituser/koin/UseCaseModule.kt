package com.example.gituser.data.koin

import com.example.gituser.domain.usecase.GetUsersUseCase
import com.example.gituser.domain.usecase.GetUserDetailsUseCase
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.module

val useCaseModule = module {
    factoryOf(::GetUsersUseCase)
    factoryOf(::GetUserDetailsUseCase)
}