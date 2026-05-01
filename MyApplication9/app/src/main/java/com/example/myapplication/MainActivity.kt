package com.example.myapplication

import android.graphics.BitmapFactory
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.provider.ContactsContract.CommonDataKinds.Website.URL
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.io.BufferedInputStream
import java.io.File
import java.io.FileOutputStream
import java.net.URL
import javax.net.ssl.HttpsURLConnection

class MainActivity : AppCompatActivity() {

    private lateinit var progressBar: ProgressBar
    private lateinit var textView: TextView
    private lateinit var button: Button
    private lateinit var imageView: ImageView
    private lateinit var handler: Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        progressBar = findViewById(R.id.progressBar)
        textView = findViewById(R.id.textView)
        button = findViewById(R.id.button)
        imageView = findViewById(R.id.imageView)

        handler = Handler(Looper.getMainLooper())

        button.setOnClickListener { startDownload() }
    }

    private fun startDownload() {
        Thread {
            try {
                val url = URL("https://picsum.photos/1000")
                val conn = url.openConnection() as HttpsURLConnection
                conn.connect()

                val total = conn.contentLength
                val input = BufferedInputStream(conn.inputStream)
                val file = File(filesDir, "img.jpg")
                val output = FileOutputStream(file)

                val data = ByteArray(1024)
                var downloaded = 0
                var count = input.read(data)

                while (count != -1) {
                    downloaded += count

                    if (total > 0) {
                        val progress = downloaded * 100 / total
                        handler.post {
                            progressBar.progress = progress
                            textView.text = "Downloaded: $progress%"
                        }
                    }

                    output.write(data, 0, count)
                    count = input.read(data)
                }

                output.close()
                input.close()

                val bmp = BitmapFactory.decodeFile(file.absolutePath)

                handler.post {
                    imageView.setImageBitmap(bmp)
                    textView.text = "Download Complete ✅"
                }

            } catch (e: Exception) {
                handler.post {
                    textView.text = "Download Failed ❌"
                }
            }
        }.start()
    }
}
