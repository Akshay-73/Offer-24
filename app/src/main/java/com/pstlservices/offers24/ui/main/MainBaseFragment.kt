package com.pstlservices.offers24.ui.main

import android.os.Bundle
import android.view.View
import androidx.databinding.ViewDataBinding
import com.pstlservices.offers24.ui.base.BaseFragment

abstract class MainBaseFragment<Binds : ViewDataBinding> : BaseFragment<Binds>() {
    protected lateinit var viewModel: MainViewModel

    private fun setUpViewModel() {
        viewModel = (getThisActivity() as MainActivity).getMainViewModel()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpViewModel()
    }

}