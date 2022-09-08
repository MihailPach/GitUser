package com.example.gituser.koin

import com.example.gituser.list.ListViewModel
import com.example.gituser.details.DetailsViewModel
import org.koin.androidx.viewmodel.dsl.viewModelOf
import com.example.gituser.language.LanguageViewModel
import com.example.gituser.nightmode.NightModeViewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModelOf(::ListViewModel)
    viewModelOf(::DetailsViewModel)
    viewModelOf(::NightModeViewModel)
    viewModelOf(::LanguageViewModel)
}