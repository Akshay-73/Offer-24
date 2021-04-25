package com.pstlservices.offers24.ui.otp

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.pstlservices.offers24.R
import com.pstlservices.offers24.databinding.ActivityOtpBinding
import com.pstlservices.offers24.ui.base.BindingActivity
import com.pstlservices.offers24.ui.main.MainActivity
import com.pstlservices.offers24.utils.handler.ViewItemClickHandler

class OtpActivity : BindingActivity<ActivityOtpBinding>(), ViewItemClickHandler {


    override fun getLayout(): Int = R.layout.activity_otp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init()
    }

    private fun init() {
        binding.viewHandler = this
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_verify -> {
                startActivity(Intent(this, MainActivity::class.java))
            }
        }
    }
}