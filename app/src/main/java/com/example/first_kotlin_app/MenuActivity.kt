package com.example.first_kotlin_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.first_kotlin_app.fragments.DiceFragment
import com.example.first_kotlin_app.fragments.DiceHistoricFragment
import kotlinx.android.synthetic.main.activity_menu.*

class MenuActivity : AppCompatActivity(){
    //Variables
    private val diceFragment = DiceFragment()
    private val diceHistoricFragment = DiceHistoricFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        supportActionBar?.hide()
        replaceFragment(diceFragment)

        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.item1 -> replaceFragment(diceFragment)
                R.id.item2 -> replaceFragment(diceHistoricFragment)
            }
            true
        }
    }

    //Start in dices fragment
    private fun replaceFragment(fragment: Fragment){
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.fragment_container, fragment)
        transaction.commit()
    }
}