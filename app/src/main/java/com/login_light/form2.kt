package com.login_light

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner
class form2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form2)
        val languages = arrayOf<String>("State","Bihar","UP","MP","Bengal")
        val spinner= findViewById<Spinner>(R.id.abhi)
        val adapter = ArrayAdapter(this,R.layout.state, languages)
        spinner.adapter = adapter
    }
}