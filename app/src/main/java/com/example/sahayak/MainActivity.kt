package com.example.sahayak

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Diet_Button = findViewById<Button>(R.id.Diet_Button)
        val Exercise_Button = findViewById<Button>(R.id.Exercixe_Button)
        val Finance_Button = findViewById<Button>(R.id.Finance_Button)
        val Analysis_Button = findViewById<Button>(R.id.Analysis_Button)
        //Button presses on main activity open the respective activities
        Diet_Button.setOnClickListener()
        {
            val intent = Intent(this,UnderDevelopment :: class.java)
            startActivity(intent)
        }

        Exercise_Button.setOnClickListener()
        {
            val intent = Intent(this,UnderDevelopment :: class.java)
            startActivity(intent)
        }

        Finance_Button.setOnClickListener()
        {
            val intent = Intent(this,UnderDevelopment :: class.java)
            startActivity(intent)
        }

        Analysis_Button.setOnClickListener()
        {
            val intent = Intent(this,UnderDevelopment :: class.java)
            startActivity(intent)
        }


    }
}