package com.example.winner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class startpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_startpage)
        val btnmulai = findViewById<Button>(R.id.btmulai)
        btnmulai.setOnClickListener{
            val Intent = Intent(this,loading_page::class.java)
            startActivity(Intent)
        }

    }
}