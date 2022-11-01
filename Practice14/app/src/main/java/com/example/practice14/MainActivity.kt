package com.example.practice14

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import java.util.jar.Attributes
import java.util.jar.Attributes.Name

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendButtonClick(view: View) {
        val name:EditText = findViewById(R.id.editTextTextPersonName)
        val email:EditText = findViewById(R.id.editTextTextEmailAddress)
        val password:EditText = findViewById(R.id.editTextTextPassword)



        var intent:Intent = Intent(this@MainActivity, MainActivity2::class.java)
        intent.putExtra("name", name.text.toString())
        intent.putExtra("email", email.text.toString())
        intent.putExtra("password", password.text.toString())
        startActivity(intent)
    }
}