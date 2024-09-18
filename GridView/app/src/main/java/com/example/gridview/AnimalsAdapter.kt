package com.example.gridview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class AnimalsAdapter(
    var context: Context,
    var animalNameList: ArrayList<String>,
    var animalImageList: ArrayList<Int>
) : BaseAdapter() {

    override fun getCount(): Int {
        return animalNameList.size
    }

    override fun getItem(position: Int): Any? {
        return null
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View { //Define special design

        val view : View = LayoutInflater.from(parent!!.context)
            .inflate(R.layout.custom_layout, parent, false)

        var animalName : TextView = view.findViewById(R.id.textView)
        var animalImage : ImageView = view.findViewById(R.id.imageView)

        animalName.text = animalNameList.get(position)
        animalImage.setImageResource(animalImageList.get(position))

        return view
    }

}