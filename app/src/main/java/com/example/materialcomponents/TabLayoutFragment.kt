package com.example.materialcomponents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
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

        mBinding.toolbar.setNavigationOnClickListener {
            findNavController().navigateUp()
        }

        //使用viewPager2 的时候出现一个bug 是这样的：
        //viewPager2的parent是ConstraintLayout  但是 viewPager2的width 是match_parent
        //然后没有写start_to_startOf end_to_endOf 导致 viewPager2 配合tabLayout的时候 第一个fragment的
        //UI显示不出来 我就尴尬了   解决方案是 viewPager2的width为0dp 然后加上左右限制
        mBinding.viewPager.adapter = mAdapter

        TabLayoutMediator(mBinding.tabLayout,mBinding.viewPager){
            tab, position ->
            tab.text = mViewModel.tabsNames[position]
        }.attach()

    }
}
