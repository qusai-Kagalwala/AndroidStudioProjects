package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.txtName)
        val btn = findViewById<Button>(R.id.btn)

        btn.setOnClickListener {
            val name = editText.text.toString()

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("username", name)
            startActivity(intent)
        }
    }
}

