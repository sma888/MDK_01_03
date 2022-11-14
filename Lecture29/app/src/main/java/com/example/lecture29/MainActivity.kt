package com.example.lecture29

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView: TextView = findViewById(R.id.textView)
        val button: Button = findViewById(R.id.button)
        button.setOnClickListener(){
            var runnable: Runnable = Runnable {
                val calendar: Calendar = Calendar.getInstance()
                val hours = calendar.get(Calendar.HOUR_OF_DAY)
                val minutes = calendar.get(Calendar.MINUTE)
                val seconds = calendar.get(Calendar.SECOND)
                textView.post(Runnable {
                    textView.text = "$hours : $minutes : $seconds"
                })
            }
            val thread: Thread = Thread(runnable)
            thread.start()
        }

    }
}