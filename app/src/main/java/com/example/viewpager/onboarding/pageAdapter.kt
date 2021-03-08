package com.example.viewpager.onboarding

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPageAdapter(fragmentManager: FragmentManager): FragmentPagerAdapter(fragmentManager){


    private val fragmentList = listOf(
        second(),
        tercero()
    )

    override fun getItem(position: Int): Fragment {
        return fragmentList[position]

    }

    override fun getCount(): Int {
        return fragmentList.size
    }

/*
    list:ArrayList<Fragment>,
    fm: FragmentManager, lifecycle: Lifecycle): FragmentStateAdapter(fm, lifecycle) {


    private val fragmentList: ArrayList<Fragment> = list

    override fun getItemCount(): Int {
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }

*/
}