package com.example.todolist

import android.content.DialogInterface
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.todolist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding

    var itemList = ArrayList<String>()

    var fileHelper = FileHelper()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        itemList = fileHelper.readData(this)

        var arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,
            android.R.id.text1,itemList)

        binding.list.adapter = arrayAdapter

        binding.button.setOnClickListener {
            var itemName : String = binding.editText.text.toString()
            itemList.add(itemName)

            binding.editText.setText("")

            fileHelper.writeData(itemList,applicationContext)
            arrayAdapter.notifyDataSetChanged()
        }

        binding.list.setOnItemClickListener { adapterView, view, position, l ->

            var alert = AlertDialog.Builder(this)
            alert.setTitle("Delete")
            alert.setMessage("Do you want to delete this item from list?")
            alert.setCancelable(false)  //If you click to space dialog wont close
            alert.setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, i ->
                dialogInterface.cancel()
            })
            alert.setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
                itemList.removeAt(position)
                arrayAdapter.notifyDataSetChanged()
                fileHelper.writeData(itemList,applicationContext)
            })
            alert.create().show()
        }

    }
}