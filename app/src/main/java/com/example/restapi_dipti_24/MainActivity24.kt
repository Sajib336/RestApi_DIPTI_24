package com.example.restapi_dipti_24

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class MainActivity24 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main24)
        Handler(Looper.getMainLooper()).postDelayed({
            startActivity(Intent(this@MainActivity24,ProductActivity24::class.java))
            finish()
        }, 2500)
    }
}