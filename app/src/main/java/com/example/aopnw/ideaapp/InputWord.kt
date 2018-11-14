package com.example.aopnw.ideaapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity

class InputWord : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_word)
        this.supportActionBar?.setDisplayHomeAsUpEnabled(true)
        this.supportActionBar?.title = "InputWord"
    }
}
