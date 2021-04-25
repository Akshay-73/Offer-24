package com.pstlservices.offers24.ui.orders.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.pstlservices.offers24.R
import com.pstlservices.offers24.databinding.LayoutOrderTypeItemBinding

class OrderTypeAdapter(var context: Context) :
    RecyclerView.Adapter<OrderTypeAdapter.OrderTypeViewHolder>() {

    inner class OrderTypeViewHolder(var binding: LayoutOrderTypeItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderTypeViewHolder {
        val binding: LayoutOrderTypeItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.layout_order_type_item,
            parent,
            false
        )
        return OrderTypeViewHolder(binding)
    }

    override fun onBindViewHolder(holder: OrderTypeViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 8
    }
}