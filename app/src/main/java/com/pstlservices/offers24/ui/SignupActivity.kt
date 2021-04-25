package com.pstlservices.offers24.ui

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.pstlservices.offers24.R
import com.pstlservices.offers24.databinding.ActivitySignupBinding
import com.pstlservices.offers24.ui.base.BindingActivity
import com.pstlservices.offers24.ui.otp.OtpActivity
import com.pstlservices.offers24.utils.handler.ViewItemClickHandler

class SignupActivity : BindingActivity<ActivitySignupBinding>(), ViewItemClickHandler {

    override fun getLayout(): Int = R.layout.activity_signup

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init()
    }

    private fun init() {
        binding.viewHandler = this
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.tv_sign_in -> finish()

            R.id.btn_signup -> startActivity(Intent(this, OtpActivity::class.java))
        }
    }
}