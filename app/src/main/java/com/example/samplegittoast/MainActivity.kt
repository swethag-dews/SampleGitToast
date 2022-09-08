package com.example.samplegittoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick = findViewById<Button>(R.id.buttonClick)

        btnClick.setOnClickListener {
            Toast.makeText(this, "Button Clicked!!", Toast.LENGTH_LONG).show()
        }
    }
}