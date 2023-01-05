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
import android.widget.ImageButton
import android.widget.Toast
import androidx.core.graphics.rotationMatrix
import com.example.winner.databinding.ActivityTebakgambar1Binding
import com.example.winner.databinding.ActivityTebakgambarBinding
import kotlinx.android.synthetic.main.activity_perhitungan1.*
import kotlinx.android.synthetic.main.activity_tebakgambar1.*
import kotlinx.android.synthetic.main.activity_tebakgambar1.tb1help
import kotlinx.android.synthetic.main.activity_tebakgambar2.*

class tebakgambar1 : AppCompatActivity() {
    private lateinit var binding:ActivityTebakgambar1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tebakgambar1)
        binding = ActivityTebakgambar1Binding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.tb1help.setOnClickListener {
            tb1help.animate().apply {
                duration = 2000
                rotationYBy(720f)
            }.start()
            var mediaPlayer = MediaPlayer.create(this,R.raw.click)
            mediaPlayer.start()
            Toast.makeText(applicationContext,"coba pilih yang warna ungu ya...",Toast.LENGTH_SHORT).show()
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
            yesbtn.setOnClickListener{var mediaPlayer = MediaPlayer.create(this,R.raw.click)
                mediaPlayer.start()
                val intent = Intent(this,tebakgambar::class.java)
                startActivity(intent)
            }
            val nobtn = dilaogBinding.findViewById<Button>(R.id.alert_no)
            nobtn.setOnClickListener{var mediaPlayer = MediaPlayer.create(this,R.raw.click)
                mediaPlayer.start()
                myDialog.dismiss()
//                Handler().postDelayed({val intent = Intent(this,tebakgambar2::class.java)
//                    startActivity(intent)
//                },600)

            }
}
        binding.bayi.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.wrong)
            mediaPlayer.start()
            Toast.makeText(applicationContext," yah salah..ayo coba lagi",Toast.LENGTH_SHORT).show()
            bayi.animate().apply {
            duration = 500
          rotationYBy(360f)
            }.start()
        }
        binding.bayi2.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.wrong)
            mediaPlayer.start()
            Toast.makeText(applicationContext," yah salah..ayo coba lagi",Toast.LENGTH_SHORT).show()
            bayi2.animate().apply {
                duration = 500
                rotationYBy(360f)
            }.start()
        }
        binding.bayi3.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.wrong)
            mediaPlayer.start()
            Toast.makeText(applicationContext," yah salah..ayo coba lagi",Toast.LENGTH_SHORT).show()
            bayi3.animate().apply {
                duration = 500
                rotationYBy(360f)
            }.start()
        }
        binding.bayi4.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.wrong)
            mediaPlayer.start()
            Toast.makeText(applicationContext," yah salah..ayo coba lagi",Toast.LENGTH_SHORT).show()
            bayi4.animate().apply {
                duration = 500
                rotationYBy(360f)
            }.start()
        }
        binding.bayi5.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.wrong)
            mediaPlayer.start()
            Toast.makeText(applicationContext," yah salah..ayo coba lagi",Toast.LENGTH_SHORT).show()
            bayi5.animate().apply {
                duration = 500
                rotationYBy(360f)
            }.start()
        }
        binding.bayi6.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.wrong)
            mediaPlayer.start()
            Toast.makeText(applicationContext," yah salah..ayo coba lagi",Toast.LENGTH_SHORT).show()
            bayi6.animate().apply {
                duration = 500
                rotationYBy(360f)
            }.start()
        }
        binding.bayi7.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.benar)
            mediaPlayer.start()
            Toast.makeText(applicationContext,"yee benar, kamu hebat!!",Toast.LENGTH_SHORT).show()
            bayi7.animate().apply {
                duration = 500
                rotationYBy(360f)
            }.start()
            Handler().postDelayed({val intent = Intent(this,tebakgambar2::class.java)
                startActivity(intent)
            },600)

        }
        binding.bayi8.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.wrong)
            mediaPlayer.start()
            Toast.makeText(applicationContext," yah salah..ayo coba lagi",Toast.LENGTH_SHORT).show()
            bayi8.animate().apply {
                duration = 500
                rotationYBy(360f)
            }.start()
        }
        binding.bayi9.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.wrong)
            mediaPlayer.start()
            Toast.makeText(applicationContext," yah salah..ayo coba lagi",Toast.LENGTH_SHORT).show()
            bayi9.animate().apply {
                duration = 500
                rotationYBy(360f)
            }.start()
        }
        binding.bayi10.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.wrong)
            mediaPlayer.start()
            Toast.makeText(applicationContext," yah salah..ayo coba lagi",Toast.LENGTH_SHORT).show()
            bayi10.animate().apply {
                duration = 500
                rotationYBy(360f)
            }.start()
        }
        binding.bayi11.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.wrong)
            mediaPlayer.start()
            Toast.makeText(applicationContext," yah salah..ayo coba lagi",Toast.LENGTH_SHORT).show()
            bayi11.animate().apply {
                duration = 500
                rotationYBy(360f)
            }.start()
        }
        binding.bayi12.setOnClickListener {
            var mediaPlayer = MediaPlayer.create(this,R.raw.wrong)
            mediaPlayer.start()
            Toast.makeText(applicationContext," yah salah..ayo coba lagi",Toast.LENGTH_SHORT).show()
            bayi12.animate().apply {
                duration = 500
                rotationYBy(360f)
            }.start()
        }

    }}



