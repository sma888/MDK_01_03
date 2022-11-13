package com.example.practice_1819

import androidx.fragment.app.Fragment
import android.widget.TextView
import android.os.Bundle
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView

class DetailFragment: Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }
    // обновление текстового поля
    fun setSelectedItem(selectedItem: String?) {
        val textView = view?.findViewById<TextView>(R.id.detailsText)
        val imageView = view?.findViewById<ImageView>(R.id.detailsView)
        if (selectedItem=="M2")
        {
            textView?.setText(R.string.M2)
            imageView?.setImageResource(R.drawable.m2)
        }
        else if (selectedItem=="M3")
        {
            textView?.setText(R.string.M3)
            imageView?.setImageResource(R.drawable.m3)
        }
        else if (selectedItem=="M5")
        {
            textView?.setText(R.string.M5)
            imageView?.setImageResource(R.drawable.m5)
        }
    }
}