package com.example.myapplication

import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var player: MediaPlayer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize MediaPlayer
        player = MediaPlayer.create(this, R.raw.song)

        // Buttons
        val playBtn = findViewById<Button>(R.id.btn_play)
        val pauseBtn = findViewById<Button>(R.id.btn_pause)
        val stopBtn = findViewById<Button>(R.id.btn_stop)

        playBtn.setOnClickListener { playMusic() }
        pauseBtn.setOnClickListener { pauseMusic() }
        stopBtn.setOnClickListener { stopMusic() }
    }

    private fun playMusic() {
        if (!player.isPlaying) {
            player.start()
        }
    }

    private fun pauseMusic() {
        if (player.isPlaying) {
            player.pause()
        }
    }

    private fun stopMusic() {
        if (player.isPlaying) {
            player.stop()
            player.release()
            player = MediaPlayer.create(this, R.raw.song)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        if (::player.isInitialized) {
            player.release()
        }
    }
}
