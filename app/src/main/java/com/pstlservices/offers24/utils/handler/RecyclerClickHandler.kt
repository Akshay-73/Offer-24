package com.pstlservices.offers24.utils.handler

interface RecyclerClickHandler<K, L, M> {
    fun onItemClick(view: K, data: L, position: M)
}