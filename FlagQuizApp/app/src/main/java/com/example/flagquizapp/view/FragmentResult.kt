package com.example.flagquizapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flagquizapp.R
import com.example.flagquizapp.databinding.FragmentResultBinding

class FragmentResult : Fragment() {
    lateinit var fragmentResultBinding: FragmentResultBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentResultBinding = FragmentResultBinding.inflate(inflater,container,false)

        fragmentResultBinding.buttonNewQuiz.setOnClickListener {

        }

        fragmentResultBinding.buttonExit.setOnClickListener {

        }
        // Inflate the layout for this fragment
        return fragmentResultBinding.root
    }
}