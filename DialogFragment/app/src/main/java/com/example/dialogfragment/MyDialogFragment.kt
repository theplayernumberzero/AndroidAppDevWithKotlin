package com.example.dialogfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.DialogFragment

//Drawable da custom layout(shape) yaparak layoutun şeklini değiştirebilirisin.
class MyDialogFragment : DialogFragment() {

    lateinit var name : EditText
    lateinit var age : EditText
    lateinit var buttonCancel: Button
    lateinit var buttonOk: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View = inflater.inflate(R.layout.fragment_my_dialog, container, false)

        name = view.findViewById(R.id.editTextName)
        age = view.findViewById(R.id.editTextAge)
        buttonCancel = view.findViewById(R.id.button2)
        buttonOk = view.findViewById(R.id.button3)

        dialog!!.window!!.setBackgroundDrawableResource(android.R.color.transparent)    //Make design transperent
        buttonCancel.setOnClickListener {

            dialog!!.dismiss()
        }

        buttonOk.setOnClickListener {

            val userName : String = name.text.toString()
            val userAge : Int = age.text.toString().toInt()

            //Sending data fragment to activity
            val mainActivity : MainActivity = activity as MainActivity
            mainActivity.getUserData(userName, userAge)
            dialog!!.dismiss()
        }

        // Inflate the layout for this fragment
        return view
    }


}