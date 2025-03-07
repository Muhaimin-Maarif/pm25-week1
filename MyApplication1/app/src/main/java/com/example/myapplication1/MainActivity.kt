package com.example.myapplication1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.myapplication1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val edInput : EditText = findViewById(R.id.edInput)
        val btnView : Button = findViewById(R.id.btnView)
//        val tampil : TextView = findViewById(R.id.tampilView)

        binding.btnView2.setOnClickListener(){
            var data : String = binding.edInput.text.toString()
            binding.tampilView.setText("Halo $data dengan auto binding")
        }

        btnView.setOnClickListener(){
            var data : String = binding.edInput.text.toString()
            binding.tampilView.setText("Halo $data dengan selection method")
        }
    }
}