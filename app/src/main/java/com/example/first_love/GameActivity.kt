package com.example.first_love

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.game_screen.*

class GameActivity : AppCompatActivity() {

    lateinit var textDisplay: TextView
    lateinit var imageDisplay: ImageView
    lateinit var nextButton: Button
    lateinit var opOneButton: Button
    lateinit var opTwoButton: Button

    val conversationList = ConversationList.getConversation()
    var currentConversation = 0
    val questionList = QuestionList.getQuestion()
    var currentQuestion = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_screen)

        val playerName = intent.getStringExtra("Player Name")

        imageDisplay = findViewById(R.id.mImageView)
        textDisplay = findViewById(R.id.conversationTextView)
        nextButton = findViewById(R.id.nextButton)
        opOneButton = findViewById(R.id.op_OneButton)
        opTwoButton = findViewById(R.id.op_TwoButton)


        loadConversation()


        nextButton.setOnClickListener {

            currentConversation++

            loadConversation()

            currentQuestion++

            loadQuestion()
        }

        //loadQuestion()


        /*if (currentQuestion == 0) {
            opOneButton.setOnClickListener{
                currentConversation = 2
            }
            opTwoButton.setOnClickListener{
                currentConversation = 3
            }
        }*/


    }


    fun loadConversation() {

        nextButton.visibility = View.VISIBLE

        val conversation = conversationList[currentConversation]

        textDisplay.text = conversation.statement
        gameConstraintLayout.setBackgroundResource(conversation.background)
        imageDisplay.setImageResource(conversation.image)

        return
    }

    fun loadQuestion() {

        nextButton.visibility = View.INVISIBLE
        toggleVisibility()

        val question = questionList[currentQuestion]

        textDisplay.text = question.statement
        opOneButton.text = question.optionOne
        opTwoButton.text = question.optionTwo

        return
    }

    fun toggleVisibility() {
        if (nextButton.visibility == View.VISIBLE) {
            opOneButton.visibility = View.INVISIBLE
            opTwoButton.visibility = View.INVISIBLE
        } else {
            opOneButton.visibility = View.VISIBLE
            opTwoButton.visibility = View.VISIBLE
        }
        return
    }
}