package com.example.winner

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.winner.databinding.ActivityPerhitungan1Binding
import kotlinx.android.synthetic.main.activity_perhitungan1.*
import kotlinx.android.synthetic.main.activity_perhitungan1.tb1help
import kotlinx.android.synthetic.main.activity_tebakgambar1.*
import kotlinx.android.synthetic.main.activity_tebakgambar2.*
import kotlinx.android.synthetic.main.activity_tebakgambar6.*

class perhitungan1 : AppCompatActivity() {
    private lateinit var binding:ActivityPerhitungan1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tebakgambar1)
        binding = ActivityPerhitungan1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        var mediaPlayer = MediaPlayer.create(this,R.raw.croc)
        mediaPlayer.start()


        binding.button4.setOnClickListener {
            button4.animate().apply {
            duration = 500
            rotationYBy(360f)
        }.start()
            var mediaPlayer = MediaPlayer.create(this,R.raw.benar)
            mediaPlayer.start()
            val intent = Intent(this,perhitungan2::class.java)
            Toast.makeText(applicationContext,"yey benar..kamu hebat!!",Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
        binding.tb1help.setOnClickListener {

            tb1help.animate().apply {
                duration = 2000
                rotationYBy(720f)
            }.start()
            var mediaPlayer = MediaPlayer.create(this,R.raw.croc)
            mediaPlayer.start()
            Toast.makeText(applicationContext,"buayanya ada 3..jawabanya 3",Toast.LENGTH_SHORT).show()
        }
        binding.button2.setOnClickListener {
            button2.animate().apply {
                duration = 500
                rotationYBy(360f)
            }.start()
            var mediaPlayer = MediaPlayer.create(this,R.raw.wrong)
            mediaPlayer.start()
            Toast.makeText(applicationContext," yah salah...ayo jangan menyerah",Toast.LENGTH_SHORT).show()
        }
        binding.button3.setOnClickListener {
            button3.animate().apply {
                duration = 500
                rotationYBy(360f)
            }.start()
            var mediaPlayer = MediaPlayer.create(this,R.raw.wrong)
            mediaPlayer.start()
            Toast.makeText(applicationContext," yah salah..ayo coba lagi",Toast.LENGTH_SHORT).show()

        }
        binding.button1.setOnClickListener {
            button1.animate().apply {
                duration = 500
                rotationYBy(360f)
            }.start()
            var mediaPlayer = MediaPlayer.create(this,R.raw.wrong)
            mediaPlayer.start()
            Toast.makeText(applicationContext," yah salah..ayo coba lagi",Toast.LENGTH_SHORT).show()

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
                val intent = Intent(this,perhitungan::class.java)
                startActivity(intent)
            }
            val nobtn = dilaogBinding.findViewById<Button>(R.id.alert_no)
            nobtn.setOnClickListener{
                var mediaPlayer = MediaPlayer.create(this,R.raw.click)
                mediaPlayer.start()
                myDialog.dismiss()

            }
        }
    }}



