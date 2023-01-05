package com.example.winner

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageButton
import com.example.winner.databinding.ActivityFeedbackBinding
import com.example.winner.databinding.ActivityFinishBinding
import com.example.winner.databinding.ActivityFinishPerhitunganBinding
import kotlinx.android.synthetic.main.activity_finish.*
import kotlinx.android.synthetic.main.activity_tebakgambar2.*

class finishPerhitungan : AppCompatActivity() {
    private lateinit var binding: ActivityFinishPerhitunganBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFinishPerhitunganBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.buttonLanjut.setOnClickListener {var mediaPlayer = MediaPlayer.create(this,R.raw.click)
            mediaPlayer.start()
            val intent = Intent(this,perhitungan::class.java)
            startActivity(intent)
        }
        binding.buttonQuit.setOnClickListener {var mediaPlayer = MediaPlayer.create(this,R.raw.click)
            mediaPlayer.start()
            val intent = Intent(this,perhitungan::class.java)
            startActivity(intent)
        }



    }


}