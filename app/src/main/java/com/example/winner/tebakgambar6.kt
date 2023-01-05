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
import com.example.winner.databinding.ActivityTebakgambar5Binding
import com.example.winner.databinding.ActivityTebakgambar6Binding
import kotlinx.android.synthetic.main.activity_perhitungan1.*
import kotlinx.android.synthetic.main.activity_tebakgambar1.*
import kotlinx.android.synthetic.main.activity_tebakgambar2.*
import kotlinx.android.synthetic.main.activity_tebakgambar6.*

class tebakgambar6 : AppCompatActivity() {
    private lateinit var binding: ActivityTebakgambar6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTebakgambar6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var mediaPlayer = MediaPlayer.create(this,R.raw.dog)
        mediaPlayer.start()
        anjing.animate().apply {
            duration = 500
            rotationYBy(360f)
        }.start()

        binding.anjing.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.dog)
            mediaPlayer.start()
            anjing.animate().apply {
                duration = 500
                rotationYBy(360f)
            }.start()
        }

        binding.button11.setOnClickListener {
            val intent = Intent(this,finish::class.java)
            Toast.makeText(applicationContext,"yey benar..jawabannya anjing *guk! guk!*", Toast.LENGTH_SHORT).show()
            startActivity(intent)
            var mediaPlayer = MediaPlayer.create(this,R.raw.benar)
            mediaPlayer.start()
            Handler().postDelayed({
                var mediaPlayer2 = MediaPlayer.create(this,R.raw.finish)
                mediaPlayer2.start()
            },1000)
        }
        binding.button8.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.wrong)
            mediaPlayer.start()
            Toast.makeText(applicationContext," yah salah..itu bebek *kwek..kwek..*",Toast.LENGTH_SHORT).show()
        }
        binding.button10.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.wrong)
            mediaPlayer.start()
            Toast.makeText(applicationContext," yah salah..ayo coba lagi",Toast.LENGTH_SHORT).show()
        }
        binding.button9.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.wrong)
            mediaPlayer.start()
            Toast.makeText(applicationContext," yah salah..ayo coba lagi",Toast.LENGTH_SHORT).show()
        }
        binding.tbhelpp.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.click)
            mediaPlayer.start()
            tbhelpp.animate().apply {
                duration = 2000
                rotationYBy(720f)
            }.start()
            Toast.makeText(applicationContext,"jawabanya anjing *guk!guk!*",Toast.LENGTH_SHORT).show()
        }
        binding.back.setOnClickListener {
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
    }

}