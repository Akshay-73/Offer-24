package com.pstlservices.offers24.ui.account

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.pstlservices.offers24.R
import com.pstlservices.offers24.databinding.FragmentAccountBinding
import com.pstlservices.offers24.ui.edit.EditBusinessActivity
import com.pstlservices.offers24.ui.main.MainBaseFragment
import com.pstlservices.offers24.utils.handler.ViewItemClickHandler

class AccountFragment : MainBaseFragment<FragmentAccountBinding>(), ViewItemClickHandler {

    override fun getLayout(): Int = R.layout.fragment_account

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        init()
    }

    private fun init() {
        binding.viewHandler = this
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.tv_edit_business_details, R.id.ll_edit_business -> {
                startActivity(Intent(getThisActivity(), EditBusinessActivity::class.java))
            }
        }
    }

}