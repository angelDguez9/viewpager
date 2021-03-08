package com.example.viewpager.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.viewpager.R
import kotlinx.android.synthetic.main.fragment_second.view.*

class second : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        view.btnNext.setOnClickListener { Navigation.findNavController(view).navigate(R.id.action_second_to_tercero) }

        return view
    }

}