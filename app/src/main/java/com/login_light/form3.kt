package com.login_light

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
class form3 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form3)
        val languages = arrayOf<String>("Phone T.... ")
        val spinner= findViewById<Spinner>(R.id.phone)
        val adapter = ArrayAdapter(this,R.layout.state, languages)
        spinner.adapter = adapter

        val lang = arrayOf<String>("Email Ty.... ")
        val spin = findViewById<Spinner>(R.id.Email)
        val adapt = ArrayAdapter(this,R.layout.state, lang)
        spin.adapter = adapt
    }
}
