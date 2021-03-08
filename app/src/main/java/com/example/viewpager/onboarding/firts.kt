package com.example.viewpager.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.viewpager.R
import kotlinx.android.synthetic.main.fragment_firts.*
import kotlinx.android.synthetic.main.fragment_firts.view.*

class firts : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_firts, container, false)




       /* val fragmentList = arrayListOf<Fragment>(
            second(),
            tercero()
        )
        
        val adapter = ViewPageAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        view.viewp.adapter = adapter


        */
        return view
    }

}