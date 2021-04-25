package com.pstlservices.offers24.ui.orders.activity

import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat
import com.pstlservices.offers24.R
import com.pstlservices.offers24.databinding.ActivityOrderDetailBinding
import com.pstlservices.offers24.ui.base.BindingActivity
import com.pstlservices.offers24.utils.handler.ViewItemClickHandler

class OrderDetailActivity : BindingActivity<ActivityOrderDetailBinding>(), ViewItemClickHandler {

    override fun getLayout(): Int {
        statusBarColor(ContextCompat.getColor(this, R.color.status_bar_blue_color))
        return R.layout.activity_order_detail
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init()
    }

    private fun init() {
        binding.viewHandler = this
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.iv_back -> {
                onBackPressed()
            }
        }
    }
}