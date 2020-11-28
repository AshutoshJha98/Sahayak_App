package com.example.sahayak

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DietMainPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diet_main_page)

        val DietMain_FruitsButton = findViewById<Button>(R.id.DietMain_FruitsButton)
        val DietMain_VegetablesButton = findViewById<Button>(R.id.DietMain_VegetablesButton)
        val DietMain_DairyButton = findViewById<Button>(R.id.DietMain_DairyButton)
        val DietMain_MeatsButton = findViewById<Button>(R.id.DietMain_MeatsButton)
        val DietMain_NutsButton = findViewById<Button>(R.id.DietMain_NutsButton)

        DietMain_FruitsButton.setOnClickListener()
        {
            val UnderDevIntent = Intent(this, UnderDevelopment :: class.java)
            startActivity(UnderDevIntent)
        }

        DietMain_VegetablesButton.setOnClickListener()
        {
            val UnderDevIntent = Intent(this, UnderDevelopment :: class.java)
            startActivity(UnderDevIntent)
        }

        DietMain_DairyButton.setOnClickListener()
        {
            val UnderDevIntent = Intent(this, UnderDevelopment :: class.java)
            startActivity(UnderDevIntent)
        }

        DietMain_MeatsButton.setOnClickListener()
        {
            val UnderDevIntent = Intent(this, UnderDevelopment :: class.java)
            startActivity(UnderDevIntent)
        }

        DietMain_NutsButton.setOnClickListener()
        {
            val UnderDevIntent = Intent(this, UnderDevelopment :: class.java)
            startActivity(UnderDevIntent)
        }
    }
}