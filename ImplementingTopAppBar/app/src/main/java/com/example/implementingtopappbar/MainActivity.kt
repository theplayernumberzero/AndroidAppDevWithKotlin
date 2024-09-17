package com.example.implementingtopappbar

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.appbar.MaterialToolbar

class MainActivity : AppCompatActivity() {

    lateinit var toolbar : MaterialToolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        toolbar = findViewById(R.id.toolbar)

        toolbar.overflowIcon = AppCompatResources.getDrawable(this,R.drawable.baseline_apps_24)

        toolbar.setNavigationOnClickListener {

            Toast.makeText(applicationContext, "Navigation Icon is clicked", Toast.LENGTH_SHORT).show()

        }

        toolbar.setOnMenuItemClickListener {item ->

            when(item.itemId){

                R.id.share -> Toast.makeText(applicationContext, "Share Icon is clicked", Toast.LENGTH_SHORT).show()
                R.id.edit -> Toast.makeText(applicationContext, "Edit Icon is clicked", Toast.LENGTH_SHORT).show()
                R.id.settings -> Toast.makeText(applicationContext, "Settings Icon is clicked", Toast.LENGTH_SHORT).show()
                else -> Toast.makeText(applicationContext, "Sign Out Icon is clicked", Toast.LENGTH_SHORT).show()
            }

            return@setOnMenuItemClickListener true
        }
    }
}