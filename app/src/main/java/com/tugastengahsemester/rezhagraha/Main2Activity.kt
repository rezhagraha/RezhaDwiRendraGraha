package com.tugastengahsemester.rezhagraha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Main2Activity : AppCompatActivity(), View.OnClickListener{
    private lateinit var btnIntent: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        btnIntent = findViewById(R.id.bakso)
        btnIntent.setOnClickListener(this)
        btnIntent = findViewById(R.id.mieayam)
        btnIntent.setOnClickListener(this)
        btnIntent = findViewById(R.id.nasigoreng)
        btnIntent.setOnClickListener(this)
        btnIntent = findViewById(R.id.sateayam)
        btnIntent.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when(v.id){
            R.id.bakso ->{
                val bakso = Intent(this@Main2Activity, NameBakso::class.java)
                startActivity(bakso)
            }
        }
        when(v.id){
            R.id.mieayam ->{
                val mieayam = Intent(this@Main2Activity, NameMieAyam::class.java)
                startActivity(mieayam)
            }
        }
        when(v.id){
            R.id.nasigoreng ->{
                val nasigoreng = Intent(this@Main2Activity, NameNasiGoreng::class.java)
                startActivity(nasigoreng)
            }
        }
        when(v.id){
            R.id.sateayam ->{
                val sateayam = Intent(this@Main2Activity, NameSateAyam::class.java)
                startActivity(sateayam)
            }
        }
    }
}