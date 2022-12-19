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

class ShopListFragment : Fragment(R.layout.fragment_shop_list) {

    lateinit var recyclerView:RecyclerView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.list_shop_recyclerView)
        recyclerView.layoutManager = GridLayoutManager(requireContext(),2)
        recyclerView.adapter = ItemAdapter(
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
                ),
                Item(
                    id = 4,
                    title = "Футболка 3",
                    price = 1200,
                    imageRes = R.drawable.ic_shop_item
                ),
                Item(
                    id = 5,
                    title = "Шорты 1",
                    price = 1000,
                    imageRes = R.drawable.ic_shop_item
                ),
                Item(
                    id = 6,
                    title = "Шорты 2",
                    price = 350,
                    imageRes = R.drawable.ic_shop_item
                ),
                Item(
                    id = 7,
                    title = "Шорты 3",
                    price = 150,
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
                ),
                Item(
                    id = 4,
                    title = "Футболка 3",
                    price = 1200,
                    imageRes = R.drawable.ic_shop_item
                ),
                Item(
                    id = 5,
                    title = "Шорты 1",
                    price = 1000,
                    imageRes = R.drawable.ic_shop_item
                ),
                Item(
                    id = 6,
                    title = "Шорты 2",
                    price = 350,
                    imageRes = R.drawable.ic_shop_item
                ),
                Item(
                    id = 7,
                    title = "Шорты 3",
                    price = 150,
                    imageRes = R.drawable.ic_shop_item
                )
            ),
            click = {

            }
        )
    }
}