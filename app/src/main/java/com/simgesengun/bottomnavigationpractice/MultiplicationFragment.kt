package com.simgesengun.bottomnavigationpractice

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_multiplication.view.*
import java.text.DecimalFormat

class MultiplicationFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val design = inflater.inflate(R.layout.fragment_multiplication, container, false)
        design.toolbarMultiply.title = "Multiplication"

        design.buttonMultiply.setOnClickListener{
            val result:Double = design.editTextFirstNumber.text.toString().toDouble() * design.editTextSecondNumber.text.toString().toDouble()
            val df = DecimalFormat()
            df.isDecimalSeparatorAlwaysShown = false

            val nav = MultiplicationFragmentDirections.multiplicationResultNav(df.format(result))
            Navigation.findNavController(it).navigate(nav)
        }
        return design
    }

}