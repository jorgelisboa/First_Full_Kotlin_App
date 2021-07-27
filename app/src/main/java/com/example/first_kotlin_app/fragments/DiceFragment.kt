package com.example.first_kotlin_app.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.first_kotlin_app.R
import kotlinx.android.synthetic.main.fragment_dice.*
import kotlin.random.Random

/**
 * A simple [Fragment] subclass.
 */
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


        dice_4.setOnClickListener {
            dice_4.text = sorteioDado(4).toString()
        }
        dice_6.setOnClickListener {
            dice_6.text = sorteioDado(6).toString()
        }
        dice_8.setOnClickListener {
            dice_8.text = sorteioDado(8).toString()
        }
        dice_10.setOnClickListener {
            dice_10.text = sorteioDado(10).toString()
        }
        dice_12.setOnClickListener {
            dice_12.text = sorteioDado(12).toString()
        }
    }


    private fun sorteioDado(num : Int): Int {
        return Random.nextInt(num) + 1
    }
}