package com.example.vortex_baru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class Login : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnlogin: Button = findViewById(R.id.llogin)
        btnlogin.setOnClickListener(this)

        val lupasandi: TextView = findViewById(R.id.textView2)
        lupasandi.setOnClickListener(this)

        val back : ImageButton = findViewById(R.id.backbutton)
        back.setOnClickListener(this)

        val lregis : TextView = findViewById(R.id.lregis)
        lregis.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.llogin ->{
                val intent = Intent(this@Login, MainActivity::class.java)
                startActivity(intent)
            }
            R.id.textView2 ->{
                val intent = Intent(this@Login, Lupa_sandi::class.java)
                startActivity(intent)
            }
            R.id.backbutton ->{
                val intent = Intent(this@Login, Welcome_Screen::class.java)
                startActivity(intent)
            }
            R.id.lregis ->{
                val intent = Intent(this@Login, Register::class.java)
                startActivity(intent)
            }
        }
    }
}