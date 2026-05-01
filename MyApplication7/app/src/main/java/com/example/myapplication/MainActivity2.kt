package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val name = intent.getStringExtra("username")

        Toast.makeText(this, "Hello $name", Toast.LENGTH_SHORT).show()

        val btn = findViewById<Button>(R.id.showList)
        val listView = findViewById<ListView>(R.id.listView)

        btn.setOnClickListener {

            val list = arrayOf("A", "B", "C")

            val adapter = ArrayAdapter(
                this,
                android.R.layout.simple_list_item_1,
                list
            )

            listView.adapter = adapter
            listView.visibility = View.VISIBLE
        }
    }
}

