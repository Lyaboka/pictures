package com.example.pictures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val phrases = listOf(
        "У тебя сегодня 6 пар",
        "В доме полный беспорядок, хозяин",
        "Покорми нас",
        "Мы разбили твою любимую кружку!",
        "Вставай, безработный",
        "Нам нечего кушать!",
        "В лотке плохо пахнет")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstTV.setOnClickListener{
            startActivity(Intent(this@MainActivity, LetterActivity::class.java))
        }

        refreshIV.setOnClickListener{
            val shuffledList = phrases.shuffled()
            secondTV.text = shuffledList[0]
            thirdTV.text = shuffledList[1]
            forthTV.text = shuffledList[2]
        }
    }
}