package com.pstlservices.offers24.ui.product

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.pstlservices.offers24.R
import com.pstlservices.offers24.databinding.FragmentProductsBinding
import com.pstlservices.offers24.ui.main.MainBaseFragment
import com.pstlservices.offers24.ui.product.activity.AddProductActivity
import com.pstlservices.offers24.utils.handler.ViewItemClickHandler

class ProductsFragment : MainBaseFragment<FragmentProductsBinding>(), ViewItemClickHandler {

    lateinit var adapter: ProductsAdapter

    override fun getLayout(): Int = R.layout.fragment_products

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        init()
    }

    private fun init() {
        binding.viewHandler = this

        adapter = ProductsAdapter(getThisActivity())
        binding.rvProduct.adapter = adapter


    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.tv_add_product -> {
                startActivity(Intent(getThisActivity(), AddProductActivity::class.java))
            }
        }
    }


}