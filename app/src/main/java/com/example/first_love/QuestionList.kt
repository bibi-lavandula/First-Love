package com.example.first_love

object QuestionList {

    fun getQuestion(): ArrayList<Question> {

        val questionArrayList = ArrayList<Question>()

        val que000 = Question(
            "What would you say to Yuna?",
            "Study buddy? OK, what do we do?",
            "Why would I need a study buddy?",
            20,
            10,
        )

        questionArrayList.add(que000)

        val que001 = Question(
            "How would you response?",
            "Don't overreact. Jeez.",
            "It is only because you need me.",
            10,
            20,
        )

        questionArrayList.add(que001)

        val que002 = Question(
            "How would you response?",
            "This is where I belong, not in school!",
            "How did you get here? Go home!",
            10,
            20,
        )

        questionArrayList.add(que002)




        return questionArrayList

    }

}
