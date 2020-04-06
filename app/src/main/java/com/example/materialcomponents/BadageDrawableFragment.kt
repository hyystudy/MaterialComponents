package com.example.materialcomponents

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.materialcomponents.adapter.MaterialColorListAdapter
import com.example.materialcomponents.databinding.FragmentBadageDrawableBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BadageDrawableFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BadageDrawableFragment : Fragment() {

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
    lateinit var mBinding: FragmentBadageDrawableBinding
    private val mAdapter: MaterialColorListAdapter by lazy {
        MaterialColorListAdapter()
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = FragmentBadageDrawableBinding.inflate(inflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mBinding.rvTest.layoutManager = LinearLayoutManager(requireContext())
        mBinding.rvTest.adapter = mAdapter
        mAdapter.submitList(redColors)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BadageDrawableFragment.
         */
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BadageDrawableFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
