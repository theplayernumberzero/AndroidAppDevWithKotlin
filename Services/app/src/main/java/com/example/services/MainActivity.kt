package com.example.services

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

//use main thread ( big process can slow down the application )
class MainActivity : AppCompatActivity() {

    lateinit var startClassicService : Button
    lateinit var jobIntentService : Button
    lateinit var stopClassicService : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        startClassicService = findViewById(R.id.buttonStartClassic)
        jobIntentService = findViewById(R.id.buttonStartJonIntent)
        stopClassicService = findViewById(R.id.buttonStop)

        startClassicService.setOnClickListener {

            val intent = Intent(this@MainActivity, ClassicServiceExample::class.java)
            startService(intent)
        }

        jobIntentService.setOnClickListener {

            val intent = Intent(this@MainActivity, JobIntentServiceExample::class.java)
            JobIntentServiceExample.myBackgroundService(this@MainActivity, intent)
        }

        stopClassicService.setOnClickListener {

            //Manually stop service
            val intent = Intent(this@MainActivity, ClassicServiceExample::class.java)
            stopService(intent)
        }
    }
}