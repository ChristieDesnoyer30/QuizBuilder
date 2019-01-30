package com.company;

import java.util.ArrayList;

public class QuestionBank {

   private ArrayList<QuizQuestion> questionBank = new ArrayList<>();

    public void addQuestions(){

        questionBank.add(new QuizQuestion("Who painted the ceiling of the Sistine Chapel?", "Michelangelo"));
        questionBank.add(new QuizQuestion("In which city did Romeo and Juliet live?", "Verona"));
        questionBank.add(new QuizQuestion("What is the culinary term for cutting food into long thin strips?", "Julienne"));
        questionBank.add(new QuizQuestion("Video sharing website YouTube debuted in which year?", "2005"));
        questionBank.add(new QuizQuestion("In which US state is 'Area 51' located?", "Nevada"));
        questionBank.add(new QuizQuestion("Which female pop culture icon has been all the following: dentist, doctor, firefighter, astronaut, paleontologist, and US Presidential candidate?"
                , "Barbie"));






    }


}
