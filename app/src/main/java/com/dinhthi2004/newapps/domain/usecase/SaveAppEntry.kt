package com.dinhthi2004.newapps.domain.usecase

import com.dinhthi2004.newapps.domain.manager.LocalUserManager

class SaveAppEntry(
    private val localUserManager: LocalUserManager
) {
    suspend operator fun invoke() {
        localUserManager.saveAppEntry()
    }
}