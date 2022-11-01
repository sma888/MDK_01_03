package com.example.practice14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
            val arguments:Bundle? = intent.extras
            val name: EditText = findViewById(R.id.editTextTextPersonName)
            val email: EditText = findViewById(R.id.editTextTextEmailAddress)
            val password: EditText = findViewById(R.id.editTextTextPassword)


            name.setText("${arguments?.get("name")}")
            email.setText("${arguments?.get("email")}")
            password.setText("${arguments?.get("password")}")
        }

    fun sendButtonClick1(view: View) {

        val name: EditText = findViewById(R.id.editTextTextPersonName)
        val email: EditText = findViewById(R.id.editTextTextEmailAddress)
        val password: EditText = findViewById(R.id.editTextTextPassword)
        var intent: Intent = Intent(this@MainActivity2, MainActivity::class.java)

        if (!name.text.isEmpty() && !email.text.isEmpty() && !password.text.isEmpty()) {

            intent.putExtra("name", name.text.toString() + "*")
            intent.putExtra("email", email.text.toString() + "*")
            intent.putExtra("password", password.text.toString() + "*")

        }
        startActivity(intent)
    }
}
