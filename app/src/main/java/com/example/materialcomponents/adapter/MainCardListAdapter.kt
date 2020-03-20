package com.example.materialcomponents.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.materialcomponents.databinding.ItemHomeCardLayoutBinding
import com.example.materialcomponents.model.ComponentCardEntity
import com.google.android.material.snackbar.Snackbar

class MainCardListAdapter : ListAdapter<ComponentCardEntity, MainCardListAdapter.ComponentCardViewHolder>(MainCardDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComponentCardViewHolder {
        val binding =
            ItemHomeCardLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ComponentCardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ComponentCardViewHolder, position: Int) {
        val data = getItem(position)
        holder.bind(data)
    }

    class ComponentCardViewHolder(private val binding: ItemHomeCardLayoutBinding):
            RecyclerView.ViewHolder(binding.root) {
        fun bind(data: ComponentCardEntity?) {
            binding.apply {
                componentCard = data
                executePendingBindings()
            }
        }

        init {
            binding.setOnClickListener {
                Snackbar.make(it, binding.componentCard!!.componentNameRes, Snackbar.LENGTH_SHORT).show()
            }
        }
    }


}

class MainCardDiffCallback : DiffUtil.ItemCallback<ComponentCardEntity>() {
    override fun areItemsTheSame(
        oldItem: ComponentCardEntity,
        newItem: ComponentCardEntity
    ): Boolean {
        return oldItem == newItem
    }

    override fun areContentsTheSame(
        oldItem: ComponentCardEntity,
        newItem: ComponentCardEntity
    ): Boolean {
        return oldItem.componentNameRes == newItem.componentNameRes
    }

}