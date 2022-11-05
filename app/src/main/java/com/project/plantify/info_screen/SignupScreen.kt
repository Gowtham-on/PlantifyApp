package com.project.plantify.info_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.plantify.R
import kotlinx.android.synthetic.main.activity_signup_screen.*

class SignupScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_screen)

        loginButton.setOnClickListener {
            intent = Intent(this, LoginScreen::class.java)
            startActivity(intent)
        }
    }
}