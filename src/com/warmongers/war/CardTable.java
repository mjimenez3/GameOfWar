package com.warmongers.war;

import java.io.IOException;
import java.util.Scanner;

public class CardTable {

    Player player1;
    Player player2;
    Game game;


    public CardTable(Player player1, Player player2, Game game) {
        this.player1 = player1;
        this.player2 = player2;
        this.game = game;
    }

   public void displayScore() {
       System.out.println("Score is: Computer - " + player2.getScore() + ", User - " + player1.getScore() + ".");
       System.out.println("");
   }

    public void compareCards() throws IOException {
        if (player1.playerCards.size() == 0 || player2.playerCards.size() == 0) {
            System.out.println("Game Over");
            determineWinner();
            endGame();
        }
        else {
            Card userCard = player1.flipCard();
            Card computerCard = player2.flipCard();
            System.out.println("User flipped: "+ userCard);
            System.out.println("Computer flipped: " + computerCard);
            int userCardValue = userCard.getValue();
            int computerCardValue = computerCard.getValue();
            if (userCardValue == computerCardValue) {
                System.out.println("You tied!");
                player1.playerCards.remove(userCard);
                player2.playerCards.remove(computerCard);
            } else if (userCardValue > computerCardValue) {
                System.out.println("User won the battle!");
                player1.setScore();
            } else {
                System.out.println("Computer won the battle!");
                player2.setScore();
            }
            player1.playerCards.remove(userCard);
            player2.playerCards.remove(computerCard);
            displayScore();
            compareCards();
        }
    }

    public void determineWinner() {
        if (player1.getScore() == player2.getScore()) {
            System.out.println("You are both warmongers");
        }
       else if (player1.getScore() > player2.getScore()) {
           System.out.println("User is the warmonger");
       }
       else {
           System.out.println("Computer is a warmonger");
           }
       }

    public void endGame() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Would you like to Play Again?  Type Y and Enter");
            String answer = input.nextLine();
            if (answer.equals("Y") || answer.equals("y")) {
                Game newGame = new Game();
                newGame.setupGame(newGame);
            }
            else{
                System.out.println("When you have gathered up your armies, challenge me again!");
                System.exit(0);
            }
    }
}