package com.example.myapplication.Overviews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.example.myapplication.R

class OverViewPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_over_view_page)

        val getStartedBtn = findViewById<Button>(R.id.GetStartedButton)

        getStartedBtn.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, SimpleOverviewActivity::class.java)
            startActivity(intent)
        })
    }
}