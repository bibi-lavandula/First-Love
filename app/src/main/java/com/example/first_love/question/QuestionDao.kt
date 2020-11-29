package com.example.first_love.question

import androidx.room.*
import com.example.first_love.question.Question

@Dao
interface QuestionDao {

    @Insert
    fun insert (question: Question)

    @Query("SELECT * FROM question_table")
    fun getAll(): List<Question>

    @Delete
    fun delete (question: Question)

    @Update
    fun update (question: Question)

}