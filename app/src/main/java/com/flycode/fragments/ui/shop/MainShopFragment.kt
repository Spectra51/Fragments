package com.flycode.fragments.ui.shop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.commit
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.flycode.fragments.R
import com.flycode.fragments.model.data.Item
import com.flycode.fragments.ui.adapters.ItemAdapter


class MainShopFragment : Fragment(R.layout.fragment_main_shop) {

    lateinit var categoryShopRecyclerView:RecyclerView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        categoryShopRecyclerView = view.findViewById(R.id.category_shop_recyclerView)
        categoryShopRecyclerView.layoutManager = GridLayoutManager(requireContext(),2)
        categoryShopRecyclerView.adapter = ItemAdapter(
            items = listOf(
                Item(
                    id = 1,
                    title = "Футболка",
                    price = 1000,
                    imageRes = R.drawable.ic_shop_item
                ),
                Item(
                    id = 2,
                    title = "Шорты",
                    price = 700,
                    imageRes = R.drawable.ic_shop_item
                ),
                Item(
                    id = 3,
                    title = "Футболка 2",
                    price = 2200,
                    imageRes = R.drawable.ic_shop_item
                )
            ),
            click = {

            }
        )
    }
}