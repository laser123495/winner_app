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
import com.example.winner.databinding.ActivityTebakgambar3Binding
import com.example.winner.databinding.ActivityTebakgambar4Binding
import kotlinx.android.synthetic.main.activity_perhitungan1.*
import kotlinx.android.synthetic.main.activity_tebakgambar2.*
import kotlinx.android.synthetic.main.activity_tebakgambar2.kucing3
import kotlinx.android.synthetic.main.activity_tebakgambar3.*
import kotlinx.android.synthetic.main.activity_tebakgambar4.*
import kotlinx.android.synthetic.main.activity_tebakgambar6.*


class tebakgambar4 : AppCompatActivity() {
    private lateinit var binding: ActivityTebakgambar4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTebakgambar4Binding.inflate(layoutInflater)
        setContentView(binding.root)

        Handler().postDelayed({
            var mediaPlayer2 = MediaPlayer.create(this,R.raw.chicken)
            mediaPlayer2.start()
            kucing3.animate().apply {
                duration = 500
                rotationYBy(360f)
            }.start()
        },500)

        binding.button9.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.chicken)
            mediaPlayer.start()
            val intent = Intent(this,tebakgambar5::class.java)
            Toast.makeText(applicationContext,"yey benar kamu hebat!!", Toast.LENGTH_SHORT).show()
            startActivity(intent)

        }
        binding.button8.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.wrong)
            mediaPlayer.start()
            Toast.makeText(applicationContext,"yah salah...semangat!!", Toast.LENGTH_SHORT).show()

        }
        binding.tbhelp.setOnClickListener {
            tbhelp.animate().apply {
                duration = 2000
                rotationYBy(720f)
            }.start()
            var mediaPlayer = MediaPlayer.create(this,R.raw.click)
            mediaPlayer.start()
            Toast.makeText(applicationContext,"pilih yang kanan bawah ya...itu kaki ayam", Toast.LENGTH_SHORT).show()

        }
        binding.button11.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.wrong)
            mediaPlayer.start()
            Toast.makeText(applicationContext," yah salah..semangat kamu pasti bisa", Toast.LENGTH_SHORT).show()

        }
        binding.button10.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.wrong)
            mediaPlayer.start()
            Toast.makeText(applicationContext," yah salah..coba lagi", Toast.LENGTH_SHORT).show()

        }
        binding.kucing3.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.chicken)
            mediaPlayer.start()
            Toast.makeText(applicationContext,"*bwok bwok bwok*",Toast.LENGTH_SHORT).show()
            kucing3.animate().apply {
                duration = 500
                rotationYBy(360f)
            }.start()
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