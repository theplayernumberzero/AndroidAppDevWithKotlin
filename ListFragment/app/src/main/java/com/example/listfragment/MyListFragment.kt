package com.example.listfragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import androidx.fragment.app.ListFragment


class MyListFragment : ListFragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val arrayAdapter =
            activity?.let {     //If activity not null then it will be activity
                ArrayAdapter.createFromResource(it, R.array.cities, android.R.layout.simple_list_item_1) }
        listAdapter = arrayAdapter  //Add adapter to listView

        listView.setOnItemClickListener { adapterView, view, position, id ->
            val intent = Intent(activity, SecondActivity::class.java)   //since it is a fragment the first parameter will be activity
            intent.putExtra("position", position)
            startActivity(intent)
        }
    }

}