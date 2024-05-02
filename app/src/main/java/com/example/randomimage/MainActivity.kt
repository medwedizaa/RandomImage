package com.example.randomimage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.randomimage.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val data: List<String> = listOf(
            "String #1",
            "new string",
            "other string",
            "cat",
            "dog",
            "sunshine"
        )
    }
}