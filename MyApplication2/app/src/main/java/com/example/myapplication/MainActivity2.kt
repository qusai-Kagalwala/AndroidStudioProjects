package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main2)

        val txt = findViewById<TextView>(R.id.txt_msg)
        val btn = findViewById<Button>(R.id.btnClick)

        val name = intent.getStringExtra("username")

        txt.text = "Welcome Admin"

        Toast.makeText(this, "Hello $name", Toast.LENGTH_SHORT).show()

        btn.setOnClickListener {
            Toast.makeText(this, "Button Clicked!", Toast.LENGTH_SHORT).show()
        }
    }
}

