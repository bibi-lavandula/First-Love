package com.example.first_love.question

import com.example.first_love.question.Question
import com.example.first_love.question.QuestionDao

class QuestionList (private val questionArrayList: ArrayList<Question>) {

    fun addQuestion(question: Question): Question {
        questionArrayList.add(question)
        return question
    }

}

/*fun getQuestion(): ArrayList<Question> {

    val questionArrayList = ArrayList<Question>()

    val que000 = Question(
        "You know that the study buddy program will affect both your grades. What would you say to Yuna?",
        "Study buddy? OK, what do we do?",
        "Why would I need a study buddy?",
    )
    questionArrayList.add(que000)

    val que001 = Question(
        "You see Yuna's happy face as you keep your promise to meet her at the library. How would you response?",
        "Don't overreact. Jeez.",
        "It is because you need me."
    )
    questionArrayList.add(que001)

    val que002 = Question(
        "You don't expect to see Yuna here. You understand that it can be dangerous sometimes. What would you do now?",
        "Ignore her and eventually she will leave.",
        "Walk her home immediately."
    )
    questionArrayList.add(que002)

    val que003 = Question(
        "You are grateful inside that Yuna treats you equally like others and not afraid of you. What would you say?",
        "Well, I don't mind.",
        "You know I am forced to accept."
    )
    questionArrayList.add(que003)

    val que004 = Question(
        "You know that Yuna is kind-hearted but you are the infamous bad student. How would you response?",
        "Hope you will not regret later.",
        "I will, for us."
    )
    questionArrayList.add(que004)


    return questionArrayList

    }*/
