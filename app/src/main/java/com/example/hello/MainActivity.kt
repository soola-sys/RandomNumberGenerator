package com.example.hello

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button: Button = findViewById(R.id.button)
        var editTextNum : EditText = findViewById(R.id.editTextNumber)
        var editTextNum2 : EditText =  findViewById(R.id.editTextNumber2)

        button.setOnClickListener {
            // Handler code here.
            var result: Int = Random().nextInt(editTextNum2.text.toString().toInt() - editTextNum.text.toString().toInt() + 1) + editTextNum.text.toString().toInt()
            val intent = Intent(this, resultActivity::class.java)
            intent.putExtra("res",result.toString())
            startActivity(intent)
        }
    }

}