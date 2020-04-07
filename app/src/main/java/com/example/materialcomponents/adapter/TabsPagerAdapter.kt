package com.example.materialcomponents.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.example.materialcomponents.MaterialColorFragment

//androidx 下viewPager的adapter
class TabsPagerAdapter(supportManager: FragmentManager, val tabNames: List<String>) : FragmentStatePagerAdapter(supportManager, FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {
    override fun getItem(position: Int): Fragment {
        return MaterialColorFragment.create(tabNames[position])
    }

    override fun getCount(): Int = tabNames.size

    override fun getPageTitle(position: Int): CharSequence? {
        return tabNames[position]
    }
}