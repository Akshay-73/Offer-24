package com.pstlservices.offers24.dagger.module

import androidx.lifecycle.ViewModel
import com.pstlservices.offers24.dagger.factory.BaseViewModelKey
import com.pstlservices.offers24.ui.main.MainViewModel
import com.pstlservices.offers24.ui.splash.SignupViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @IntoMap
    @BaseViewModelKey(MainViewModel::class)
    abstract fun provideMainViewModel(viewModel: MainViewModel): ViewModel

    @Binds
    @IntoMap
    @BaseViewModelKey(SignupViewModel::class)
    abstract fun provideSignupViewModel(viewModel: SignupViewModel): SignupViewModel
}