package com.beok.randomuser.base

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView

class BaseViewHolder(
    parent: ViewGroup,
    @LayoutRes private val layoutResourceId: Int,
    private val bindingId: Int,
    private val viewModel: Map<Int, ViewModel>
) : RecyclerView.ViewHolder(
    LayoutInflater.from(parent.context)
        .inflate(layoutResourceId, parent, false)
) {
    private val binding: ViewDataBinding = DataBindingUtil.bind(itemView)!!

    fun bind(item: Any?) {
        if (item == null) return
        binding.setVariable(bindingId, item)

        for (key in viewModel.keys) {
            binding.setVariable(key, viewModel[key])
        }
        binding.executePendingBindings()
    }
}
