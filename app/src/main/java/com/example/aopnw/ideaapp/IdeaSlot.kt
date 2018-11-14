package com.example.aopnw.ideaapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem

class IdeaSlot : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_idea_slot)
        this.supportActionBar?.setDisplayHomeAsUpEnabled(true)
        this.supportActionBar?.title = "IdeaSlot"
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        when (item?.itemId) {
            android.R.id.home -> finish()
            else -> return super.onOptionsItemSelected(item)
        }
        return super.onOptionsItemSelected(item)


    }
}
