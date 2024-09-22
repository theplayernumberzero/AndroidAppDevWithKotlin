package com.example.lifecycles

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SecondActivity : AppCompatActivity() {

    lateinit var buttonBack : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_second)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        buttonBack = findViewById(R.id.buttonBack)

        Log.d("Message", "Second Activity onCreate worked..")

        buttonBack.setOnClickListener {
            var intent = Intent(this@SecondActivity, MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStop() {
        super.onStop()
        Log.d("Message", "Second Activity onStop worked..")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Message", "Second Activity onStart worked..")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Message", "Second Activity onPause worked..")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Message", "Second Activity onResume worked..")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message", "Second Activity onRestart worked..")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message", "Second Activity onDestroy worked..")
    }
}