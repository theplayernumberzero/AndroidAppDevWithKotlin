package com.example.gridview

import android.os.Bundle
import android.widget.GridView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var gridView : GridView

    var animalNameList = ArrayList<String>()
    var animalImageList = ArrayList<Int>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        gridView = findViewById(R.id.gridView)

        fillArrays()

        val adapter = AnimalsAdapter(this@MainActivity, animalNameList, animalImageList)

        gridView.adapter = adapter

        gridView.setOnItemClickListener { parent, view, position, id ->
            Toast.makeText(applicationContext, "You selected the ${animalNameList[position]}", Toast.LENGTH_SHORT).show()
        }

    }

    fun fillArrays(){
        animalNameList.add("bird")
        animalNameList.add("cat")
        animalNameList.add("dog")
        animalNameList.add("dolphin")

        animalImageList.add(R.drawable.bird)
        animalImageList.add(R.drawable.cat)
        animalImageList.add(R.drawable.dog)
        animalImageList.add(R.drawable.dolphin)
    }
}