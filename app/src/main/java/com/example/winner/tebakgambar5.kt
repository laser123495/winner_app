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
import com.example.winner.databinding.ActivityTebakgambar5Binding
import kotlinx.android.synthetic.main.activity_perhitungan1.*

class tebakgambar5 : AppCompatActivity() {
    private lateinit var binding: ActivityTebakgambar5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTebakgambar5Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button13.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.benar)
            mediaPlayer.start()
            val intent = Intent(this,tebakgambar6::class.java)
            Toast.makeText(applicationContext,"yey benar..jawabannya angka tiga!!", Toast.LENGTH_SHORT).show()
            startActivity(intent)
        }
        binding.button12.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.wrong)
            mediaPlayer.start()
            Toast.makeText(applicationContext," yah salah..ayo coba lagi",Toast.LENGTH_SHORT).show()
        }
        binding.button14.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.wrong)
            mediaPlayer.start()
            Toast.makeText(applicationContext," yah salah..ayo coba lagi",Toast.LENGTH_SHORT).show()
        }
        binding.button15.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.wrong)
            mediaPlayer.start()
            Toast.makeText(applicationContext," yah salah..ayo coba lagi",Toast.LENGTH_SHORT).show()
        }
        binding.tb1help.setOnClickListener {

            tb1help.animate().apply {
                duration = 2000
                rotationYBy(720f)
            }.start()
            var mediaPlayer = MediaPlayer.create(this,R.raw.click)
            mediaPlayer.start()
            Toast.makeText(applicationContext," hewan buasnya ada 3, 2 harimau dan 1 singa",Toast.LENGTH_SHORT).show()
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