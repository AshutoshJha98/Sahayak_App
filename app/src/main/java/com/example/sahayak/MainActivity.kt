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

        /* For writing to external File (in Android>data Folder)
        val fileContent:String = "Test123 \n"
        var myExternalFile:File = File(getExternalFilesDir(""),"test.txt")
        val fileOutPutStream = FileOutputStream(myExternalFile,true)
        fileOutPutStream.write(fileContent.toByteArray())
        fileOutPutStream.close()

        //For reading from external File (in Android>data Folder)
        val inputAsString = FileInputStream(myExternalFile).bufferedReader().use { it.readText()}
        console.text = inputAsString*/


        //Button presses on main activity open the respective activities
        Diet_Button.setOnClickListener()
        {
            val DietMainIntent = Intent(this,DietMainPage :: class.java)
            startActivity(DietMainIntent)
        }

        Exercise_Button.setOnClickListener()
        {
            val UnderDevIntent = Intent(this,UnderDevelopment :: class.java)
            startActivity(UnderDevIntent)
        }

        Finance_Button.setOnClickListener()
        {
            val UnderDevIntent = Intent(this,UnderDevelopment :: class.java)
            startActivity(UnderDevIntent)
        }

        Analysis_Button.setOnClickListener()
        {
            val UnderDevIntent = Intent(this,UnderDevelopment :: class.java)
            startActivity(UnderDevIntent)
        }



    }
}