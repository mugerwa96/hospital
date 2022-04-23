
package com.mugerwa.hospital

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class LoginActivity2 : AppCompatActivity() {
   private  lateinit var signuplink: TextView
    private lateinit var  loginButton:Button
    private  lateinit var  forgotPassword:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login2)

        signuplink=findViewById(R.id.signuplink)
        loginButton=findViewById(R.id.loginBtn)
        forgotPassword=findViewById(R.id.forgotPassword)
        //        login button click
        loginButton.setOnClickListener {
            val intent= Intent(this,HomeActivity::class.java)
            startActivity(intent)
            finish()
        }
        //        login button click


//        forgotPassword
        forgotPassword.setOnClickListener {
            val intent= Intent(this,ForgotPassword::class.java)
            startActivity(intent)
        }

        //        signup click
        signuplink.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        //        signup click
    }
}