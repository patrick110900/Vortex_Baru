package com.example.vortex_baru

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Welcome_Screen : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_screen)

        val wbtl:Button = findViewById(R.id.Wloginbt)
        wbtl.setOnClickListener(this)

        val wbtr: Button = findViewById(R.id.wrRegisbt)
        wbtr.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.Wloginbt ->{
                val intent = Intent(this@Welcome_Screen, Login::class.java)
                startActivity(intent)
            }
            R.id.wrRegisbt ->{
                val intent = Intent(this@Welcome_Screen, Register::class.java)
                startActivity(intent)
            }
        }
    }
}