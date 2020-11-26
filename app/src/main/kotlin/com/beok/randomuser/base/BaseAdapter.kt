package com.beok.randomuser.base

import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView

class BaseAdapter<ITEM : Any>(
    @LayoutRes private val layoutResourceId: Int,
    private val bindingId: Int,
    private val viewModel: Map<Int, ViewModel>
) : RecyclerView.Adapter<BaseViewHolder>() {

    private val itemList = mutableListOf<ITEM>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder =
        BaseViewHolder(parent, layoutResourceId, bindingId, viewModel)

    override fun getItemCount(): Int = itemList.size

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        holder.bind(item = itemList[position])
    }

    fun replaceItems(item: List<ITEM>) {
        itemList.run {
            clear()
            addAll(item)
        }
    }
}
