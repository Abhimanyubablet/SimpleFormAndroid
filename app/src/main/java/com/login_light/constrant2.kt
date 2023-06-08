package com.login_light

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class constrant2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_constrant2)

       Handler().postDelayed({
           startActivity(Intent(this,relative1::class.java))
       },2000)

    }
}