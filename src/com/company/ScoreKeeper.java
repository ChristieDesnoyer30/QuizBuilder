package com.company;

public class ScoreKeeper {


   private int score;


    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public void inCreaseScore(){

        score += 1;

    }

    public void decreaseScore(){

        score -= 1;

    }

}

