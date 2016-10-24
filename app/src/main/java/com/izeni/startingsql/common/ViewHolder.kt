package com.izeni.startingsql.common

import android.support.v7.widget.RecyclerView
import android.view.View

/**
 * Created by jonny on 10/21/16.
 */
abstract class ViewHolder<in T>(view: View, val onItemClicked: ((T) -> Unit)? = null) : RecyclerView.ViewHolder(view) {
    abstract fun bind(item: T)
}