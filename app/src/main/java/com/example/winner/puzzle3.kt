package com.example.winner

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.Toast
import com.example.winner.databinding.ActivityFinishBinding
import com.example.winner.databinding.ActivityPuzzle1Binding
import com.example.winner.databinding.ActivityPuzzle3Binding
import com.example.winner.databinding.ActivityTebakgambar2Binding
import com.example.winner.databinding.ActivityTebakgambarBinding
import kotlinx.android.synthetic.main.activity_perhitungan1.*
import kotlinx.android.synthetic.main.activity_puzzle1.*
import kotlinx.android.synthetic.main.activity_tebakgambar1.*
import kotlinx.android.synthetic.main.activity_tebakgambar1.tb1help
import kotlinx.android.synthetic.main.activity_tebakgambar2.*
import kotlinx.android.synthetic.main.activity_tebakgambar2.tb2help

class puzzle3 : AppCompatActivity() {
    private lateinit var binding: ActivityPuzzle3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPuzzle3Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.tb2help.setOnClickListener {
            tb2help.animate().apply {
                duration = 2000
                rotationYBy(720f)
            }.start()
            var mediaPlayer = MediaPlayer.create(this,R.raw.click)
            mediaPlayer.start()
            Toast.makeText(applicationContext,"pilih yang paling tengah yaa..", Toast.LENGTH_SHORT).show()
        }

        binding.gajah3.setOnClickListener {
            gajah3.animate().apply {
                duration = 500
                rotationYBy(360f)
            }.start()
            var mediaPlayer = MediaPlayer.create(this,R.raw.benar)
            mediaPlayer.start()
            Toast.makeText(applicationContext," yee benar, kamu hebat!!",Toast.LENGTH_SHORT).show()

            binding.gjhbenar.visibility = View.VISIBLE
            val animation = AnimationUtils.loadAnimation(this,R.anim.fade_in)
            binding.gjhbenar.startAnimation(animation)

            gjhbenar.animate().apply {
                duration = 500
                rotationYBy(360f)
            }.start()
            Handler().postDelayed({val intent = Intent(this,puzzle4::class.java)

                startActivity(intent)
            },3000)
        }
        binding.gajah.setOnClickListener {
            gajah.animate().apply {
                duration = 500
                rotationYBy(360f)
            }.start()
            var mediaPlayer = MediaPlayer.create(this,R.raw.wrong)
            mediaPlayer.start()
            Toast.makeText(applicationContext,"yah salah, ayo coba lagi!",Toast.LENGTH_SHORT).show()
        }
        binding.gajah2.setOnClickListener {
            gajah2.animate().apply {
                duration = 500
                rotationYBy(360f)
            }.start()
            var mediaPlayer = MediaPlayer.create(this,R.raw.wrong)
            mediaPlayer.start()
            Toast.makeText(applicationContext,"yah salah, jangan menyerah",Toast.LENGTH_SHORT).show()
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
                val intent = Intent(this,puzzle::class.java)
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

    override fun onDestroy() {
        super.onDestroy()
        binding.gjhbenar.visibility = View.VISIBLE
    }
}