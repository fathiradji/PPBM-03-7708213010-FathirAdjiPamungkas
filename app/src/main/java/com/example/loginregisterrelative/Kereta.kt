package com.example.loginregisterrelative

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Kereta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kereta)

        val buttonClick = findViewById<Button>(R.id.kembali)
        buttonClick.setOnClickListener(View.OnClickListener
        {

            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
            finish()

        })
    }
}