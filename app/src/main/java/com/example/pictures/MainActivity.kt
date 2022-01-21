package com.example.pictures

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var firstText: TextView
    private lateinit var secondText: TextView
    private lateinit var thirdText: TextView
    private lateinit var forthText: TextView
    private lateinit var imageView: ImageView
    private lateinit var aboutView: ImageView

  private fun initView (){
    firstText = findViewById(R.id.textView)
    secondText = findViewById(R.id.textView2)
    thirdText = findViewById(R.id.textView3)
    forthText = findViewById(R.id.textView4)
    imageView = findViewById(R.id.imageView)
    aboutView = findViewById(R.id.imageView2)
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
        firstText.setOnClickListener{
            val intent = Intent(this@MainActivity, LetterActivity::class.java)
            startActivity(intent)
        }
    imageView.setOnClickListener{
        val shuffledList = phrases.shuffled()
            secondText.text = shuffledList[0]
            thirdText.text = shuffledList[1]
            forthText.text = shuffledList[2]
        // aaaaaaaaa
    }
    }
}