package com.example.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class PracIntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prac_intent)

        val btnMain = findViewById<Button>(R.id.btnMain)
        val btnContellation = findViewById<Button>(R.id.btnContellation)
        val btnName = findViewById<Button>(R.id.btnName)
        val btnResult = findViewById<Button>(R.id.btnResult)

        btnMain.setOnClickListener {
            startActivity(Intent(this@PracIntentActivity,MainActivity::class.java))
        }
        btnContellation.setOnClickListener {
            startActivity(Intent(this@PracIntentActivity,ConstellationActivity::class.java))
        }
        btnName.setOnClickListener {
            startActivity(Intent(this@PracIntentActivity,NameActivity::class.java))
        }
        btnResult.setOnClickListener {
            startActivity(Intent(this@PracIntentActivity,ResultActivity::class.java))
        }
    }
}