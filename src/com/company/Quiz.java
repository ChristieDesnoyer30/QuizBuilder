package com.company;

import java.util.ArrayList;

public class Quiz extends QuestionBank {

    QuestionBank qb = new QuestionBank();
    private ArrayList<String> quiz = new ArrayList<>();
    private ScoreKeeper score = new ScoreKeeper();




public void createAQuiz() {

     qb.addQuestions();

     for(int i = 1; i <= 5; i++) {

         quiz.add(qb.getOneQuestion());

     }

}

public void displayQuiz(){

    for(String questions : quiz){


        System.out.println(questions);
    }

}

}
