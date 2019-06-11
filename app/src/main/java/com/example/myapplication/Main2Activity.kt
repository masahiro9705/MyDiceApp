package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_next.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)
        nextButton.setOnClickListener {
            val intent = Intent(this,ResultActivity::class.java)
            startActivity(intent)
            Log.v("MainActivity","Button Clicked")
        }
    }
}
