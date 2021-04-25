package com.pstlservices.offers24.ui.login

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.pstlservices.offers24.R
import com.pstlservices.offers24.databinding.ActivityLoginBinding
import com.pstlservices.offers24.ui.SignupActivity
import com.pstlservices.offers24.ui.base.BindingActivity
import com.pstlservices.offers24.ui.main.MainActivity
import com.pstlservices.offers24.utils.handler.ViewItemClickHandler

class LoginActivity : BindingActivity<ActivityLoginBinding>(), ViewItemClickHandler {

    override fun getLayout(): Int = R.layout.activity_login

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        init()
    }

    private fun init() {
        binding.viewHandler = this
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.tv_sign_up -> {
                startActivity(Intent(this, SignupActivity::class.java))
            }

            R.id.btn_login -> {
                startActivity(Intent(this, MainActivity::class.java))
            }
        }
    }
}