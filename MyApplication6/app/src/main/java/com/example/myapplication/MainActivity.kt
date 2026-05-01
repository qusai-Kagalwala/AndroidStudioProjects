package com.example.myapplication

import android.net.Uri
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1. Find VideoView
        val videoView = findViewById<VideoView>(R.id.videoView)

        // 2. Load video from raw folder
        val videoUri = Uri.parse("android.resource://" + packageName + "/" + R.raw.sample)
        videoView.setVideoURI(videoUri)

        // 3. Add controls
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)

        // 4. Start video
        videoView.start()
    }
}
