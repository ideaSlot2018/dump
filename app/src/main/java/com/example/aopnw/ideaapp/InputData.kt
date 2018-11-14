package com.example.aopnw.ideaapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem

class InputData : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input_data)
        this.supportActionBar?.setDisplayHomeAsUpEnabled(true)
        this.supportActionBar?.title = "InputData"
    }
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> finish()
            else -> return super.onOptionsItemSelected(item)
        }
        return super.onOptionsItemSelected(item)


    }
}
