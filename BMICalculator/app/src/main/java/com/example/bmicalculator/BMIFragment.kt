package com.example.bmicalculator

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class BMIFragment : Fragment() {

    lateinit var result : TextView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view : View = inflater.inflate(R.layout.fragment_b_m_i, container, false)

        result = view.findViewById(R.id.textViewResult)

        //Getting data from activity
        val weight = arguments?.getInt("weight",0)!!.toDouble()
        val height = arguments?.getInt("height",0)!!.toDouble()

        var bmi : Double = weight * 10000 / (height*height)

        if (bmi < 18.5){
            result.text = "Your BMI is ${String.format("%.1f", bmi).toDouble()}, you are Underweight"
        }else if(bmi >= 18.5 && bmi < 24.9){
            result.text = "Your BMI is ${String.format("%.1f", bmi).toDouble()}, you are Normal Weight"
        }else if(bmi >= 25 && bmi < 29.9){
            result.text = "Your BMI is ${String.format("%.1f", bmi).toDouble()}, you are Overweight"
        }else if(bmi >= 30 && bmi < 34.9){
            result.text = "Your BMI is ${String.format("%.1f", bmi).toDouble()}, you are Obese Class 1"
        }else if(bmi >= 35 && bmi < 39.9){
            result.text = "Your BMI is ${String.format("%.1f", bmi).toDouble()}, you are Obese Class 2"
        }else{
            result.text = "Your BMI is ${String.format("%.1f", bmi).toDouble()}, you are Obese Class 3"
        }

        // Inflate the layout for this fragment
        return view
    }

}