package com.pstlservices.offers24.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.pstlservices.offers24.ui.main.MainActivity
import java.lang.Exception

abstract class BaseFragment<Binds : ViewDataBinding> : Fragment(), BaseHandler {

    lateinit var binding: Binds

    @LayoutRes
    protected abstract fun getLayout(): Int

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, getLayout(), container, false)
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun getThisActivity(): BaseActivity {
        val activity = activity
        if (activity is BaseActivity) {
            return activity
        }
        throw RuntimeException("BaseActivity is null")
    }

    override fun statusBarColor(color: Int) {
        getThisActivity().statusBarColor(color)
    }

    fun openFragment(type: Int) {
        try {
            (getThisActivity() as MainActivity).openFragment(type)
        } catch (e: Exception) {

        }
    }
}