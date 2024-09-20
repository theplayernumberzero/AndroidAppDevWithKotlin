package com.example.lifecycles

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        Log.d("Message", "onCreate worked..")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Message", "onStop worked..")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Message", "onStart worked..")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Message", "onPause worked..")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Message", "onResume worked..")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message", "onRestart worked..")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message", "onDestroy worked..")
    }
}