package com.pstlservices.offers24.ui.orders

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.pstlservices.offers24.R
import com.pstlservices.offers24.databinding.FragmentOrdersBinding
import com.pstlservices.offers24.ui.main.MainBaseFragment
import com.pstlservices.offers24.ui.orders.activity.OrderDetailActivity
import com.pstlservices.offers24.ui.orders.adapter.OrderAdapter
import com.pstlservices.offers24.ui.orders.adapter.OrderTypeAdapter
import com.pstlservices.offers24.utils.handler.RecyclerClickHandler
import java.util.*

class OrdersFragment : MainBaseFragment<FragmentOrdersBinding>() {

    override fun getLayout(): Int = R.layout.fragment_orders

    lateinit var adapter: OrderTypeAdapter
    lateinit var orderAdapter: OrderAdapter

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        init()
    }

    private fun init() {
        adapter = OrderTypeAdapter(getThisActivity())
        binding.rvOrderType.adapter = adapter

        orderAdapter = OrderAdapter(
            getThisActivity(),
            clickHandler = object : RecyclerClickHandler<View, Objects?, Int> {
                override fun onItemClick(view: View, data: Objects?, position: Int) {
                    when (view.id) {
                        R.id.ll_details ->
                            startActivity(
                                Intent(
                                    getThisActivity(),
                                    OrderDetailActivity::class.java
                                )
                            )
                    }
                }
            })
        binding.rvOrder.adapter = orderAdapter
    }

}