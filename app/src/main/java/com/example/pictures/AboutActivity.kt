package com.example.pictures

import android.app.Activity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_about.*

class AboutActivity: Activity() {
    var user = "Илья"
    var cat = "Марс"
    var letter = "Надоел так много жрать"

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        user = intent.extras?.getString("username").toString()
        cat = intent.extras?.getString("cat").toString()
        letter = intent.extras?.getString("letter").toString()

        letterView.text = "Дорогой $cat, $letter \n С уважением, $user"
    }
}