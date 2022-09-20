package com.example.gituser

import android.app.Application
import android.content.Context
import com.example.gituser.data.koin.dataModule
import com.example.gituser.koin.viewModelModule
import com.example.gituser.domain.service.LanguageService
import com.example.gituser.language.LanguageAwareAppContext
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import org.koin.android.ext.android.inject
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin

class GitUserApp : Application() {
    private val languageService by inject<LanguageService>()
    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(LanguageAwareAppContext(base, application = this))
    }

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@GitUserApp)
            modules(
                dataModule,
                viewModelModule
            )
        }
        languageService
            .languageFlow
            .onEach {
                (baseContext as LanguageAwareAppContext).appLanguage = it
            }
            .launchIn(CoroutineScope(Dispatchers.Main))
    }
}