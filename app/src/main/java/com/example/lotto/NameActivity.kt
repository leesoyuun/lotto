package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView

class NameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_name)

        val btnGoResultConstell= findViewById<Button>(R.id.btnGoResultName)
        val btnBack = findViewById<Button>(R.id.btnBack)
        btnGoResultConstell.setOnClickListener {
            startActivity(Intent(this,ResultActivity::class.java))
        }
        btnBack.setOnClickListener {
            finish()
        }
    }
}













