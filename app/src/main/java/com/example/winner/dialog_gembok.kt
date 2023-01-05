package com.example.winner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.winner.databinding.ActivityDialogGembokBinding
import com.example.winner.databinding.ActivityFeedbackBinding

class dialog_gembok : AppCompatActivity() {
    private lateinit var binding: ActivityDialogGembokBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDialogGembokBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}