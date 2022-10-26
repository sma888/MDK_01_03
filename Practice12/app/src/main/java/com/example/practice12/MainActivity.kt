package com.example.practice12

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }






    fun m5(view: View) {
        var photo:ImageView = findViewById(R.id.imageView)
        val m5:Int = R.drawable.m5
        photo.setImageResource(m5)
    }
    fun x5(view: View) {
        var photo:ImageView = findViewById(R.id.imageView)
        val x5m:Int = R.drawable.x5m
        photo.setImageResource(x5m)
    }
    fun m4(view: View) {
        var photo:ImageView = findViewById(R.id.imageView)
        val m4:Int = R.drawable.m4
        photo.setImageResource(m4)
    }

    fun checkBoxX5M(view: View) {
        var imageViewApple:ImageView=findViewById(R.id.imageViewX5)
        imageViewApple.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.x5m))
        val checkBoxApple:CheckBox=findViewById(R.id.checkBox3)
        if (checkBoxApple.isChecked==false)
            imageViewApple.setImageDrawable(null)
    }
    fun checkBoxM4(view: View) {
        var imageViewApple:ImageView=findViewById(R.id.imageViewM4)
        imageViewApple.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.m4))
        val checkBoxApple:CheckBox=findViewById(R.id.checkBox2)
        if (checkBoxApple.isChecked==false)
            imageViewApple.setImageDrawable(null)
    }
    fun checkBoxM5(view: View) {
        var imageViewApple:ImageView=findViewById(R.id.imageViewM5)
        imageViewApple.setImageDrawable(ContextCompat.getDrawable(this, R.drawable.m5))
        val checkBoxApple:CheckBox=findViewById(R.id.checkBox)
        if (checkBoxApple.isChecked==false)
            imageViewApple.setImageDrawable(null)
    }

}