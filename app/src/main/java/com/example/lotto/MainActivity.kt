package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<View>(R.id.CardConstellation).setOnClickListener {
            val intent = Intent(this,ConstellationActivity::class.java)
            startActivity(intent)
        }
        findViewById<View>(R.id.namecardview).setOnClickListener {
            startActivity(Intent(this,NameActivity::class.java))
        }


    }
}