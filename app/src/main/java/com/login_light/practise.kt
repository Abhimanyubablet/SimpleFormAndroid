package com.login_light

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class practise : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_practise)
        val languages = arrayOf<String>("Language","c","c++","kotlin","java")
        val spinner= findViewById<Spinner>(R.id.spinner)
        val adapter = ArrayAdapter(this,R.layout.spinner, languages)
        spinner.adapter = adapter
    }
}