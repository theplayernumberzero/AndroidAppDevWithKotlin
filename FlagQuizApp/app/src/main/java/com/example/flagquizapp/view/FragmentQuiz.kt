package com.example.flagquizapp.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.flagquizapp.R
import com.example.flagquizapp.database.FlagsDao
import com.example.flagquizapp.databinding.FragmentQuizBinding
import com.example.flagquizapp.model.FlagsModel
import com.techmania.flagquizwithsqlitedemo.DatabaseCopyHelper

class FragmentQuiz : Fragment() {

    lateinit var fragmentQuizBinding: FragmentQuizBinding
    var flagList = ArrayList<FlagsModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentQuizBinding = FragmentQuizBinding.inflate(inflater, container, false)

        val dao = FlagsDao()
        flagList = dao.getRandomTenRecords(DatabaseCopyHelper(requireActivity()))

        fragmentQuizBinding.buttonA.setOnClickListener {

        }
        fragmentQuizBinding.buttonB.setOnClickListener {

        }
        fragmentQuizBinding.buttonC.setOnClickListener {

        }
        fragmentQuizBinding.buttonD.setOnClickListener {

        }
        fragmentQuizBinding.buttonNext.setOnClickListener {

        }

        // Inflate the layout for this fragment
        return fragmentQuizBinding.root
    }

}