package com.tugastengahsemester.rezhagraha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class NameNasiGoreng : AppCompatActivity(), View.OnClickListener{
    private lateinit var btnIntent: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nasigoreng)

        btnIntent = findViewById(R.id.back3)
        btnIntent.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when(v.id){
            R.id.back3 ->{
                val back3 = Intent(this@NameNasiGoreng, Main2Activity::class.java)
                startActivity(back3)
            }
        }
    }
}