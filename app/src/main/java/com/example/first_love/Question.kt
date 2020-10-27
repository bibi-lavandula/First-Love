package com.example.first_love

data class Question (
    var statement: String = "",
    val optionOne: String = "",
    val optionTwo: String = "",
    val scoreOne: Int = 0,
    val scoreTwo: Int = 0,
)
