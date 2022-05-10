package com.example.parkingapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.parkingapp.R

/**
 * A simple [Fragment] subclass.
 * Use the [LotDetailsFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class LotDetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_lot_details, container, false)
    }
}