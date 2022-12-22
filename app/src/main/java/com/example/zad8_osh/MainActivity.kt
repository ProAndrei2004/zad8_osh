package com.example.zad8_osh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var log: EditText
    lateinit var pas: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun but(view: View) {
        var log1 = findViewById<EditText>(R.id.logEnter)
        var pas1 = findViewById<EditText>(R.id.pasenter)
        if (log1.text.toString()!="" && pas1.text.toString()!=""){
            var intent = Intent(this,menu::class.java)
            startActivity(intent)
        }
        else
        {
            Toast.makeText(this, "Неправильный ввод", Toast.LENGTH_SHORT).show()
        }

    }
}