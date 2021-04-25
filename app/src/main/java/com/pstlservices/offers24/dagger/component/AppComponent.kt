package com.pstlservices.offers24.dagger.component

import com.pstlservices.offers24.application.SellerApp
import com.pstlservices.offers24.dagger.module.BaseModule
import com.pstlservices.offers24.dagger.module.RestModule
import dagger.BindsInstance
import dagger.Component
import dagger.Module
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton


@Component(modules = [AndroidInjectionModule::class, BaseModule::class, RestModule::class])
@Singleton
interface AppComponent {

    fun inject(app: SellerApp)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(app: SellerApp): Builder
        fun build(): AppComponent
    }
}