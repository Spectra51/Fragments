package com.flycode.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import com.flycode.fragments.ui.food.MainFoodFragment
import com.flycode.fragments.ui.shop.MainShopFragment
import com.flycode.fragments.ui.team.MainTeamFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    lateinit var bottomNavigationView:BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        
        supportFragmentManager.commit {
            setReorderingAllowed(true)
            replace(R.id.fragmentContainerView,MainShopFragment(),"shop")
        }

        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.shop_item_menu -> {

                }
                R.id.food_item_menu -> {

                }
                R.id.team_item_menu -> {

                }
            }
            return@setOnItemSelectedListener true
        }
    }
}