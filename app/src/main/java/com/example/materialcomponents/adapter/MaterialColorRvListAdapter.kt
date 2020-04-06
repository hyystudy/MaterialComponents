package com.example.materialcomponents.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.materialcomponents.databinding.ItemMaterialColorBinding

class MaterialColorRvListAdapter(val colors: List<Int>) : RecyclerView.Adapter<MaterialColorRvListAdapter.MaterialColorViewHolder>() {

    init {
        Log.d("MaterialColorsAdapter", "colors size -->${colors.size}")
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

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MaterialColorViewHolder {
        Log.d("MaterialColorsAdapter", "onCreateViewHolder")

        val binding =
            ItemMaterialColorBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MaterialColorViewHolder(binding)
    }

    override fun getItemCount(): Int  = 10


    override fun onBindViewHolder(holder: MaterialColorViewHolder, position: Int) {
        Log.d("MaterialColorsAdapter", "onBindViewHolder position --> $position")
        holder.bind(colors[position])
    }
}