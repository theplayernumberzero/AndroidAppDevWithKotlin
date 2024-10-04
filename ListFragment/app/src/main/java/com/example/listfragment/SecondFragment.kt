package com.example.listfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView


class SecondFragment : Fragment() {
    lateinit var imageView : ImageView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View = inflater.inflate(R.layout.fragment_second, container, false)//We cant directly use findViewById in fragment. so we need to create object from view class. Copy paste return value


        imageView = view.findViewById(R.id.imageView)

        val position = arguments?.getInt("position", 0)

        when(position){
            0 -> imageView.setImageResource(R.drawable.istanbul)
            1 -> imageView.setImageResource(R.drawable.madrid)
            2 -> imageView.setImageResource(R.drawable.paris)
            3 -> imageView.setImageResource(R.drawable.rome)
        }


        // Inflate the layout for this fragment
        return view
    }

}