package com.example.first_kotlin_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var txtHelloWord : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

            txtHelloWord = findViewById(R.id.txtHelloWord)
            //Substituir "teste" pelo shared preferences com o nome do usuário, NÃO ESQUEÇA
            var teste : String? = null
            var nome : String = teste ?: "Bem vindo"
            if(nome != null) {
                txtHelloWord.text = "Olá, $nome"
            } else {
                txtHelloWord.text = nome
            }
            splashAction()
        }

    private fun splashAction() {
        Handler().postDelayed({
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)
            finish()
        }, 3000) // 3000 is the delayed time in milliseconds.
    }
}