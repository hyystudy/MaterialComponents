package com.example.materialcomponents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.materialcomponents.databinding.FragmentBottomNavigationBinding

/**
 * A simple [Fragment] subclass.
 * Use the [BottomNavigationFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BottomNavigationFragment : Fragment() {

    private lateinit var mBinding: FragmentBottomNavigationBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentBottomNavigationBinding.inflate(inflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mBinding.toolbar.setNavigationOnClickListener {
            findNavController().navigateUp()
        }

        //deal with badge
        val menu = mBinding.btmNavView.menu.getItem(0)
        val itemId = menu.itemId
        val badge = mBinding.btmNavView.getOrCreateBadge(itemId)
        badge.isVisible = true
        badge.number = 9

        mBinding.btmNavView.setOnNavigationItemSelectedListener {
            val itemId1 = it.itemId
            val badge1 = mBinding.btmNavView.getBadge(itemId1)
            badge1?.isVisible= false
            true
        }
    }
}
