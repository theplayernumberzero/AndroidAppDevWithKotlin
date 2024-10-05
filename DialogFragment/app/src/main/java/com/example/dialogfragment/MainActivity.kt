package com.example.dialogfragment

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var name : TextView
    lateinit var age : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        button = findViewById(R.id.button)
        name = findViewById(R.id.textViewName)
        age = findViewById(R.id.textViewAge)

        button.setOnClickListener {

            val fragmentManager : FragmentManager = supportFragmentManager
            val myDialogFragment = MyDialogFragment()

            //When you click outside of area dialog fragment will not close
            myDialogFragment.isCancelable = false

            myDialogFragment.show(fragmentManager, "MyDialogFragment")  //In tag you need to write class name

        }
    }

    fun getUserData(username: String, userAge: Int){

        name.text = "Name: $username"
        age.text = "Age: $userAge"
    }
}