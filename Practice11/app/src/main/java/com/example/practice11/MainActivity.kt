package com.example.practice11

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var incriment:Int = 1
    }

    fun load(view: View) {
        val photo:ImageView  = findViewById(R.id.imageView2)
        val image:Int = R.drawable.accent
        photo.setImageResource(image)
    }

    val image1:Int = R.drawable.accent
    val image:Int = R.drawable.btn_check_buttonless_on

    var sueta:Boolean = true

    fun onClickImage(view: View) {
        val photo:ImageView  = findViewById(R.id.imageView2)
        val status:ImageButton = findViewById(R.id.imageButton)

        if (sueta == true){
            photo.setImageResource(image1)
            status.setImageResource(image)
            sueta = false
        }
        else if(sueta==false){
            photo.setImageDrawable(null)
            status.setImageDrawable(null)
            sueta=true
        }
    }
}