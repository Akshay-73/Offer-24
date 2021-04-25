package com.pstlservices.offers24.ui.manage

import android.os.Bundle
import android.view.View
import com.pstlservices.offers24.R
import com.pstlservices.offers24.databinding.FragmentManageBinding
import com.pstlservices.offers24.ui.main.MainBaseFragment
import com.pstlservices.offers24.utils.constant.AppConstant
import com.pstlservices.offers24.utils.handler.ViewItemClickHandler

class ManageFragment : MainBaseFragment<FragmentManageBinding>(), ViewItemClickHandler {

    override fun getLayout(): Int = R.layout.fragment_manage

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        init()
    }

    private fun init() {
        binding.viewHandler = this
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.ll_offers -> {
                openFragment(AppConstant.OFFER_FRAGMENT)
            }
        }
    }

}