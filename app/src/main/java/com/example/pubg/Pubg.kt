package com.example.pubg

import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Pubg : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pubg)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
    }
    fun Close(view: View) {
        val but: Button = findViewById(R.id.button5)
        when (but?.id) {
            R.id.button5 -> finish()
        }
    }
}