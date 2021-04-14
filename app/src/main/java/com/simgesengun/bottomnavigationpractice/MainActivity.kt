package com.simgesengun.bottomnavigationpractice

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*
import net.yslibrary.android.keyboardvisibilityevent.KeyboardVisibilityEvent


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.navHostFragment) as NavHostFragment
        NavigationUI.setupWithNavController(bottomNav,navHostFragment.navController)

        bottomNav.selectedItemId = R.id.mainFragment;


        KeyboardVisibilityEvent.setEventListener(
                this
        ) {
            when(it){
                true -> bottomNav.visibility = View.GONE
                false -> bottomNav.visibility = View.VISIBLE
            }

        }
    }

}