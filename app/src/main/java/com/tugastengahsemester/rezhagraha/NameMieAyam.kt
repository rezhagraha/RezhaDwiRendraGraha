package com.tugastengahsemester.rezhagraha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class NameMieAyam : AppCompatActivity(), View.OnClickListener{
    private lateinit var btnIntent: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mieayam)

        btnIntent = findViewById(R.id.back2)
        btnIntent.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when(v.id){
            R.id.back2 ->{
                val back2 = Intent(this@NameMieAyam, Main2Activity::class.java)
                startActivity(back2)
            }
        }
    }
}