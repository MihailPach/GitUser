package com.example.gituser.domain.service

import com.example.gituser.domain.model.settings.Language
import kotlinx.coroutines.flow.Flow

interface LanguageService {
    var language: Language
    val languageFlow: Flow<Language>
}