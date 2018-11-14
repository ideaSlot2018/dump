package com.example.aopnw.ideaapp

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class Main : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        IdeaList.setOnClickListener {
            val intent = Intent(this, com.example.aopnw.ideaapp.IdeaList::class.java)
            startActivity(intent)
        }
        InputData.setOnClickListener {
            val intent = Intent(this, com.example.aopnw.ideaapp.InputData::class.java)
            startActivity(intent)
        }
        IdeaSlot.setOnClickListener {
            val intent = Intent(this, com.example.aopnw.ideaapp.IdeaSlot::class.java)
            startActivity(intent)
        }
        Category.setOnClickListener {
            val intent = Intent(this, com.example.aopnw.ideaapp.Category::class.java)
            startActivity(intent)
        }
    }
}
