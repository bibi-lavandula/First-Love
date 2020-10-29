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
    lateinit var endHeading: TextView
    lateinit var imageDisplay: ImageView
    lateinit var nextButton: Button
    lateinit var opOneButton: Button
    lateinit var opTwoButton: Button

    val conversationList = ConversationList.getConversation()
    var click = 0
    val questionList = QuestionList.getQuestion()
    var nextQuestion = 0
    var conversation = 0
    var score1 = 0
    var score2 = 0
    var score3 = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.game_screen)

        //val playerName = intent.getStringExtra("Player Name")

        imageDisplay = findViewById(R.id.mImageView)
        textDisplay = findViewById(R.id.conversationTextView)
        nextButton = findViewById(R.id.nextButton)
        opOneButton = findViewById(R.id.op_OneButton)
        opTwoButton = findViewById(R.id.op_TwoButton)


        loadConversation(0) //click == 0


        nextButton.setOnClickListener {

            click++

            if (click== 1){
                loadConversation(1)
            }
            else if(click==2){
                loadQuestion(0)
            }
            else if (nextQuestion==1){          //click == 3
                    loadQuestion(1)
                    conversation = 2
            }
            else if (nextQuestion==2){          //click == 3
                    loadQuestion(2)
                    conversation = 3
            }
            else if (nextQuestion==3){      //click 4
                loadQuestion(3)
                conversation = 4 or 5
            }
            else if (nextQuestion==4){      // click 4
                loadQuestion(4)
                conversation = 6 or 7
            }
        }


        opOneButton.setOnClickListener{
            if(click == 2){ //que000
                loadConversation(2)
                score1 = 20
                nextQuestion = 1
            }

            else if(click == 3 && conversation == 2){ //que001
                loadConversation(4)
                score2 = 10
                nextQuestion = 3
            }

            else if(click == 3 && conversation == 3){ //que002
                loadConversation(6)
                score2 = 10
                nextQuestion = 4
            }

            else if(click == 4 && conversation == 4 || conversation == 5){ //que003
                score3 = 20
                loadScore()
            }

            else if(click == 4 && conversation == 6 || conversation == 7){ //que004
                score3 = 10
                loadScore()
            }
        }

        opTwoButton.setOnClickListener{
            if(click == 2){ //que000
                loadConversation(3)
                score1 = 10
                nextQuestion = 2
            }

            else if(click == 3 && conversation == 2) {//que001
                loadConversation(5)
                score2 = 10
                nextQuestion = 3
            }

            else if(click == 3 && conversation == 3){ //que002
                loadConversation(7)
                score2 = 20
                nextQuestion = 4
            }

            else if(click == 4 && conversation == 4 || conversation == 5){ //que003
                score3 = 10
                loadScore()
            }

            else if(click == 4 && conversation == 6 || conversation == 7){ //que004
                score3 = 20
                loadScore()
            }

        }

    }


    fun loadConversation(conversation: Int) {

        nextButton.visibility = View.VISIBLE
        toggleVisibility()

        val conversation = conversationList[conversation]

        textDisplay.text = conversation.statement
        gameConstraintLayout.setBackgroundResource(conversation.background)
        imageDisplay.setImageResource(conversation.image)

        return
    }

    fun loadQuestion(question: Int) {

        nextButton.visibility = View.INVISIBLE
        toggleVisibility()

        val question = questionList[question]

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

    fun loadScore() {
        var totalScore = score1 + score2 + score3
        endHeading = findViewById(R.id.finalHeading)


        if (totalScore >= 40){
            opOneButton.visibility = View.INVISIBLE
            opTwoButton.visibility = View.INVISIBLE
            endHeading.visibility = View.VISIBLE
            endHeading.text = "Congratulations!"
            textDisplay.text= "It has been a great 4 months as study buddy, for both Yuna and you. You finally tell Yuna how you feel about her and she said, yes."
            gameConstraintLayout.setBackgroundResource(R.drawable.first_background)
            imageDisplay.setImageResource(R.drawable.hahaha)
        } else {
            opOneButton.visibility = View.INVISIBLE
            opTwoButton.visibility = View.INVISIBLE
            endHeading.visibility = View.VISIBLE
            endHeading.text = "Too bad..."
            textDisplay.text= "It has been a long 4 months as study buddy, for both Yuna and you You finally tell Yuna how you feel about her and she rejected."
            gameConstraintLayout.setBackgroundResource(R.drawable.blue)
            imageDisplay.setImageResource(R.drawable.emotionless)
        }



    }



}