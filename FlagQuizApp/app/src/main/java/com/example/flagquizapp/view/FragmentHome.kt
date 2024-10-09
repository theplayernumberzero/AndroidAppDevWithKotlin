package com.example.flagquizapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flagquizapp.R
import com.example.flagquizapp.databinding.FragmentHomeBinding

class FragmentHome : Fragment() {

    lateinit var fragmentHomeBinding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        fragmentHomeBinding = FragmentHomeBinding.inflate(inflater, container, false)

        fragmentHomeBinding.buttonStart.setOnClickListener{

        }

        // Inflate the layout for this fragment
        return fragmentHomeBinding.root
    }
}