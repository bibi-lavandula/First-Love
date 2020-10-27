package com.example.first_love

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
            "Yuna: You make it! I am glad that you show up!"
        )

        conversationList.add(chap002)


        val chap003 = Conversation(
            R.drawable.arcade_scene,
            R.drawable.serious,
            "Yuna: What are you doing here!"
        )

        conversationList.add(chap003)


        val chap004 = Conversation(
            R.drawable.corridor_scene,
            R.drawable.cry,
            "Yuna: I lost the class fund."
        )

        conversationList.add(chap004)



        return conversationList
    }
}