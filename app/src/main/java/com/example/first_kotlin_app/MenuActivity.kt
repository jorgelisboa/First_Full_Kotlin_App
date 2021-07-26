package com.example.first_kotlin_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.first_kotlin_app.fragments.DiceFragment
import com.example.first_kotlin_app.fragments.DiceHistoricFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.sql.Array

class MenuActivity : AppCompatActivity(){
    //Variables
    lateinit var bottomNavigationView : BottomNavigationView
    private val diceFragment = DiceFragment()
    private val diceHistoricFragment = DiceHistoricFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        supportActionBar?.hide()
        bottomNavigationView = findViewById(R.id.bottomNavigationView)
        replaceFragment(diceFragment)

        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.item1 -> replaceFragment(diceFragment)
                R.id.item2 -> replaceFragment(diceHistoricFragment)
            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment){
        if(fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }
}