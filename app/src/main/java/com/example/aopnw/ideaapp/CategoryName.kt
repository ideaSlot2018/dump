package com.example.aopnw.ideaapp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem

class CategoryName : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_category_name)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "CategoryName"
    }
    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return super.onOptionsItemSelected(item)
   /*     when (item?.itemId) {
            android.R.id.home -> finish()
            else -> return super.onOptionsItemSelected(item)
        }
        return true
        */
    }

}
