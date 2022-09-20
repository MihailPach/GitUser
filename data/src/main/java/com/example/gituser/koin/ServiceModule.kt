package com.example.gituser.data.koin

import com.example.gituser.data.preferences.PreferencesServiceImpl
import com.example.gituser.domain.service.LanguageService
import com.example.gituser.domain.service.NightModeService
import org.koin.core.module.dsl.bind
import org.koin.core.module.dsl.singleOf
import org.koin.dsl.module
import com.example.gituser.data.map.LocationService

internal val serviceModule = module {
    singleOf(::PreferencesServiceImpl) {
        bind<NightModeService>()
        bind<LanguageService>()
    }
    singleOf(::LocationService)
}