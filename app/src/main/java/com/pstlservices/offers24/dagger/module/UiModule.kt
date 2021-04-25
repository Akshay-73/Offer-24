package com.pstlservices.offers24.dagger.module

import androidx.lifecycle.ViewModelProvider
import com.pstlservices.offers24.dagger.factory.BaseViewModelFactory
import com.pstlservices.offers24.ui.SignupActivity
import com.pstlservices.offers24.ui.edit.EditBusinessActivity
import com.pstlservices.offers24.ui.login.LoginActivity
import com.pstlservices.offers24.ui.main.MainActivity
import com.pstlservices.offers24.ui.orders.activity.OrderDetailActivity
import com.pstlservices.offers24.ui.otp.OtpActivity
import com.pstlservices.offers24.ui.product.activity.AddProductActivity
import com.pstlservices.offers24.ui.splash.SplashActivity
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module(includes = [ViewModelModule::class])
abstract class UiModule {

    @Binds
    abstract fun bindViewModelFactory(baseViewModelFactory: BaseViewModelFactory): ViewModelProvider.Factory

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    abstract fun provideMainActivity(): MainActivity

    @ContributesAndroidInjector
    abstract fun provideLoginActivity(): LoginActivity

    @ContributesAndroidInjector
    abstract fun provideSplashActivity(): SplashActivity

    @ContributesAndroidInjector
    abstract fun provideSignUpActivity(): SignupActivity

    @ContributesAndroidInjector
    abstract fun provideOtpActivity(): OtpActivity

    @ContributesAndroidInjector
    abstract fun provideEditBusinessActivity(): EditBusinessActivity

    @ContributesAndroidInjector
    abstract fun provideOrderDetailActivity(): OrderDetailActivity

    @ContributesAndroidInjector
    abstract fun provideAddProductActivity(): AddProductActivity
}