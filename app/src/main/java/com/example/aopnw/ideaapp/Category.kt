package com.example.aopnw.ideaapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_category.*

class Category : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category)

        categoryButton.setOnClickListener {
            val intent = Intent(this, CategoryName::class.java)
            startActivity(intent)
        }


    }
}
