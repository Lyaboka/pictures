package com.example.pictures

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*
import kotlin.collections.ArrayList

class MainActivity : AppCompatActivity() {
    private var actions = ArrayList<String>()
    private var phrases = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fillArray()
        actionsList.adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,actions)

        actionsList.setOnItemClickListener { _, _, i, _ ->
            when (i) {

                0 -> startActivity(Intent(this@MainActivity, LetterActivity::class.java))

                1 ->  {val shuffledList = phrases.shuffled()
                    firstTV.text = shuffledList[0]
                    secondTV.text = shuffledList[1]
                    thirdTV.text = shuffledList[2]
                    forthTV.text = shuffledList[3]
                }

                2 ->  {val random = Random()
                    val color = Color.argb(255, random.nextInt(256), random.nextInt(256), random.nextInt(256))
                    root_layout.setBackgroundColor(color)}
            }
        }

    }

    private fun fillArray()
    {
        phrases.add("У тебя сегодня 6 пар")
        phrases.add("В доме полный беспорядок, хозяин")
        phrases.add("Покорми нас")
        phrases.add("Мы разбили твою любимую кружку!")
        phrases.add("Вставай, безработный")
        phrases.add("Нам нечего кушать!")
        phrases.add("В лотке плохо пахнет")

        actions.add("Отправить письмо")
        actions.add("Перемешать фразы")
        actions.add("Поменять цвет фона")
    }


}