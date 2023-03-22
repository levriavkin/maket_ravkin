package com.bignerdranch.android.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class login2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)
    }
    fun next(view: View) {
        val intent = Intent(this,nextboard::class.java)
        startActivity(intent)
    }
}