package com.example.materialcomponents

import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.Switch
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView
import com.chad.library.adapter.base.BaseQuickAdapter
import com.chad.library.adapter.base.listener.OnItemClickListener
import com.example.materialcomponents.adapter.MainCardListAdapter
import com.example.materialcomponents.databinding.FragmentMainBinding
import com.example.materialcomponents.itemdecotation.GridItemDecoration
import com.example.materialcomponents.model.ComponentCardEntity

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    private val mainViewModel: MainViewModel by viewModels {
        MainViewModel.Factory()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainBinding.inflate(inflater, container, false)
        initView()
        return binding.root
    }

    private fun initView() {
        binding.toolbar.setOnMenuItemClickListener {
            when(it.itemId) {
                R.id.app_bar_switch -> {
                    if (AppCompatDelegate.getDefaultNightMode() != AppCompatDelegate.MODE_NIGHT_YES) {
                        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                       // requireActivity().recreate()
                    }else {
                        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                        //requireActivity().recreate()
                    }
                    true
                }
                else -> false
            }
        }
        binding.apply {
            viewModel = mainViewModel

            val adapter = MainCardListAdapter()
            binding.cardList.addItemDecoration(GridItemDecoration(requireContext()))
            binding.cardList.adapter = adapter
            adapter.submitList(mainViewModel.componentCardEntities)
        }
    }



    companion object {
        private const val  TAG = "MainFragment"
    }
}
