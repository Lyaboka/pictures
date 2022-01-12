package com.example.pictures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var secondText: TextView
    private lateinit var thirdText: TextView
    private lateinit var forthText: TextView
    private lateinit var imageView: ImageView

  private fun initView (){
    secondText = findViewById(R.id.textView2)
    thirdText = findViewById(R.id.textView3)
    forthText = findViewById(R.id.textView4)
    imageView = findViewById(R.id.imageView)
 }
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
    initView()
    imageView.setOnClickListener{
        val shuffledList = phrases.shuffled()
            secondText.text = shuffledList[0]
            thirdText.text = shuffledList[1]
            forthText.text = shuffledList[2]
    }
    }
}