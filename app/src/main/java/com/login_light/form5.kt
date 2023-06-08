package com.login_light

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class  form5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form5)
        val languages = arrayOf<String>("California ","Wasigonton","New Jercy","Holand")
        val spinner= findViewById<Spinner>(R.id.state)
        val adapter = ArrayAdapter(this,R.layout.state, languages)
        spinner.adapter = adapter

        val lang = arrayOf<String>("United States ","India","Japan")
        val spin = findViewById<Spinner>(R.id.country)
        val adapt = ArrayAdapter(this,R.layout.state, lang)
        spin.adapter = adapt
    }
}