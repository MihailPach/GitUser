package com.example.gituser.language

import androidx.lifecycle.ViewModel
import com.example.gituser.domain.model.settings.Language
import com.example.gituser.domain.service.LanguageService

class LanguageViewModel(private val languageService: LanguageService) : ViewModel() {

    var selectedLanguage: Language by languageService::language
}