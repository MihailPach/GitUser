package com.example.gituser.nightmode

import androidx.lifecycle.ViewModel
import com.example.gituser.domain.model.settings.NightMode
import com.example.gituser.domain.service.NightModeService

class NightModeViewModel(private val prefsService: NightModeService) : ViewModel() {

    var selectedNightMode: NightMode by prefsService::nightMode
}