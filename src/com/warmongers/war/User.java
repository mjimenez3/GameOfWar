package com.warmongers.war;

import java.io.IOException;
import java.util.List;

public class User extends Player  {

    public User(List<Card> userCards){
        this.playerCards = userCards;
    }

    public Card flipCard() throws IOException {
        System.out.println("Press Enter to Flip a Card");
        System.in.read();
        return this.playerCards.get(0);
    }
}