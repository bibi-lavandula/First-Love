package com.example.first_love

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.insert_name.*

class PlayerNameActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.insert_name)

        val contButton = findViewById<Button>(R.id.cont_button)
        contButton.setOnClickListener {

            if (nameTextView.text.toString().isEmpty()) {

                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()

            }
        }

    }
}