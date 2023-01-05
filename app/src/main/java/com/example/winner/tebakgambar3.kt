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
import com.example.winner.databinding.ActivityTebakgambar2Binding
import com.example.winner.databinding.ActivityTebakgambar3Binding
import kotlinx.android.synthetic.main.activity_perhitungan1.*
import kotlinx.android.synthetic.main.activity_tebakgambar2.*
import kotlinx.android.synthetic.main.activity_tebakgambar2.kucing
import kotlinx.android.synthetic.main.activity_tebakgambar2.kucing2
import kotlinx.android.synthetic.main.activity_tebakgambar2.kucing3
import kotlinx.android.synthetic.main.activity_tebakgambar3.*
import kotlinx.coroutines.delay

class tebakgambar3 : AppCompatActivity() {
    private lateinit var binding: ActivityTebakgambar3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTebakgambar3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler().postDelayed({
            var mediaPlayer2 = MediaPlayer.create(this,R.raw.kucing)
            mediaPlayer2.start()
            kucing.animate().apply {
                duration = 500
                rotationYBy(360f)
            }.start()
        },500)
        Handler().postDelayed({
            var mediaPlayer2 = MediaPlayer.create(this,R.raw.dog)
            mediaPlayer2.start()
            kucing2.animate().apply {
                duration = 500
                rotationYBy(360f)
            }.start()
        },1500)
        Handler().postDelayed({
            var mediaPlayer2 = MediaPlayer.create(this,R.raw.chicken)
            mediaPlayer2.start()
            kucing3.animate().apply {
                duration = 500
                rotationYBy(360f)
            }.start()
        },2500)

        binding.back2.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.click)
            mediaPlayer.start()

            val dilaogBinding = layoutInflater.inflate(R.layout.activity_quit,null)

            val myDialog = Dialog(this)
            myDialog.setContentView(dilaogBinding)

            myDialog.setCancelable(true)
            myDialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            myDialog.show()

            val yesbtn = dilaogBinding.findViewById<Button>(R.id.alert_yes)
            yesbtn.setOnClickListener{
                var mediaPlayer = MediaPlayer.create(this,R.raw.click)
                mediaPlayer.start()
                val intent = Intent(this,tebakgambar::class.java)
                startActivity(intent)
            }
            val nobtn = dilaogBinding.findViewById<Button>(R.id.alert_no)
            nobtn.setOnClickListener{
                var mediaPlayer = MediaPlayer.create(this,R.raw.click)
                mediaPlayer.start()
                myDialog.dismiss()

            }
        }
        binding.kucing.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.kucing)
            mediaPlayer.start()
            Toast.makeText(applicationContext," yee benar, kamu hebat!!",Toast.LENGTH_SHORT).show()
            kucing.animate().apply {
                duration = 500
                rotationYBy(360f)
            }.start()
            Handler().postDelayed({val intent = Intent(this,tebakgambar4::class.java)
                startActivity(intent)
            },600)
        }
        binding.kucing2.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.dog)
            mediaPlayer.start()
            Toast.makeText(applicationContext," yah salah, itu kaki anjing",Toast.LENGTH_SHORT).show()
            kucing2.animate().apply {
                duration = 500
                rotationYBy(360f)
            }.start()
        }
        binding.kucing3.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.chicken)
            mediaPlayer.start()
            Toast.makeText(applicationContext," yah salah, itu kaki ayam",Toast.LENGTH_SHORT).show()
            kucing3.animate().apply {
                duration = 500
                rotationYBy(360f)
            }.start()
        }

        binding.tb3help.setOnClickListener {
            tb3help.animate().apply {
                duration = 2000
                rotationYBy(720f)
            }.start()
            var mediaPlayer = MediaPlayer.create(this,R.raw.click)
            mediaPlayer.start()
            Toast.makeText(applicationContext,"coba pilih yang paling kiri ya.", Toast.LENGTH_SHORT).show()
        }
    }

}