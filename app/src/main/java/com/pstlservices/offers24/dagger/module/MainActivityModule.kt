package com.pstlservices.offers24.dagger.module

import com.pstlservices.offers24.ui.account.AccountFragment
import com.pstlservices.offers24.ui.dashboard.HomeFragment
import com.pstlservices.offers24.ui.manage.ManageFragment
import com.pstlservices.offers24.ui.offer.OfferFragment
import com.pstlservices.offers24.ui.orders.OrdersFragment
import com.pstlservices.offers24.ui.product.ProductsFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class MainActivityModule {

    @ContributesAndroidInjector
    abstract fun contributeDashboardFragment(): HomeFragment

    @ContributesAndroidInjector
    abstract fun contributeProductsFragment(): ProductsFragment

    @ContributesAndroidInjector
    abstract fun contributeOrdersFragment(): OrdersFragment

    @ContributesAndroidInjector
    abstract fun contributeOffersFragment(): ManageFragment

    @ContributesAndroidInjector
    abstract fun contributeAccountFragment(): AccountFragment

    @ContributesAndroidInjector
    abstract fun contributeOfferFragment(): OfferFragment
}