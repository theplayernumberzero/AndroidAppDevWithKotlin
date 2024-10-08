package com.example.lifecycles

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var text1 : TextView
    lateinit var buttonAdd : Button
    lateinit var buttonNext : Button

    var count : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Log.d("Message", "First Activity onCreate worked..")

        buttonAdd.setOnClickListener {

            count++
            text1.setText("$count")
        }

        buttonNext.setOnClickListener {

            var intent = Intent(this@MainActivity, SecondActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStop() {
        super.onStop()
        Log.d("Message", "First Activity onStop worked..")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Message", "First Activity onStart worked..")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Message", "First Activity onPause worked..")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Message", "First Activity onResume worked..")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message", "First Activity onRestart worked..")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message", "First Activity onDestroy worked..")
    }
}