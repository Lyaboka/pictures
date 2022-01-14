package com.example.pictures

import android.app.Activity
import android.os.Bundle
import android.widget.TextView

class AboutActivity: Activity() {
    var user = "Илья"
    var cat = "Марс"
    var letter = "Надоел так много жрать"
    private lateinit var letterView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        letterView = findViewById(R.id.letterView)
        user = intent.extras?.getString("username").toString()
        cat = intent.extras?.getString("cat").toString()
        letter = intent.extras?.getString("letter").toString()

        letterView.text = "Дорогой $cat, $letter \n С уважением, $user"
    }
}