package com.warmongers.war;

import java.io.IOException;
import java.util.List;

public abstract class Player {

    private int score = 0;

    public List<Card> playerCards;


    public Card flipCard() throws IOException {
        return playerCards.get(0);
    }//default= flip top card

    public int getScore() {
        return score;
    }

    public void setScore() {
        score+=1;
    }
}