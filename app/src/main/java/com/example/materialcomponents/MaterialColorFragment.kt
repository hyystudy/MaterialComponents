package com.example.materialcomponents

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.materialcomponents.adapter.MaterialColorListAdapter
import com.example.materialcomponents.adapter.MaterialColorRvListAdapter
import com.example.materialcomponents.databinding.FragmentMaterialColorBinding
import com.example.materialcomponents.viewmodel.MaterialColorViewModel

const val MATERIAL_COLORS = "material_colors"
class MaterialColorFragment : Fragment() {
    val redColors: List<Int> by lazy {
        listOf(
            R.color.material_red_50,
            R.color.material_red_100,
            R.color.material_red_200,
            R.color.material_red_300,
            R.color.material_red_400,
            R.color.material_red_500,
            R.color.material_red_600,
            R.color.material_red_700,
            R.color.material_red_800,
            R.color.material_red_900
        )
    }
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

    private fun initView() {

        mBinding.rvColorList.layoutManager = LinearLayoutManager(requireContext())
        mBinding.rvColorList.adapter = mAdapter
        Log.d(TAG, "context --> ${requireContext()}")
        Log.d(TAG, "color --> $mColor")
        val list = mViewModel.materialColors[mColor]
        Log.d(TAG, "material color size --> ${list?.size}")


        mAdapter.submitList(list) {
            Log.d(TAG, "mAdapter submit list callback")
        }
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