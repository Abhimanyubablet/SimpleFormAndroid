package com.login_light

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class sign_up : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        val languages = arrayOf<String>("Age","17","18","19","20")
        val spinner= findViewById<Spinner>(R.id.age)
        val adapter = ArrayAdapter(this,R.layout.state, languages)
        spinner.adapter = adapter

        val lang = arrayOf<String>("Gender","Male","Female")
        val spin = findViewById<Spinner>(R.id.gender)
        val adapt = ArrayAdapter(this,R.layout.state, lang)
        spin.adapter = adapt
    }
}