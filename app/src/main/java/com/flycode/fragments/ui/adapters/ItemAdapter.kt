package com.flycode.fragments.ui.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.flycode.fragments.R
import com.flycode.fragments.model.data.Item

class ItemAdapter(val items:List<Item>, val click:(item: Item) -> Unit) : RecyclerView.Adapter<ItemAdapter.ShopViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopViewHolder {
        return ShopViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.shop_item,parent,false))
    }

    override fun onBindViewHolder(holder: ShopViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

    inner class ShopViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val container:LinearLayout = view.findViewById(R.id.shop_item_container)
        val image:ImageView = view.findViewById(R.id.shop_item_imageView)
        val title:TextView = view.findViewById(R.id.shop_item_title_textView)
        val price:TextView = view.findViewById(R.id.shop_item_price_textView)

        fun bind(item:Item){

            Glide
                .with(itemView.context)
                .load(item.imageRes ?: item.imageUrl)
                .into(image)

            title.text = item.title
            price.text = "${item.price} Р"

            container.setOnClickListener {
                click(item)
            }
        }

    }
}