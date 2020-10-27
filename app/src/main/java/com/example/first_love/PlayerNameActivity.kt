package com.example.first_love

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.insert_name.*

class PlayerNameActivity : AppCompatActivity() {

    lateinit var nameTextView: EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.insert_name)

        nameTextView = findViewById(R.id.nameTextEdt)

        val readyButton = findViewById<Button>(R.id.ready_button)


        readyButton.setOnClickListener {

            if (nameTextView.text.toString().isEmpty()) {

                Toast.makeText(this, "Please enter your name", Toast.LENGTH_SHORT).show()

            } else {
                val intent= (Intent(this, GameActivity::class.java))

                intent.putExtra("Player Name", nameTextView.text.toString())

                startActivity(intent)
                finish()
            }

        }
    }

}