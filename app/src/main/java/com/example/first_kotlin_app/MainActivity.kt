package com.example.first_kotlin_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
            //Gerar frase aleatória
            getRadomPrhase()
            splashAction()
    }
    private fun splashAction() {
        Handler().postDelayed({
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }, 4000) // 4000 is the delayed time in milliseconds.
    }

    private fun getRadomPrhase(){
        val frases = arrayOf("Lembre-se, dragões amam ouro.",
            "Itens mágicos não são necessariamente indestrutíveis.",
            "Crie suas magias, pode ser mais legal do que as prontas.",
            "Faça um RPG em que você é o vilão.")
            txtHelloWord.text = frases[Random.nextInt(3)]
    }
}