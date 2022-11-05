package com.project.plantify.info_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.plantify.R
import kotlinx.android.synthetic.main.activity_second_screen.*

class SecondScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_screen)

        fabScreenTwo.setOnClickListener {
            intent = Intent(this, LoginScreen::class.java)
            startActivity(intent)
        }

    }
}