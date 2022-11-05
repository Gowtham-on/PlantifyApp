package com.project.plantify.info_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.plantify.R
import kotlinx.android.synthetic.main.activity_first_screen.*

class FirstScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_screen)

        fabScreenOne.setOnClickListener {
            intent = Intent(this, SecondScreen::class.java)
            startActivity(intent)
            finish()
        }

    }
}