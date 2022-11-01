package com.example.practice13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }




    fun click(view: View) {
        var rub:EditText = findViewById(R.id.inputRub)
        var kurs:EditText = findViewById(R.id.resultUsd)
        val text:TextView = findViewById(R.id.textViewResult)

        if(!rub.text.isEmpty() && !kurs.text.isEmpty()) {
            var rubText: String = rub.text.toString()
            var usdText: String = kurs.text.toString()
            var result: String = (usdText.toDouble() * rubText.toDouble()).toString()
            text.text = result.toString()
        }
    }

}