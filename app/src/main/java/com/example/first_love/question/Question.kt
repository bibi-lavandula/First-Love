package com.example.first_love.question

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "question_table")
data class Question (
    @ColumnInfo(name = "statement")
    var statement: String = "",
    @ColumnInfo(name = "option1")
    val optionOne: String = "",
    @ColumnInfo(name = "option2")
    val optionTwo: String = "",
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null
)


