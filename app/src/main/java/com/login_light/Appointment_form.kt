package com.login_light

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.DialogInterface;
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Appointment_form : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_appointment_form)

        val editText1=findViewById<EditText>(R.id.editText1)
        val editText2=findViewById<EditText>(R.id.editText2)
        val editText3=findViewById<EditText>(R.id.editText3)
        val textView1=findViewById<TextView>(R.id.mytext1)
        val textView2=findViewById<TextView>(R.id.mytext2)
        val textView3=findViewById<TextView>(R.id.mytext3)
        val button=findViewById<Button>(R.id.button)


         button.setOnClickListener {
             val text1 = editText1.text.toString()
             val text2 = editText2.text.toString()
             val text3 = editText3.text.toString()

             textView1.setText(text1)
             textView2.setText(text2)
             textView3.setText(text3)

             editText1.text.clear()
             editText2.text.clear()
             editText3.text.clear()
         }
    }
}