package com.example.winner

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.Button
import android.widget.Toast
import com.example.winner.databinding.ActivityPerhitunganBinding
import com.example.winner.databinding.ActivityTebakgambar1Binding
import com.example.winner.databinding.ActivityTebakgambarBinding

class perhitungan : AppCompatActivity() {
    private lateinit var binding:ActivityPerhitunganBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPerhitunganBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setToolbar()
        binding.imageButton4.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.click)
            mediaPlayer.start()
            Toast.makeText(applicationContext," COMING SOON!! ", Toast.LENGTH_SHORT).show()
        }
        binding.imageButton5.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.click)
            mediaPlayer.start()
            Toast.makeText(applicationContext," COMING SOON!! ", Toast.LENGTH_SHORT).show()
        }
        binding.imageButton3.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.click)
            mediaPlayer.start()
            Toast.makeText(applicationContext," COMING SOON!! ", Toast.LENGTH_SHORT).show()
        }
        binding.imageButton2.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.click)
            mediaPlayer.start()
            Toast.makeText(applicationContext," COMING SOON!! ", Toast.LENGTH_SHORT).show()
        }
        binding.imageButton1.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.click)
            mediaPlayer.start()
            val intent = Intent(this,perhitungan1::class.java)
            startActivity(intent)
        }
        binding.imageButton3.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.click)
            mediaPlayer.start()
            Toast.makeText(applicationContext," COMING SOON!! ", Toast.LENGTH_SHORT).show()
        }
        binding.imagebuttonboss.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.click)
            mediaPlayer.start()
            Toast.makeText(applicationContext," COMING SOON!! ", Toast.LENGTH_SHORT).show()
        }

        }

    private fun setToolbar() {
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.arrowhitam)
        supportActionBar?.setDisplayShowTitleEnabled(false)
    }
    }



