package com.flycode.fragments.ui.food

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.bumptech.glide.Glide
import com.flycode.fragments.R
import com.flycode.fragments.model.data.Item
import com.flycode.fragments.ui.shop.SHOP_ITEM
import com.flycode.fragments.ui.shop.ShopDetailItemFragment

const val FOOD_ITEM = "FOOD_ITEM"

class FoodDetailFragment : Fragment(R.layout.fragment_food_detail) {

    lateinit var image: ImageView

    companion object {
        fun newInstance(item: Item): FoodDetailFragment {
            return FoodDetailFragment().apply {
                arguments = Bundle().apply {
                    putSerializable(FOOD_ITEM, item)
                }
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        image = view.findViewById(R.id.detail_food_imageView)

        val item = requireArguments().getSerializable(FOOD_ITEM) as Item

        Glide
            .with(requireContext())
            .load(item.imageRes ?: item.imageUrl)
            .into(image)
    }


}