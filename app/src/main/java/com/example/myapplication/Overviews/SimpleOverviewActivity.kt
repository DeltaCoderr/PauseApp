package com.example.myapplication.Overviews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.myapplication.HomePage
import com.example.myapplication.R

class SimpleOverviewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simple_overview)

        var iterator = 0

        var arr1 = arrayOf("title 1", "title 2", "title 3", "title 4")
        var arr2 = arrayOf("para 1", "para 2", "para 3", "para 4")

        val nextButton = findViewById<Button>(R.id.nextOverView1)
        val topicBox = findViewById<TextView>(R.id.topicOverView1)
        val paraBox = findViewById<TextView>(R.id.paraOverView1)

        nextButton.setOnClickListener(View.OnClickListener {
            if (iterator <= arr1.size) {
                topicBox.setText(arr1[iterator])
                paraBox.setText(arr2[iterator])
                iterator += 1
            }
            else if (iterator > 4) {
                startActivity(Intent(this, HomePage::class.java))
            }
        })


    }
}