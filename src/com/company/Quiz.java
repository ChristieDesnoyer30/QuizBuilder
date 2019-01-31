package com.company;

import java.util.ArrayList;

public class Quiz {

    QuestionBank qb = new QuestionBank();

    private ArrayList<QuizQuestion> quiz = new ArrayList<>(qb.addQuestions());


    private ScoreKeeper score = new ScoreKeeper();


    public void createAQuiz() {


        for (int i = 1; i <= qb.getQuestionsBankSize(); i++) {


            System.out.println(qb.getOneQuestion().getQuizQuestion());




        }


    }



}
