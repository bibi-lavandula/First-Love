package com.example.first_love

data class Question (
    val question: String,
    val image: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val scoreOne: Int,
    val scoreTwo: Int,
    val scoreThree: Int
)