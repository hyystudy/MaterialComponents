package com.example.materialcomponents.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.materialcomponents.MaterialColorFragment

//viewPager2的adapter
class TabsViewPagerAdapter constructor(fragment: Fragment, val tabNames: List<String>) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = tabNames.size

    override fun createFragment(position: Int): Fragment {
        return MaterialColorFragment.create(tabNames[position])
    }
}