package com.company;

import java.util.ArrayList;

public class Quiz extends QuestionBank {

    QuestionBank qb = new QuestionBank();
    private ArrayList<QuizQuestion> quiz = new ArrayList<>();
    private ScoreKeeper score = new ScoreKeeper();




public void createAQuiz() {

     qb.addQuestions();
     
    System.out.println(qb.getOneQuestion());


}


}
