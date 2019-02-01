package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz extends QuizQuestion {

    QuestionBank qb = new QuestionBank();
    QuizQuestion newQuestion = new QuizQuestion();

    private ArrayList<QuizQuestion> quiz = new ArrayList<>(qb.addQuestions());


    private ScoreKeeper score = new ScoreKeeper();

    public void restartQuiz(){

        qb.addQuestions();
    }


    public void createAQuiz() {

        System.out.println("There are " + qb.getQuestionsBankSize() + " questions in the bank.");


        promptQuestions();

        keepScore();

        //might think about taking this out,
        //was thinking I would reset the score each time they want to restart the quiz
        //it may might more sense to keep it rolling.
        score.setScore(0);



    }

    private void keepScore() {
        if(score.getScore() == 5){
            System.out.println("You got a perfect score of 5!");


        } else{

            System.out.println( "Your score is " + score.getScore());
        }
    }

    private void promptQuestions() {

        Scanner scan = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {

            newQuestion = qb.getOneQuestion();

            System.out.println(newQuestion.getQuizQuestion());

            System.out.println( "Please enter your answer");

            String userAnswer = scan.nextLine();

            checkAnswer(userAnswer);

        }
    }

    private void checkAnswer(String userAnswer) {

        if(userAnswer.equalsIgnoreCase(newQuestion.getQuizAnswer())){

            System.out.println( "Answer is correct ");

            score.inCreaseScore();

            System.out.println("Your current score is " + score.getScore());

        } else{
            System.out.println( "Answer is NOT correct ");

            score.decreaseScore();

            System.out.println("Your current score is " + score.getScore());

        }
    }


}
