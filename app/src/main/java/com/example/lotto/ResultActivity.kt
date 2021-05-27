package com.example.lotto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ResultActivity : AppCompatActivity() {
    //    val imageView1id = R.id.imageView1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val result = intent.getIntegerArrayListExtra("result")// ?: return // ?: return
        //        // 2) sort the array
//        result.sort()
//        val result_sorted = result?.sortedBy{it}
        val result_sorted = result?.sorted()
////        val result_sorted = result?.let { result.sortedBy{it} }

//        result?.let{
//            updateLottoBallImages(result.sortedBy{it})
//        }
        val lottoBallImageStartId = R.drawable.ball_01 // 146
/*        val lottoBallImageId2 = R.drawable.ball_02 // 150
        val lottoBallImageId3 = R.drawable.ball_03 // 148*/
        val imageView1 = findViewById<ImageView>(R.id.imageView1)
        val imageView2 = findViewById<ImageView>(R.id.imageView2)
        val imageView3 = findViewById<ImageView>(R.id.imageView3)
        val imageView4 = findViewById<ImageView>(R.id.imageView4)
        val imageView5 = findViewById<ImageView>(R.id.imageView5)
        val imageView6 = findViewById<ImageView>(R.id.imageView6)

        imageView1.setImageResource(lottoBallImageStartId + result_sorted!![0] - 1)
        imageView2.setImageResource(lottoBallImageStartId + result_sorted[1] - 1)
        imageView3.setImageResource(lottoBallImageStartId + result_sorted[2] - 1)
        imageView4.setImageResource(lottoBallImageStartId + result_sorted[3] - 1)
        imageView5.setImageResource(lottoBallImageStartId + result_sorted[4] - 1)
        imageView6.setImageResource(lottoBallImageStartId + result_sorted[5] - 1)
    }
}