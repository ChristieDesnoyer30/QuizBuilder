package com.company;

import java.util.ArrayList;

public class QuestionBank {

   private ArrayList<QuizQuestion> questionBank = new ArrayList<>();
   private ArrayList<QuizQuestion> temp = new ArrayList<>();


    public ArrayList<QuizQuestion> addQuestions(){

        questionBank.add(new QuizQuestion("Who painted the ceiling of the Sistine Chapel?", "Michelangelo"));
        questionBank.add(new QuizQuestion("In which city did Romeo and Juliet live?", "Verona"));
        questionBank.add(new QuizQuestion("What is the culinary term for cutting food into long thin strips?", "Julienne"));
        questionBank.add(new QuizQuestion("Video sharing website YouTube debuted in which year?", "2005"));
        questionBank.add(new QuizQuestion("In which US state is 'Area 51' located?", "Nevada"));
        questionBank.add(new QuizQuestion("Which female pop culture icon has been all the following: dentist, doctor, firefighter, astronaut, paleontologist, and US Presidential candidate?"
                , "Barbie"));
        questionBank.add(new QuizQuestion("What sea creature has three hearts?"
                , "Octopus"));
        questionBank.add(new QuizQuestion("Which group recorded the original of “Light My Fire”?"
                , "The Doors"));
        questionBank.add(new QuizQuestion("A word, phrase, or sequence that reads the same backwards as forwards is known as a what?"
                , "Palindrome"));

        return questionBank;

    }


    public QuizQuestion getOneQuestion(){

        int randomIndex = (int) (Math.random() * getQuestionsBankSize());

        QuizQuestion q = new QuizQuestion(questionBank.get(randomIndex).getQuizQuestion(),  questionBank.get(randomIndex).getQuizAnswer());

        questionBank.remove(randomIndex);

       return q;
    }


public void removeQuestion(int randomIndex){

    questionBank.remove(getOneQuestion());

}

    public int getQuestionsBankSize(){

        return questionBank.size();
    }




}
