package com.flycode.fragments.ui.shop

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.flycode.fragments.R
import com.flycode.fragments.model.data.Item

const val SHOP_ITEM = "SHOP_ITEM"
class ShopDetailItemFragment : Fragment(R.layout.fragment_shop_detail_item) {

    companion object{
        fun newInstance(item: Item): ShopDetailItemFragment {
            return ShopDetailItemFragment().apply {
                arguments = Bundle().apply {
                    putSerializable(SHOP_ITEM,item)
                }
            }
        }
    }

    lateinit var title:TextView
    lateinit var description:TextView
    lateinit var image:ImageView

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        title = view.findViewById(R.id.shop_detail_item_title_textView)
        description = view.findViewById(R.id.shop_detail_item_description_textView)
        image = view.findViewById(R.id.shop_detail_item_image_imageView)

        val item:Item = requireArguments().getSerializable(SHOP_ITEM) as Item

        Glide
            .with(requireContext())
            .load(item.imageRes)
            .override(300)
            .into(image)
        title.text = item.title
        description.text = ("${item.title} \n").repeat(7)
    }
}