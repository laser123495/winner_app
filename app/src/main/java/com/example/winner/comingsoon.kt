package com.example.winner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_comingsoon.*

class comingsoon : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comingsoon)
        button7.setOnClickListener {
            val intent = Intent(this,tebakgambar::class.java)
            startActivity(intent)
        }
    }

}