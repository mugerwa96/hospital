package com.mugerwa.hospital

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var signinlink: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    signinlink=findViewById(R.id.signinlink)
        signinlink.setOnClickListener {
            val intent= Intent(this,LoginActivity2::class.java)
            startActivity(intent)
            finish()
        }
    }
}