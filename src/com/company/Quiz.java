package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {

    QuestionBank qb = new QuestionBank();

    private ArrayList<QuizQuestion> quiz = new ArrayList<>(qb.addQuestions());


    private ScoreKeeper score = new ScoreKeeper();


    public void createAQuiz() {
    Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= qb.getQuestionsBankSize(); i++) {

            QuizQuestion newQuestion = new QuizQuestion();

            newQuestion = qb.getOneQuestion();

            System.out.println(newQuestion.getQuizQuestion());

            System.out.println( "Please enter your answer");

            String userAnswer = scan.nextLine();

            if(userAnswer.equalsIgnoreCase(newQuestion.getQuizAnswer())){

                System.out.println( "Answer is correct ");

                score.inCreaseScore();

                System.out.println("Your current score is" + score.getScore());

            } else{
                System.out.println( "Answer is NOT correct ");
                score.decreaseScore();
                System.out.println("Your current score is" + score.getScore());

            }

        }

        if(score.getScore() == 5){
            System.out.println("You got a perfect score of 5!");


        } else{

            System.out.println( "Your score is " + score.getScore());
        }

        score.setScore(0);

        quiz.add(new QuizQuestion(qb.getOneQuestion().getQuizQuestion()));

    }





}
