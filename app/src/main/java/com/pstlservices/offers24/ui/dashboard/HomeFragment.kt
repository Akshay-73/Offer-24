package com.pstlservices.offers24.ui.dashboard

import android.os.Bundle
import com.pstlservices.offers24.R
import com.pstlservices.offers24.databinding.FragmentHomeBinding
import com.pstlservices.offers24.ui.main.MainBaseFragment

class HomeFragment : MainBaseFragment<FragmentHomeBinding>() {

    override fun getLayout(): Int = R.layout.fragment_home

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        init()
    }

    private fun init() {

    }

}