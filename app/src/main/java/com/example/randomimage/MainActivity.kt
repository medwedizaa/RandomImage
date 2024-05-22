package com.example.randomimage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.Orientation
import androidx.recyclerview.widget.RecyclerView.VERTICAL
import com.example.randomimage.databinding.ActivityMainBinding
import com.example.randomimage.network.NetworkClient

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
            "sunshine",
        )

        binding.myList.layoutManager = LinearLayoutManager(this@MainActivity)
        val myAdapter = MyListAdapter()
        binding.myList.adapter = myAdapter

        myAdapter.setList(data)

        val networkClient = NetworkClient()
        networkClient.initClient()

        networkClient.getDogImage()
    }
}