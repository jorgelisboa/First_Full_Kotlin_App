package com.example.first_kotlin_app.fragments

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.first_kotlin_app.MenuActivity
import com.example.first_kotlin_app.R
import kotlinx.android.synthetic.main.fragment_dice.*
import kotlin.random.Random

class DiceFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dice, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    //Eventos dos dados
        dice_4.setOnClickListener {
            sorteioDado(4).toString()
        }
        dice_6.setOnClickListener {
            sorteioDado(6).toString()
        }
        dice_8.setOnClickListener {
            sorteioDado(8).toString()
        }
        dice_10.setOnClickListener {
            sorteioDado(10).toString()
        }
        dice_12.setOnClickListener {
            sorteioDado(12).toString()
        }
    }

    private fun sorteioDado(num : Int){
        val alertDialog = AlertDialog.Builder(activity) // This needs the activity's context
        var num = Random.nextInt(num) + 1
        alertDialog.setMessage(num.toString())
        alertDialog.show()
    }
}