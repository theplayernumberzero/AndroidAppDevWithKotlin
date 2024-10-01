package com.example.mathgame

import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mathgame.databinding.ActivitySubtractionBinding
import java.util.Locale
import kotlin.random.Random

class SubtractionActivity : AppCompatActivity() {
    lateinit var gameBinding : ActivitySubtractionBinding

    var correctAnswer = 0
    var userScore = 0
    var userLife = 3
    var userAnswer = 0

    lateinit var timer : CountDownTimer
    private val startTimeInMillis : Long = 60000    //you need to define time in milliseconds
    var timeLeftInMillis : Long = startTimeInMillis
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        gameBinding = ActivitySubtractionBinding.inflate(layoutInflater)
        val view = gameBinding.root
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        gameContinue()

        gameBinding.buttonOk.setOnClickListener {

            val input = gameBinding.editTextAnswer.text.toString()

            if (input == ""){
                Toast.makeText(applicationContext,"Please enter number or click next button",
                    Toast.LENGTH_LONG).show()
            }else{

                pauseTimer()

                userAnswer = input.toInt()
                if (userAnswer == correctAnswer){

                    userScore += 10
                    gameBinding.textViewQuestion.text = "YOUR ANSWER IS CORRECT"
                    gameBinding.textViewScore.text = userScore.toString()
                }else{

                    userLife--
                    gameBinding.textViewQuestion.text = "ANSWER IS WRONG"
                    gameBinding.textViewLife.text = userLife.toString()
                }
            }
        }

        gameBinding.buttonNext.setOnClickListener {

            pauseTimer()
            resetTimer()

            gameBinding.editTextAnswer.setText("")

            if (userLife == 0 && userAnswer != correctAnswer){

                Toast.makeText(applicationContext,"Game is OVER", Toast.LENGTH_LONG).show()
                val intent = Intent(this@SubtractionActivity,ResultActivity::class.java)
                intent.putExtra("score", userScore)
                startActivity(intent)
                finish()
            }else{
                gameContinue()
            }
        }
    }

    fun gameContinue(){
        val number1 = Random.nextInt(0,100)
        val number2 = Random.nextInt(0,100)

        gameBinding.textViewQuestion.setText("$number1 - $number2")

        correctAnswer = number1-number2

        startTimer()
    }

    fun startTimer(){
        timer = object : CountDownTimer(timeLeftInMillis,1000){
            override fun onTick(millisUntilFinished: Long) {
                timeLeftInMillis = millisUntilFinished
                updateText()
            }

            override fun onFinish() {
                pauseTimer()
                resetTimer()
                updateText()

                userLife--
                gameBinding.textViewLife.text = userLife.toString()
                gameBinding.textViewQuestion.text = "Sorry, your time is up!"
            }

        }.start()
    }

    fun updateText(){

        val remainingTime : Int = (timeLeftInMillis/1000).toInt()
        gameBinding.textViewTime.text = String.format(Locale.getDefault(),"%02d",remainingTime)

    }

    fun pauseTimer(){

        timer.cancel()
    }

    fun resetTimer(){

        timeLeftInMillis = startTimeInMillis
        updateText()
    }
}