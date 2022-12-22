package com.example.zad8_osh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    fun but1(view: View) {
        var intent = Intent(this,collection_screen::class.java)
        startActivity(intent)
    }
}