package com.example.materialcomponents.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.materialcomponents.databinding.ItemMaterialColorBinding
import java.util.zip.Inflater

class MaterialColorListAdapter : ListAdapter<Int, MaterialColorListAdapter.MaterialColorViewHolder>(MaterialColorDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MaterialColorViewHolder {
        val binding =
            ItemMaterialColorBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MaterialColorViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MaterialColorViewHolder, position: Int) {
        Log.d(TAG, "onBindViewHolder position --> $position")
        val color = getItem(position)
        holder.bind(color)
    }

    class MaterialColorViewHolder(val binding: ItemMaterialColorBinding): RecyclerView.ViewHolder(binding.rootView) {

        fun bind(colorRes: Int) {
                binding.rootView.setBackgroundColor(binding.rootView.context.resources.getColor(colorRes))
//            binding.apply {
//                color = colorRes
//                executePendingBindings()
//            }
        }
    }

    companion object {
        private val TAG = "MaterialColorListAdapter"
    }
}

class MaterialColorDiffCallback : DiffUtil.ItemCallback<Int>() {
    override fun areItemsTheSame(oldItem: Int, newItem: Int): Boolean {
        return false
    }

    override fun areContentsTheSame(oldItem: Int, newItem: Int): Boolean {
        return false
    }

}