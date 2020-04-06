package com.example.materialcomponents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.materialcomponents.adapter.TabsViewPagerAdapter
import com.example.materialcomponents.databinding.FragmentTabLayoutBinding
import com.example.materialcomponents.viewmodel.TabsViewModel
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

/**
 * A simple [Fragment] subclass.
 */
class TabLayoutFragment : Fragment() {

    lateinit var mBinding: FragmentTabLayoutBinding

    val mViewModel: TabsViewModel by lazy {
        ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(TabsViewModel::class.java)
    }


    val mAdapter: TabsViewPagerAdapter by lazy {
        TabsViewPagerAdapter(this, mViewModel.tabsNames)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentTabLayoutBinding.inflate(inflater, container, false)
        return mBinding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        mBinding.viewPager.adapter = mAdapter

        TabLayoutMediator(mBinding.tabLayout,mBinding.viewPager){
            tab, position ->
            tab.text = mViewModel.tabsNames[position]
        }.attach()

    }
}
