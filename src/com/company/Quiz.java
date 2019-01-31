package com.company;

import java.util.ArrayList;

public class Quiz {


    QuestionBank qb = new QuestionBank();
    private ArrayList<QuizQuestion> quiz = new ArrayList<>(qb.);
    private ScoreKeeper score = new ScoreKeeper();


    public void createQuiz(){

            qb.addQuestions();

       }


    }


}
