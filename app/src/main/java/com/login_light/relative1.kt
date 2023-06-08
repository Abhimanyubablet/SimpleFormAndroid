package com.login_light

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RelativeLayout
import android.widget.TextView

class relative1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_relative1)

        val btn=findViewById<RelativeLayout>(R.id.relative2_shape)
        btn.setOnClickListener{
            val abhi_intent= Intent(this,Appointment_form::class.java)
            startActivity(abhi_intent)
        }
    }
}