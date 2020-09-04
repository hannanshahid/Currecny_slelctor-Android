package com.aliabbas.currecny_slelctor

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        buttoncurrecny.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
        buttonexcel.setOnClickListener {
            startActivity(Intent(this,excel::class.java))
        }
        buttondarkmode.setOnClickListener {

            AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
        }
    }
}