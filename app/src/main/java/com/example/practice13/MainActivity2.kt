package com.example.practice13

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.sqrt

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }

    fun calcul(view: View) {
        val aEdit:EditText = findViewById(R.id.editTextNumberDecimal)
        val bEdit:EditText = findViewById(R.id.editTextNumberDecimal2)

        if(!aEdit.text.isEmpty() && !bEdit.text.isEmpty()) {
            val a = aEdit.text.toString()
            val b = bEdit.text.toString()
            if(a.toDouble()>0&&b.toDouble()>0) {
                val c = sqrt(a.toDouble() * a.toDouble() + b.toDouble() * b.toDouble())
                val per = a.toDouble() + b.toDouble() + c
                val area = (a.toDouble() * b.toDouble()) / 2

                val text: TextView = findViewById(R.id.textView3)
                text.setText("Гипотенуза = $c\nПериметр = $per\n Площадь = $area")
            }
            else{
                val toaste: Toast = Toast.makeText(applicationContext, "Сторона не может быть меньше или равна 0", Toast.LENGTH_SHORT )
                toaste.show()
            }
        }
        else {
            val toaste: Toast = Toast.makeText(applicationContext, "Не все поля заполнены", Toast.LENGTH_SHORT )
            toaste.show()
        }
    }
}