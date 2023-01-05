package com.example.winner

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.provider.MediaStore.Audio.Media
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.winner.databinding.ActivityMainBinding
import com.example.winner.databinding.ActivityTebakgambarBinding
import com.example.winner.fragments.HomeFragment
import com.example.winner.fragments.SettingsFragment
import com.example.winner.fragments.profileFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding

    private lateinit var mediaPlayer: MediaPlayer
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mediaPlayer = MediaPlayer.create(applicationContext, R.raw.lagu)
        mediaPlayer.seekTo(mediaPlayer.currentPosition)

        mediaPlayer.start()



        mediaPlayer.isLooping = true
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val homeFragment = HomeFragment()
        val profileFragment = profileFragment()
        val settingsFragment = SettingsFragment()

        makeCurrentFragment(homeFragment)
        findViewById<BottomNavigationView>(R.id.bottom_navigation).setOnItemSelectedListener{when(it.itemId){
            R.id.menut_utama -> makeCurrentFragment(homeFragment)
            R.id.menu_profil -> makeCurrentFragment(profileFragment)
            R.id.menu_settings -> makeCurrentFragment(settingsFragment)
        }
            true
        }

    }
    private fun  makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fl_wrapper, fragment)
            commit()
        }
    override fun onDestroy() {
        super.onDestroy()
        mediaPlayer.stop()
    }
}