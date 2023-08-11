package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import eu.tutorials.quizapp.Constants

class Resultsactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultsactivity)

        val tvName : TextView = findViewById(R.id.tv_name)
        val tvScore : TextView = findViewById(R.id.tv_score)
        val btnFinish : Button = findViewById(R.id.btn_finish)

        tvName.text = intent.getStringExtra(Constants.USER_NAME)

        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val CorrectAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        tvScore.text = "Your score is $CorrectAnswers out of $totalQuestions"

        btnFinish.setOnClickListener(){
           val intent1 =  Intent(this, MainActivity::class.java)
            startActivity(intent1)
        }

    }
}