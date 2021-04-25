package com.pstlservices.offers24.ui.product

import android.content.Context
import android.graphics.Paint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.pstlservices.offers24.R
import com.pstlservices.offers24.databinding.LayoutProductItemBinding

class ProductsAdapter constructor(var context: Context) :
    RecyclerView.Adapter<ProductsAdapter.ProductsViewHolder>() {

    inner class ProductsViewHolder(var binding: LayoutProductItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind() {
            binding.tvOriginalPrice.paintFlags =
                binding.tvOriginalPrice.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG

            binding.isOptionVisible = adapterPosition % 2 == 0
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsViewHolder {
        val binding: LayoutProductItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.layout_product_item, parent, false
        )

        return ProductsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductsViewHolder, position: Int) {
        holder.bind()
    }

    override fun getItemCount(): Int {
        return 3
    }
}