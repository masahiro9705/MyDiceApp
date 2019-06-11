package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_anser.*

class AnserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_anser)
//        ダイスの目だし

        val dice = (Math.random() * 6).toInt()
        when (dice) {
            0 -> diceImageView.setImageResource(R.drawable.dice1)
            1 -> diceImageView.setImageResource(R.drawable.dice2)
            2 -> diceImageView.setImageResource(R.drawable.dice3)
            3 -> diceImageView.setImageResource(R.drawable.dice4)
            4 -> diceImageView.setImageResource(R.drawable.dice5)
            5 -> diceImageView.setImageResource(R.drawable.dice6)
        }



//戻るボタン
        backButton.setOnClickListener { finish() }
    }
}

