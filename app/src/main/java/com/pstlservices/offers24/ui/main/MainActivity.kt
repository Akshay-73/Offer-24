package com.pstlservices.offers24.ui.main

import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.core.content.ContextCompat
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.pstlservices.offers24.R
import com.pstlservices.offers24.databinding.ActivityMainBinding
import com.pstlservices.offers24.ui.base.BindingActivity
import com.pstlservices.offers24.utils.constant.AppConstant

class MainActivity : BindingActivity<ActivityMainBinding>() {

    lateinit var viewModel: MainViewModel
    lateinit var navController: NavController
    override fun getLayout(): Int {
        statusBarColor(ContextCompat.getColor(this, R.color.status_bar_blue_color))
        return R.layout.activity_main
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel = getViewModel(MainViewModel::class.java)
        init()
    }

    fun getMainViewModel(): MainViewModel {
        return viewModel
    }

    private fun init() {

        val bottomNavigationView: BottomNavigationView = findViewById(R.id.bottom_navigation_main)

        val navHostFragment =
            (supportFragmentManager.findFragmentById(R.id.nav_host_fragment_main) as NavHostFragment?)!!
        navController = navHostFragment.navController
        NavigationUI.setupWithNavController(bottomNavigationView, navController)
    }

    fun openFragment(type: Int) {
        when (type) {
            AppConstant.OFFER_FRAGMENT -> {
                open(R.id.action_to_offer)
            }
        }
    }

    private fun open(id: Int) {
        navController.navigate(id)
    }

}