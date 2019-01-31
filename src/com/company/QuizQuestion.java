package com.company;

public class QuizQuestion {

    private String quizQuestion;
    private String quizAnswer;

    public QuizQuestion() {
    }

    public QuizQuestion(String quizQuestion, String quizAnswer) {
        this.quizQuestion = quizQuestion;
        this.quizAnswer = quizAnswer;
    }

    public QuizQuestion(String quizQuestion){

        this.quizQuestion = quizQuestion;
    }

    public String getQuizQuestion() {
        return quizQuestion;
    }

    public void setQuizQuestion(String quizQuestion) {
        this.quizQuestion = quizQuestion;
    }

    public String getQuizAnswer() {
        return quizAnswer;
    }

    public void setQuizAnswer(String quizAnswer) {
        this.quizAnswer = quizAnswer;
    }

    @Override
    public String toString() {
        return "QuizQuestion{" +
                "quizQuestion='" + quizQuestion + '\'' +
                ", quizAnswer='" + quizAnswer + '\'' +
                '}';
    }
}
