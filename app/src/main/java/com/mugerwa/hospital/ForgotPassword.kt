package com.mugerwa.hospital

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ForgotPassword : AppCompatActivity() {

    lateinit var  back:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)
        back=findViewById(R.id.backRecoverPassword)
        back.setOnClickListener {
            val intent= Intent(this,LoginActivity2::class.java)
            startActivity(intent)
            finish()
        }
    }
}