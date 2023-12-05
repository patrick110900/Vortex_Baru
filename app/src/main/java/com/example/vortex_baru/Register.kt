package com.example.vortex_baru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class Register : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val butonregister : Button = findViewById(R.id.Rregis)
        butonregister.setOnClickListener(this)

        val imagebtn : ImageButton = findViewById(R.id.backbuttonr)
        imagebtn.setOnClickListener(this)

        val loginnbt : TextView = findViewById(R.id.lg)
        loginnbt.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id){
            R.id.Rregis ->{
                val intent = Intent(this@Register, MainActivity::class.java)
                startActivity(intent)
            }
            R.id.backbuttonr ->{
                val intent =Intent(this@Register, Welcome_Screen::class.java)
                startActivity(intent)
            }
            R.id.lg ->{
                val intent = Intent (this@Register, Login ::class.java)
                startActivity(intent)
            }
        }
    }
}