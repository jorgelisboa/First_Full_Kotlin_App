package com.example.first_kotlin_app.fragments

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.first_kotlin_app.R
import kotlinx.android.synthetic.main.dice_dialog.view.*
import kotlinx.android.synthetic.main.fragment_dice.*
import java.util.concurrent.ThreadLocalRandom

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
            showDado(4).toString()
        }
        dice_6.setOnClickListener {
            showDado(6).toString()
        }
        dice_8.setOnClickListener {
            showDado(8).toString()
        }
        dice_10.setOnClickListener {
            showDado(10).toString()
        }
        dice_12.setOnClickListener {
            showDado(12).toString()
        }
        dice_20.setOnClickListener {
            showDado(20).toString()
        }
        dice_100.setOnClickListener {
            showDado(100).toString()
        }
    }

    private fun showDado(num : Int){
        val alertDialog = AlertDialog.Builder(activity) // This needs the activity's context
        val inflater = layoutInflater
        val view = inflater.inflate(R.layout.dice_dialog, null)
        val num = ThreadLocalRandom.current().nextInt(num) + 1 //Better than 'randon', more different numbers
        view.dice_result.text = num.toString()
        alertDialog.setView(view)
        val dialog = alertDialog.create()
        dialog.show()
    }
}