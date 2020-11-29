package com.example.first_love.question

import androidx.room.*
import com.example.first_love.question.Question

@Dao
interface QuestionDao {

    @Insert
    suspend fun insert (question: Question)

    @Query("SELECT * FROM question_table")
    suspend fun getAll(): List<Question>

    @Delete
    suspend fun delete (question: Question)

    @Update
    suspend fun update (question: Question)

}