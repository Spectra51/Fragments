package com.flycode.fragments.ui.food

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import com.flycode.fragments.R


class MainFoodFragment : Fragment(R.layout.fragment_main_food) {

    lateinit var btn:Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn = view.findViewById(R.id.main_food_button)
        btn.setOnClickListener {

        }
    }
}