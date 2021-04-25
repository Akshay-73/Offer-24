package com.pstlservices.offers24.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.pstlservices.offers24.R
import com.pstlservices.offers24.databinding.ActivitySplashBinding
import com.pstlservices.offers24.ui.base.BindingActivity
import com.pstlservices.offers24.ui.login.LoginActivity
import com.pstlservices.offers24.ui.main.MainActivity

class SplashActivity : BindingActivity<ActivitySplashBinding>() {

    override fun getLayout(): Int = R.layout.activity_splash

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init()
    }

    private fun init() {
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(
                Intent(
                    this,
                    LoginActivity::class.java
                )
            )
            finishAffinity()
        }, 3000)
    }
}