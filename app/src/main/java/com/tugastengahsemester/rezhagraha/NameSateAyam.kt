package com.tugastengahsemester.rezhagraha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class NameSateAyam : AppCompatActivity(), View.OnClickListener{
    private lateinit var btnIntent: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sateayam)

        btnIntent = findViewById(R.id.back4)
        btnIntent.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when(v.id){
            R.id.back4 ->{
                val back4 = Intent(this@NameSateAyam, Main2Activity::class.java)
                startActivity(back4)
            }
        }
    }
}