package com.example.sahayak

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import android.widget.Button
import android.widget.TextView
import java.io.*
import java.lang.StringBuilder
import java.nio.file.StandardOpenOption

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Diet_Button = findViewById<Button>(R.id.Diet_Button)
        val Exercise_Button = findViewById<Button>(R.id.Exercixe_Button)
        val Finance_Button = findViewById<Button>(R.id.Finance_Button)
        val Analysis_Button = findViewById<Button>(R.id.Analysis_Button)
        val console = findViewById<TextView>(R.id.TextConsole)

        /*val fileContent:String = "Test123 \n"
        var myExternalFile:File = File(getExternalFilesDir(""),"test.txt")
        val fileOutPutStream = FileOutputStream(myExternalFile,true)
        fileOutPutStream.write(fileContent.toByteArray())
        fileOutPutStream.close()*/


        //Button presses on main activity open the respective activities
        Diet_Button.setOnClickListener()
        {
            val DietMainIntent = Intent(this,DietMainPage :: class.java)
            startActivity(DietMainIntent)
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