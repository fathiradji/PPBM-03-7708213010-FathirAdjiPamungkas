package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class About : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)

        val buttonClick = findViewById<Button>(R.id.balik)
        buttonClick.setOnClickListener(View.OnClickListener {

            val intent = Intent(this,Menu ::class.java)
            startActivity(intent)
            finish()


        })

        val buttonClick1 = findViewById<Button>(R.id.logout)
        buttonClick1.setOnClickListener(View.OnClickListener {

            val intent1 = Intent(this,MainActivity ::class.java)
            startActivity(intent1)
            finish()


        })
    }
}