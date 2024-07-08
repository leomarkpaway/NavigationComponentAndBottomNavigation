package com.leomarkpaway.navigationcomponentandbottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navButtons = findViewById<BottomNavigationView>(R.id.nav_buttons)
        val navController = findNavController(R.id.nav_host)
        navButtons.setupWithNavController(navController)
        
    }
}