package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class resultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
       var textview : TextView = findViewById(R.id.textView)
       var res  = getIntent().getStringExtra("res")
        textview.setText(res)
    }
}