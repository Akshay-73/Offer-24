package com.pstlservices.offers24.ui.orders.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.pstlservices.offers24.R
import com.pstlservices.offers24.databinding.LayoutOrderItemBinding
import com.pstlservices.offers24.utils.handler.RecyclerClickHandler
import com.pstlservices.offers24.utils.handler.ViewItemClickHandler
import java.util.*

class OrderAdapter(
    var context: Context,
    var clickHandler: RecyclerClickHandler<View, Objects?, Int>
) : RecyclerView.Adapter<OrderAdapter.OrderViewHolder>() {

    inner class OrderViewHolder(var binding: LayoutOrderItemBinding) :
        RecyclerView.ViewHolder(binding.root), ViewItemClickHandler {

        fun bind() {
            binding.viewHandler = this
        }

        override fun onClick(v: View) {
            when (v.id) {
                R.id.ll_details -> {
                    clickHandler.onItemClick(v, null, adapterPosition)
                }
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderViewHolder {
        val binding: LayoutOrderItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.layout_order_item,
            parent,
            false
        )
        return OrderViewHolder(binding)
    }

    override fun onBindViewHolder(holder: OrderViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int {
        return 3
    }
}