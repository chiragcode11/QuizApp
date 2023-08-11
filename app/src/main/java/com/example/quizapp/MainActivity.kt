package com.example.quizapp


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.widget.AppCompatEditText
import eu.tutorials.quizapp.Constants

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonStart: Button = findViewById(R.id.btn_start)
        val etName: AppCompatEditText = findViewById(R.id.et_name)

        // TODO (STEP 3: Now validate name is entered or not and launch the QuizQuestion Activity.)
        buttonStart.setOnClickListener {
            if (etName.text.toString().isEmpty()){
                Toast.makeText(this,"Please Enter Your Name", Toast.LENGTH_SHORT).show()
            }else{
                val intent = Intent(this,ques_activity::class.java)
                intent.putExtra(Constants.USER_NAME, etName.text.toString())
                startActivity(intent)
            }
        }
    }
}