package com.example.viewpager.onboarding

import android.content.Context
import android.os.Bundle
import android.view.ContextThemeWrapper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpager.R
import kotlinx.android.synthetic.main.fragment_second.view.*
import kotlinx.android.synthetic.main.fragment_second.view.btnNext
import kotlinx.android.synthetic.main.fragment_tercero.view.*

class tercero : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_tercero, container, false)
        val viewPager = activity?.findViewById<ViewPager2>(R.id.vp)

        view.btnNext.setOnClickListener {
            findNavController().navigate(R.id.action_viewpagerFragment2_to_eventFragment)
            onBoardingFinished()


        }

        view.txtSkip1.setOnClickListener {
            findNavController().navigate(R.id.action_viewpagerFragment2_to_eventFragment)
            onBoardingFinished()

        }

        view.back.setOnClickListener {
            viewPager?.currentItem = 0
        }
        return view
    }

    private fun onBoardingFinished(){
        val sharedPref = requireActivity().getSharedPreferences("onBoarding", Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putBoolean("finished", true)
        editor.apply()
    }

}