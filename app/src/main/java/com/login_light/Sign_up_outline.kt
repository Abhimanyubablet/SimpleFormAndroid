package com.login_light

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class Sign_up_outline : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up_outline)
        val languages = arrayOf<String>("Age","17","18","19","20")
        val spinner= findViewById<Spinner>(R.id.age)
        val adapter = ArrayAdapter(this,R.layout.custom_design, languages)
        spinner.adapter = adapter


        val lang = arrayOf<String>("Gender","Male","Female")
        val spin = findViewById<Spinner>(R.id.sex)
        val adapt = ArrayAdapter(this,R.layout.custom_design, lang)
        spin.adapter = adapt

        val lang3 = arrayOf<String>("Country","India","USA")
        val spin3 = findViewById<Spinner>(R.id.nation)
        val adapt3 = ArrayAdapter(this,R.layout.custom_design, lang3)
        spin3.adapter = adapt3
    }
}