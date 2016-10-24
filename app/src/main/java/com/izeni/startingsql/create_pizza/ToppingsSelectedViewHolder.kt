package com.izeni.startingsql.create_pizza

import android.view.View
import com.izeni.startingsql.common.ViewHolder
import com.izeni.startingsql.database.tables.Toppings
import kotlinx.android.synthetic.main.item_topping.view.*

/**
 * Created by jonny on 10/21/16.
 */
class ToppingsSelectedViewHolder(view: View, val onItemClicked: ((Toppings, Int) -> Unit)? = null): ViewHolder<Toppings>(view) {

    override fun bind(item: Toppings) {

        itemView.topping_text_view.text = item.name

        itemView.setOnClickListener {

            onItemClicked?.invoke(item, adapterPosition)

        }

    }

}