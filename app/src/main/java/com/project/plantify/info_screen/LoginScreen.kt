package com.project.plantify.info_screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.project.plantify.R
import kotlinx.android.synthetic.main.activity_login_screen.*

class LoginScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_screen)

        signUpButton.setOnClickListener {
            intent = Intent(this, SignupScreen::class.java)
            startActivity(intent)
        }
    }
}