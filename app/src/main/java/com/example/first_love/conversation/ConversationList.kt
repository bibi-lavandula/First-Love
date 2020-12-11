package com.example.first_love.conversation

import com.example.first_love.R

object ConversationList {

    fun getConversation() : ArrayList<Conversation>{

        val conversationList = ArrayList<Conversation>()

        val intro = Conversation (
            R.drawable.school_front_scene,
            R.drawable.blank,
            "Me: It is my first day to school, after a month suspended from school."
        )
        conversationList.add(intro)

        val chap001 = Conversation(
            R.drawable.classroom_scene,
            R.drawable.normal,
            "Yuna: Hello, my name is Yuna Mizuki. I am your study buddy for this term."
        )
        conversationList.add(chap001)

        val chap002 = Conversation(
            R.drawable.library_scene,
            R.drawable.haha,
            "Yuna: I am glad that you show up! Let's get started with the revision."
        )
        conversationList.add(chap002)


        val chap003 = Conversation(
            R.drawable.arcade_scene,
            R.drawable.serious,
            "Yuna: What are you doing at game arcade! You should be at the library!"
        )
        conversationList.add(chap003)


        val chap004 = Conversation(
            R.drawable.classroom_scene,
            R.drawable.ahhh,
            "Yuna: I know I have caused you trouble with study. But will you continue for the rest of the term?"
        )
        conversationList.add(chap004)

        val chap005 = Conversation(
            R.drawable.corridor_scene,
            R.drawable.cry,
            "Yuna: I am sorry, but would you help me? I lost the class fund."
        )
        conversationList.add(chap005)


        val chap006 = Conversation(
            R.drawable.school_front_scene,
            R.drawable.emotionless,
            "Yuna: Today I will not let you leave school. Let's help each other out for once."
        )
        conversationList.add(chap006)

        val chap007 = Conversation(
            R.drawable.corridor_scene,
            R.drawable.haha,
            "Yuna: Thank you for yesterday. Will you help me by staying for after-school revision then?"
        )
        conversationList.add(chap007)


        return conversationList
    }
}