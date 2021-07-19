package com.example.first_kotlin_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import java.util.*

class MenuActivity : AppCompatActivity() {
    //Variables
    lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        button = findViewById(R.id.button)

    }
    fun rollDice(view: View) {
        when((1..6).random()) {
            1, 3, 5 -> button.text = "-"
            2, 4 -> button.text = "+"
            6 -> button.text = "NEUTRO"
        }
    }
}