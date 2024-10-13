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

    var correctNumber = 0
    var wrongNumber = 0
    var emptyNumber = 0
    var questionNumber = 0

    val dao = FlagsDao()

    lateinit var correctFlag : FlagsModel

    var wrongFlags = ArrayList<FlagsModel>()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        fragmentQuizBinding = FragmentQuizBinding.inflate(inflater, container, false)

        flagList = dao.getRandomTenRecords(DatabaseCopyHelper(requireActivity()))

        showData()

        fragmentQuizBinding.buttonA.setOnClickListener {

        }
        fragmentQuizBinding.buttonB.setOnClickListener {

        }
        fragmentQuizBinding.buttonC.setOnClickListener {

        }
        fragmentQuizBinding.buttonD.setOnClickListener {

        }
        fragmentQuizBinding.buttonNext.setOnClickListener {
            questionNumber++
            showData()
        }

        // Inflate the layout for this fragment
        return fragmentQuizBinding.root
    }

    private fun showData(){
        fragmentQuizBinding.textViewQuestion.text = resources.getString(R.string.question_number).plus(" ").plus(questionNumber + 1)

        correctFlag = flagList[questionNumber]

        fragmentQuizBinding.imageViewFlag.setImageResource(resources.getIdentifier(correctFlag.flagName, "drawable", requireActivity().packageName))

        wrongFlags = dao.getRandomThreeRecords(DatabaseCopyHelper(requireActivity()), correctFlag.id)

        val mixOptions = HashSet<FlagsModel>()
        mixOptions.clear()

        mixOptions.add(correctFlag)
        mixOptions.add(wrongFlags[0])
        mixOptions.add(wrongFlags[1])
        mixOptions.add(wrongFlags[2])

        val options = ArrayList<FlagsModel>()
        options.clear()

        for (eachFlag in mixOptions){
            options.add(eachFlag)
        }

        fragmentQuizBinding.buttonA.text = options[0].countryName
        fragmentQuizBinding.buttonB.text = options[1].countryName
        fragmentQuizBinding.buttonC.text = options[2].countryName
        fragmentQuizBinding.buttonD.text = options[3].countryName
    }
}