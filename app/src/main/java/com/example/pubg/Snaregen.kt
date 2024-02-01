package com.example.pubg

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView

class Snaregen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snaregen)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
    }
    fun back(view: View){
        val b: Button = findViewById(R.id.button2)
        when(b?.id){
            R.id.button2 -> finish()
        }
    }
    fun s1 (view: View){
        val b1 : ImageView = findViewById(R.id.imageView)
        val intent : Intent = Intent(this, Shlem1::class.java)
        startActivity(intent)
    }
    fun s2 (view: View){
        val b1 : ImageView = findViewById(R.id.imageView2)
        val intent : Intent = Intent(this, Gelet1::class.java)
        startActivity(intent)
    }
    fun s3 (view: View){
        val b1 : ImageView = findViewById(R.id.imageView3)
        val intent : Intent = Intent(this, Shlem2::class.java)
        startActivity(intent)
    }
    fun s4 (view: View){
        val b1 : ImageView = findViewById(R.id.imageView4)
        val intent : Intent = Intent(this, Gelet2::class.java)
        startActivity(intent)
    }
    fun s5 (view: View){
        val b1 : ImageView = findViewById(R.id.imageView5)
        val intent : Intent = Intent(this, Shlem3::class.java)
        startActivity(intent)
    }
    fun s6 (view: View){
        val b1 : ImageView = findViewById(R.id.imageView6)
        val intent : Intent = Intent(this, Gelet3::class.java)
        startActivity(intent)
    }
}