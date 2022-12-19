package com.flycode.fragments.ui.food

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.commit
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.flycode.fragments.R
import com.flycode.fragments.model.data.Item
import com.flycode.fragments.ui.adapters.ItemAdapter
import com.flycode.fragments.ui.shop.ShopListFragment

const val FOOD_IMAGE_URL = "https://avatars.mds.yandex.net/get-altay/4281217/2a000001791dded0e9df360e98e546d19602/S"

class FoodListFragment : Fragment(R.layout.fragment_food_list) {

    lateinit var recyclerView:RecyclerView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        recyclerView = view.findViewById(R.id.list_food_recyclerView)
        recyclerView.layoutManager = GridLayoutManager(requireContext(),2)
        recyclerView.adapter = ItemAdapter(
            items = listOf(
                Item(
                    id = 1,
                    title = "Бургер",
                    price = 1000,
                    imageUrl = FOOD_IMAGE_URL
                ),
                Item(
                    id = 2,
                    title = "Бургер",
                    price = 700,
                    imageUrl = FOOD_IMAGE_URL
                ),
                Item(
                    id = 3,
                    title = "Бургер 2",
                    price = 2200,
                    imageUrl = FOOD_IMAGE_URL
                ),
                Item(
                    id = 1,
                    title = "Бургер",
                    price = 1000,
                    imageUrl = FOOD_IMAGE_URL
                ),
                Item(
                    id = 2,
                    title = "Бургер",
                    price = 700,
                    imageUrl = FOOD_IMAGE_URL
                ),
                Item(
                    id = 3,
                    title = "Бургер 2",
                    price = 2200,
                    imageUrl = FOOD_IMAGE_URL
                ),
                Item(
                    id = 1,
                    title = "Бургер",
                    price = 1000,
                    imageUrl = FOOD_IMAGE_URL
                ),
                Item(
                    id = 2,
                    title = "Бургер",
                    price = 700,
                    imageUrl = FOOD_IMAGE_URL
                ),
                Item(
                    id = 3,
                    title = "Бургер 2",
                    price = 2200,
                    imageUrl = FOOD_IMAGE_URL
                )
            ),
            click = {

            }
        )
    }

}