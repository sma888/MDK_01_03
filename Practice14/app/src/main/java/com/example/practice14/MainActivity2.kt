package com.example.practice14

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        fun onCreate(){
            val arguments:Bundle? = intent.extras
            val name: EditText = findViewById(R.id.editTextTextPersonName)
            val email: EditText = findViewById(R.id.editTextTextEmailAddress)
            val password: EditText = findViewById(R.id.editTextTextPassword)


            name.setText("${arguments?.get("name")}")
        }


    }
}