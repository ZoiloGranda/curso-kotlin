package com.example.androidtestapp.firstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import com.example.androidtestapp.R

class FirstAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_app)
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)
        btnStart.setOnClickListener {
            Log.i("taag", "presionado")
        }
    }
}