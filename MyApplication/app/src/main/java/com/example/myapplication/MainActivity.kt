package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // onCreate Toast
        Toast.makeText(this, "MainActivity onCreate", Toast.LENGTH_SHORT).show()

        // Button find karo
        val btnNext = findViewById<Button>(R.id.btnNext)

        // Button click listener
        btnNext.setOnClickListener {
            // Second activity open karo
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

            // MainActivity destroy ke liye finish
            finish()
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "MainActivity onStart", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "MainActivity onResume", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "MainActivity onPause", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "MainActivity onStop", Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "MainActivity onRestart", Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        // Delay se Toast clearly dikhega
        Handler(Looper.getMainLooper()).postDelayed({
            Toast.makeText(this, "MainActivity onDestroy", Toast.LENGTH_LONG).show()
        }, 100)
    }
}