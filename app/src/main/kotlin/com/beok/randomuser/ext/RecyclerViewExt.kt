package com.beok.randomuser.ext

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.beok.randomuser.base.BaseAdapter

@BindingAdapter("bind_recyclerView_replaceItem")
fun replaceItem(recyclerView: RecyclerView, items: List<Any>?) {
    if (items == null) return

    @Suppress("UNCHECKED_CAST")
    (recyclerView.adapter as BaseAdapter<Any>).run {
        replaceItems(items)
        notifyDataSetChanged()
    }
}
