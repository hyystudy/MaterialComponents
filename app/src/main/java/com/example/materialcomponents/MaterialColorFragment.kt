package com.example.materialcomponents

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.materialcomponents.adapter.MaterialColorListAdapter
import com.example.materialcomponents.databinding.FragmentMaterialColorBinding
import com.example.materialcomponents.viewmodel.MaterialColorViewModel

const val MATERIAL_COLORS = "material_colors"
class MaterialColorFragment : Fragment() {
    private var mColor: String = ""
    private val mAdapter: MaterialColorListAdapter by lazy {
        MaterialColorListAdapter()
    }

    private lateinit var mBinding: FragmentMaterialColorBinding
    private val mViewModel: MaterialColorViewModel by lazy {
        ViewModelProvider(this, ViewModelProvider.NewInstanceFactory()).get(MaterialColorViewModel::class.java)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            mColor = it.getString(MATERIAL_COLORS)!!
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentMaterialColorBinding.inflate(inflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    override fun onResume() {
        super.onResume()
    }

    private fun initView() {

        mBinding.rvColorList.layoutManager = LinearLayoutManager(requireContext())
        mBinding.rvColorList.adapter = mAdapter
        val list = mViewModel.materialColors[mColor]

        mAdapter.submitList(list)
//        mAdapter.notifyDataSetChanged()
    }

    companion object {
        private val TAG = "MaterialColorFragment"
        @JvmStatic
        fun create(color: String): MaterialColorFragment {
            return MaterialColorFragment().apply {
                arguments = Bundle().apply {
                    putString(MATERIAL_COLORS, color)
                }
            }
        }
    }
}