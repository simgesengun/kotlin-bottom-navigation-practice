package com.simgesengun.bottomnavigationpractice

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_multiplication_result.*
import kotlinx.android.synthetic.main.fragment_multiplication_result.view.*

class MultiplicationResultFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val design = inflater.inflate(R.layout.fragment_multiplication_result, container, false)

        design.toolbarMultiplicationResult.title = "Multiplication Result"

        val bundle:MultiplicationResultFragmentArgs by navArgs()
        val result = bundle.multiplicationResult
        design.editTextMultiplicationResult.text = "Multiplication Result: " + result
        return design
    }

}