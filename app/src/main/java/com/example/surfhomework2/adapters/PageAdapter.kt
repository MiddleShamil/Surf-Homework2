package com.example.surfhomework2.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.surfhomework2.fragments.LaunchesFragment
import com.example.surfhomework2.fragments.RocketsFragment
import com.example.surfhomework2.fragments.UpcomingFragment

class PageAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {


    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        when(position) {
            0 -> return UpcomingFragment()
            1 -> return LaunchesFragment()
            2 -> return RocketsFragment()
            else -> return UpcomingFragment()
        }
    }


}