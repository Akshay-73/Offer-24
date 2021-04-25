package com.pstlservices.offers24.application

import android.app.Application
import com.pstlservices.offers24.dagger.component.AppComponent
import com.pstlservices.offers24.dagger.component.DaggerAppComponent
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class SellerApp : Application(), HasAndroidInjector {

    companion object {
        lateinit var appInstance: SellerApp
        lateinit var appComponent: AppComponent

        @Synchronized
        fun getInstance(): SellerApp = appInstance

        @Synchronized
        fun getComponent(): AppComponent = appComponent
    }

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate() {
        super.onCreate()
        appInstance = this
        appComponent = DaggerAppComponent.builder().application(this).build()
        appComponent.inject(this)
    }

    override fun androidInjector(): AndroidInjector<Any> = dispatchingAndroidInjector
}