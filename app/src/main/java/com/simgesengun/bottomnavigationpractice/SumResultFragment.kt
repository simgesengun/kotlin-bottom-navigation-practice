package com.simgesengun.bottomnavigationpractice

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import kotlinx.android.synthetic.main.fragment_sum_result.view.*

class SumResultFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val design = inflater.inflate(R.layout.fragment_sum_result, container, false)

        design.toolbarSumResult.title = "Summation Result"

        val bundle:SumResultFragmentArgs by navArgs()
        val result = bundle.sumResult
        design.editTextSumResult.text = "Sum Result: " + result

        return design
    }
}