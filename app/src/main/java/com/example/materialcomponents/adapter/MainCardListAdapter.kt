package com.example.materialcomponents.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.NavDirections
import androidx.navigation.findNavController
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.example.materialcomponents.MainFragmentDirections
import com.example.materialcomponents.R
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
      //  val (image, name) = getItem(position)
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
            binding.setOnClickListener {view->
                val navDirections = getNavigationByName(binding.componentCard!!.componentNameRes)
                navDirections?.let {
                    view.findNavController().navigate(it)
                }

            }
        }

        private fun getNavigationByName(name: Int): NavDirections? {
            return when(name) {
                R.string.str_button -> {
                    MainFragmentDirections.actionMainFragmentToButtonFragment()
                }
                else -> null
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