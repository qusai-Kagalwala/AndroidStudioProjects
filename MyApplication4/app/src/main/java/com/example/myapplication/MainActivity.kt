package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Views
        val txtUsername = findViewById<EditText>(R.id.txt_Name)
        val txtPassword = findViewById<EditText>(R.id.txt_Pass)
        val btnSubmit = findViewById<Button>(R.id.btn_Submit)
        val btnReset = findViewById<Button>(R.id.btn_Reset)

        // Submit Button Logic
        btnSubmit.setOnClickListener {

            val username = txtUsername.text.toString()
            val password = txtPassword.text.toString()

            if (username == "admin" && password == "admin") {
                Toast.makeText(this, "Correct username and password", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Incorrect username/password", Toast.LENGTH_SHORT).show()
            }
        }

        // Reset Button Logic
        btnReset.setOnClickListener {
            txtUsername.text.clear()
            txtPassword.text.clear()
            Toast.makeText(this, "Fields Cleared", Toast.LENGTH_SHORT).show()
        }
    }
}

