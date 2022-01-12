package com.example.pictures

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var secondText: TextView
    private lateinit var thirdText: TextView
    private lateinit var forthText: TextView
    private lateinit var imageView: ImageView

//    private fun initView (a:View, b:String){
//       val c:Int = ("R.id.$b").toInt()
//        a = findViewById(c)
//    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    secondText = findViewById(R.id.textView2)
    thirdText = findViewById(R.id.textView3)
    forthText = findViewById(R.id.textView4)
    imageView = findViewById(R.id.imageView)
    imageView.setOnClickListener{
        val phrases = listOf(
            "У тебя сегодня 6 пар",
            "В доме полный беспорядок, хозяин",
            "Покорми нас",
            "Мы разбили твою любимую кружку!",
            "Вставай, безработный",
            "Нам нечего кушать!",
            "В лотке плохо пахнет")
        val shuffledList = phrases.shuffled()
//        initView(secondText,"textView")

        secondText.text = shuffledList[0]
        thirdText.text = shuffledList[1]
        forthText.text = shuffledList[2]
    }
    }
}