package com.dinhthi2004.newapps.data.manager

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import com.dinhthi2004.newapps.domain.manager.LocalUserManager
import com.dinhthi2004.newapps.util.Constans
import com.dinhthi2004.newapps.util.Constans.USER_SETTINGS
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map


class LocalUserManagerlmpl(
    private val context: Context
) : LocalUserManager {
    override suspend fun saveAppEntry() {
        context.dataStore.edit { setting ->
            setting[PreferencesKeys.APP_ENTRY] = true
        }
    }

    override fun readAppEntry(): Flow<Boolean> {
        return context.dataStore.data.map { preferences ->
            preferences[PreferencesKeys.APP_ENTRY] ?: false
        }
    }
}

private val Context.dataStore: DataStore<Preferences> by preferencesDataStore(name = USER_SETTINGS)

private object PreferencesKeys {
    val APP_ENTRY = booleanPreferencesKey(Constans.APP_ENTRY)
}

