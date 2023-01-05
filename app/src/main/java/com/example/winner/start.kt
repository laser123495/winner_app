package com.example.winner

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.winner.databinding.ActivityInputNamaBinding


class start : AppCompatActivity() {

    private lateinit var binding: ActivityInputNamaBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInputNamaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btmulaiInputnama.setOnClickListener {
            val intent = Intent(this,loading_page::class.java)
            startActivity(intent)
        }


    }
}