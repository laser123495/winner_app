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
import com.example.winner.databinding.ActivityTebakgambarBinding
import com.example.winner.databinding.ActivityTutorialPuzzleBinding
import kotlinx.android.synthetic.main.activity_tebakgambar6.*
import kotlinx.android.synthetic.main.activity_tutorial_puzzle.*

class tutorial_puzzle : AppCompatActivity() {
    private lateinit var binding:ActivityTutorialPuzzleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTutorialPuzzleBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var mediaPlayer = MediaPlayer.create(this,R.raw.kucing)
        mediaPlayer.start()
        kucing.animate().apply {
            duration = 500
            rotationYBy(360f)
        }.start()

        binding.kucing.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.kucing)
            mediaPlayer.start()
            kucing.animate().apply {
                duration = 500
                rotationYBy(360f)
            }.start()
        }
        setToolbar()
    }
    private fun setToolbar() {
        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.arrowhitam)
        supportActionBar?.setDisplayShowTitleEnabled(false)
    }

}