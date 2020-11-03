package com.tugastengahsemester.rezhagraha

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class NameBakso : AppCompatActivity(), View.OnClickListener{
    private lateinit var btnIntent: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bakso)

        btnIntent = findViewById(R.id.back1)
        btnIntent.setOnClickListener(this)
    }
    override fun onClick(v: View) {
        when(v.id){
            R.id.back1 ->{
                val back1 = Intent(this@NameBakso, Main2Activity::class.java)
                startActivity(back1)
            }
        }
    }
}
