package com.example.intent

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var name : EditText
    lateinit var age : EditText
    lateinit var sendButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        name = findViewById(R.id.editTextName)
        age = findViewById(R.id.editTextAge)
        sendButton = findViewById(R.id.buttonSend)

        sendButton.setOnClickListener {

            var sendingName : String = name.text.toString()
            var sendingAge : Int = age.text.toString().toInt()

            var intent = Intent(this@MainActivity, SecondActivity::class.java)
            intent.putExtra("username", sendingName)
            intent.putExtra("userage", sendingAge)
            startActivity(intent)

        }
    }
}