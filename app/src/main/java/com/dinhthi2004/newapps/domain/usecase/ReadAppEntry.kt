package com.dinhthi2004.newapps.domain.usecase

import com.dinhthi2004.newapps.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(
    private val localUserManager: LocalUserManager
) {
    suspend operator fun invoke(): Flow<Boolean> {
        return localUserManager.readAppEntry()
    }

}