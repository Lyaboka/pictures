package com.example.pictures

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LetterActivity: Activity() {
    private lateinit var userText: EditText
    private lateinit var catText: EditText
    private lateinit var letterText: EditText
    private lateinit var sendButton: Button
    fun initView(){
        userText = findViewById(R.id.user)
        catText = findViewById(R.id.cat)
        letterText = findViewById(R.id.letter)
        sendButton = findViewById(R.id.button)

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_letter)
        initView()
        sendButton.setOnClickListener{
         val intent = Intent(this@LetterActivity, AboutActivity::class.java)
           intent.putExtra("username",userText.text.toString())
            intent.putExtra("cat", catText.text.toString())
            intent.putExtra("letter", letterText.text.toString())
            startActivity(intent)
        }


    }
}