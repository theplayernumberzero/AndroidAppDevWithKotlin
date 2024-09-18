package com.example.recyclerview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView : RecyclerView

    var countryNameList = ArrayList<String>()
    var detailsList = ArrayList<String>()
    var imageList = ArrayList<Int>()

    lateinit var adapter : CountriesAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this@MainActivity)  //vertical or horizontal

        countryNameList.add("Turkey")
        countryNameList.add("Germany")
        countryNameList.add("USA")

        detailsList.add("This is Turkey Flag")
        detailsList.add("This is Germany Flag")
        detailsList.add("This is USA Flag")

        imageList.add(R.drawable.turkey)
        imageList.add(R.drawable.germany)
        imageList.add(R.drawable.usa)

        adapter = CountriesAdapter(countryNameList, detailsList, imageList, this@MainActivity)

        recyclerView.adapter = adapter
    }
}