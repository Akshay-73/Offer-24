package com.pstlservices.offers24.ui.base

import android.graphics.Color
import android.view.Window
import android.view.WindowManager
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.pstlservices.offers24.dagger.factory.BaseViewModelFactory
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject


abstract class BaseActivity : DaggerAppCompatActivity(), BaseHandler {

    @Inject
    lateinit var viewModelFactory: BaseViewModelFactory

    open fun <T : ViewModel?> getViewModel(viewModel: Class<T>?): T {
        return ViewModelProvider(this, viewModelFactory)[viewModel!!]
    }

    override fun getThisActivity(): BaseActivity = this@BaseActivity

    override fun statusBarColor(color: Int) {
        val window: Window = window
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS)
        window.statusBarColor = color
    }
}