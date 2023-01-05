package com.example.winner

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.winner.databinding.ActivityDialogFeedbackBinding
import com.example.winner.databinding.ActivityFeedbackBinding

class dialog_feedback : AppCompatActivity() {
    private lateinit var binding: ActivityDialogFeedbackBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDialogFeedbackBinding.inflate(layoutInflater)
        setContentView(binding.root)}}