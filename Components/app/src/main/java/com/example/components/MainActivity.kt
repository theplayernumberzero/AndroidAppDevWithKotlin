package com.example.components

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    //2 ways to describe varible
    var myText : TextView? = null
    lateinit var myText2 : TextView

    lateinit var myDoMagicButton : Button

    lateinit var nameInput : EditText
    lateinit var ok : Button
    lateinit var result : TextView

    lateinit var imageExample : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        myText = findViewById(R.id.textExample)
        myText2 = findViewById(R.id.textExample2)

        myDoMagicButton = findViewById(R.id.doMagicButton)

        nameInput = findViewById(R.id.editTextName)
        ok = findViewById(R.id.buttonOk)
        result = findViewById(R.id.textViewResult)

        imageExample = findViewById(R.id.imageViewExample)

        ok.setOnClickListener {
            var username : String = nameInput.text.toString()
            result.setText(username)

            imageExample.setImageResource(R.drawable.drogba)
        }

        myText2.setTextColor(Color.BLACK)
        //myText2.text = "This is an example"
        myText2.setText("This is an example")

        myText2.setOnClickListener {
            myText2.setBackgroundColor(Color.BLACK)
            myText2.setTextColor(Color.WHITE)
        }

        myDoMagicButton.setOnClickListener {
            myDoMagicButton.setBackgroundColor(Color.BLUE)
            myText2.setText("I have done my magic")
        }

    }
}