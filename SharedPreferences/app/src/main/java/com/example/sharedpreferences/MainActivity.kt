package com.example.sharedpreferences

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sharedpreferences.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var mainBinding : ActivityMainBinding

    var count : Int = 0

    var username : String? = null
    var message : String? = null
    var isChecked : Boolean? = null

    lateinit var sharedPreferences: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        mainBinding =ActivityMainBinding.inflate(layoutInflater)
        val view = mainBinding.root
        setContentView(view)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        mainBinding.button.setOnClickListener {
            count++
            mainBinding.button.text = count.toString()
        }
    }

    override fun onPause() {
        super.onPause()

        saveData()
    }

    override fun onResume() {
        super.onResume()

        retreiveData()
    }

    fun saveData(){
        sharedPreferences = this.getSharedPreferences("com.example.sharedpreferences",
            Context.MODE_PRIVATE)

        username = mainBinding.editTextName.text.toString()
        message = mainBinding.editTextMessage.text.toString()
        isChecked = mainBinding.checkBox.isChecked

        sharedPreferences.edit().putString("Key name", username)
        sharedPreferences.edit().putString("Key message", message)
        sharedPreferences.edit().putInt("Key count", count)
        sharedPreferences.edit().putBoolean("Key remember", isChecked!!)

        sharedPreferences.edit().apply()  //will store the data

        Toast.makeText(applicationContext,"Data saved..", Toast.LENGTH_SHORT).show()
    }

    fun retreiveData(){
        sharedPreferences = this.getSharedPreferences("com.example.sharedpreferences",
            Context.MODE_PRIVATE)

        username = sharedPreferences.getString("Key name", null)
        message = sharedPreferences.getString("Key message", null)
        count = sharedPreferences.getInt("Key count", 0)
        isChecked = sharedPreferences.getBoolean("Key remember", false)

        mainBinding.editTextName.setText("$username")
        mainBinding.editTextMessage.setText("$message")
        mainBinding.button.setText("$count")
        mainBinding.checkBox.isChecked = isChecked!!
    }
}