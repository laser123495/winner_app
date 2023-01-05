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
import android.widget.Switch
import android.widget.Toast
import com.example.winner.databinding.ActivityFeedbackBinding
import com.example.winner.databinding.ActivityPuzzleBinding
import com.example.winner.databinding.ActivityTebakgambarBinding

class puzzle : AppCompatActivity() {
    private lateinit var binding:ActivityPuzzleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPuzzleBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.imageButton2.setOnClickListener {
            Toast.makeText(applicationContext," COMING SOON!! ", Toast.LENGTH_SHORT).show()
        }
        binding.imageButton4.setOnClickListener {var mediaPlayer = MediaPlayer.create(this,R.raw.click)
            mediaPlayer.start()
            Toast.makeText(applicationContext," COMING SOON!! ", Toast.LENGTH_SHORT).show()
        }
        binding.imageButton5.setOnClickListener {var mediaPlayer = MediaPlayer.create(this,R.raw.click)
            mediaPlayer.start()
            Toast.makeText(applicationContext," COMING SOON!! ", Toast.LENGTH_SHORT).show()
        }
        binding.imageButton3.setOnClickListener {var mediaPlayer = MediaPlayer.create(this,R.raw.click)
            mediaPlayer.start()
            Toast.makeText(applicationContext," COMING SOON!! ", Toast.LENGTH_SHORT).show()
        }
        setToolbar()
        binding.ch1.setOnClickListener {

            val intent = Intent(this,puzzle1::class.java)
            startActivity(intent)
        }

    }
    private fun setToolbar() {
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.arrowhitam)
        supportActionBar?.setDisplayShowTitleEnabled(false)
    }
}