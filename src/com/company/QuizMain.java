package com.company;

import java.util.Scanner;

public class QuizMain {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean takeQuizAgain = true;
        Quiz qz = new Quiz();
        int userChoice;

        /*
         *Write a program which allows the user to build a quiz.
         *Your program should include at least (5) classes:
         *
         *++QuizQuestion. QuizQuestion should include properties to hold a question and an answer.
         *
         *++QuestionBank. QuestionBank should include hard-coded ArrayLists of questions and answers.
         *
         *++ScoreKeeper. ScoreKeeper should include a property to hold the quiz score and
         *should include methods to increase the score (if the user gets a question right) or
         *decrease the score (if the user gets a question wrong).
         *
         *++Quiz. Quiz should include properties for an ArrayList of Questions and a ScoreKeeper object.
         *
         *QuizDemo, which should assemble a Quiz with (5) randomly-selected questions
         *
         *and allow the user to take the Quiz.
         *
         * The user should be able to take a Quiz as many times as they wish.
         */


do{
        System.out.println( "Would you like to take a quiz? Press 1 to start the quiz. Press 2 to exit.");
        userChoice = scan.nextInt();

  switch(userChoice) {

      case 1:


          if(qz.qb.getQuestionsBankSize() == 0 ){

              System.out.println("Not enough questions in bank.");

              takeQuizAgain = false;

              break;
          }
          qz.createAQuiz();


          break;

      case 2:

          takeQuizAgain = false;

          break;

      default :
          System.out.println("Not a valid option!");

          break;




  }
} while(takeQuizAgain);

        System.out.println("Done");

    }
}
