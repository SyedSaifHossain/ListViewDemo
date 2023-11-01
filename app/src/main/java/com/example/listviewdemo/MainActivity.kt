package com.example.listviewdemo

import android.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Adapter
import android.widget.ArrayAdapter
import com.example.listviewdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        var list = arrayOf("Syed Saif Hossain","Rayhan","Salauddin","Nivaviman","Rumman","Sohag","irfan")

        var adapter = ArrayAdapter(this, R.layout.simple_list_item_1, list)
        binding.listView.adapter = adapter
    }
}