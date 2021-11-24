package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.sql.DriverManager.println


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       val sum = Sum(3,7)
        Log.d("Sum","3 + 7 = $sum")
    }

    fun Sum(num1 : Int , num2 :Int) : Int{

        return num1 + num2
    }
}