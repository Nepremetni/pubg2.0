package com.example.pubg

import android.content.Intent
import android.content.pm.ActivityInfo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageButton
import android.widget.Switch
import android.widget.TextView
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
    }
    fun Click1 (view: View){
        val b1 : ImageButton = findViewById(R.id.imageButton)
        val intent : Intent = Intent(this, gans::class.java)
        startActivity(intent)
    }
    fun Theme(view: View) {
        val sw: Switch = findViewById(R.id.switch1)
        if (sw.isChecked) AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
        else AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
    }
    fun programm(view: View){
        val bb1 : ImageButton = findViewById(R.id.imageButton)
        val intent: Intent = Intent(this, Programm::class.java)
        startActivity(intent)
    }
    fun Click2 (view: View){
        val b1 : ImageButton = findViewById(R.id.imageButton2)
        val intent : Intent = Intent(this, Snaregen::class.java)
        startActivity(intent)
    }
    fun Click3 (view: View){
        val b1 : ImageButton = findViewById(R.id.imageButton3)
        val intent : Intent = Intent(this, Predmeti::class.java)
        startActivity(intent)
    }
    fun Click4 (view: View){
        val b1 : ImageButton = findViewById(R.id.imageButton4)
        val intent : Intent = Intent(this, Transport::class.java)
        startActivity(intent)
    }
    fun pubg (view: View){
        val t: TextView = findViewById(R.id.textView25)
        val intent : Intent = Intent(this, Pubg::class.java)
        startActivity(intent)
    }
}


