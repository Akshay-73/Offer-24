package com.pstlservices.offers24.dagger.module

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.pstlservices.offers24.R
import com.pstlservices.offers24.application.SellerApp
import com.pstlservices.offers24.dagger.component.ActivityComponent
import com.pstlservices.offers24.dagger.component.AppComponent
import com.pstlservices.offers24.utils.session.UserSession
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [UiModule::class], subcomponents = [ActivityComponent::class])
class BaseModule {

    @Provides
    @Singleton
    fun provideApplication(app: SellerApp): Application = app

    @Provides
    @Singleton
    fun provideContext(app: SellerApp): Context = app.applicationContext

    @Provides
    @Singleton
    fun provideSharedPreferences(app: SellerApp): SharedPreferences {
        return app.getSharedPreferences(
            app.resources.getString(R.string.shared_pref_file),
            Context.MODE_PRIVATE
        )
    }

    @Provides
    @Singleton
    fun provideSharedPreferencesEditor(sharedPreference: SharedPreferences): SharedPreferences.Editor {
        return sharedPreference.edit()
    }

    @Provides
    @Singleton
    fun provideUserSession(
        sharedPreference: SharedPreferences,
        editor: SharedPreferences.Editor
    ): UserSession {
        return UserSession(sharedPreference, editor)
    }
}