package com.example.pictures

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_letter.*

class LetterActivity: Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_letter)

        sendB.setOnClickListener{
            val intent = Intent(this@LetterActivity, AboutActivity::class.java).apply {
                putExtra("username",user.text.toString())
                putExtra("cat", cat.text.toString())
                putExtra("letter", letter.text.toString())
            }
            startActivity(intent)
        }
    }
}