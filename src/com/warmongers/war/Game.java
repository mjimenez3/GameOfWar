package com.warmongers.war;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Stream;

public class Game {
    private static final int HIGH_LEVEL = 1;
    private static final int LOW_LEVEL = 3;


    public void displayBanner() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("warmonger_banner.txt"));
            Stream<String> lines = reader.lines();
            lines.forEach(System.out::println);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if (reader !=null) {
                try { reader.close(); }
                catch (IOException ignored) {}
            }
        }
    }

    public void setupGame(Game game) throws IOException
    {

       int mySelection = selection(game);
        try
        {
            if (mySelection >= HIGH_LEVEL && mySelection <= LOW_LEVEL)
            {
                System.out.println("Prepare for War");
                List<List<Card>> deck = splitDeck();
                List<Card> userCards = deck.get(0);
                User user = new User(userCards);
                List<Card> computerCards = deck.get(1);
                Computer computer = new Computer(computerCards);
                CardTable cardTable = new CardTable(user, computer, game);
                    cardTable.compareCards();
            }
            else
            {
                System.out.print("\nSelection out of Range " +
                        "\n\tKindly make another selection Range(" + HIGH_LEVEL + " - " + LOW_LEVEL + "): ");
                setupGame(game);
            }
        }
        catch (NumberFormatException ex)
        {
            System.out.print("\nYou have selected a non-number " +
                    "\n\tKindly make another selection Range(" + HIGH_LEVEL + " - " + LOW_LEVEL + "): ");
          setupGame(game);
        }
    }

    public int selection(Game game) {

        System.out.println("Welcome to WarMongers card game \n Press 1 and enter to declare war.");
        System.out.println("\t1.  52-Cards game ");
        //t2.  36-Cards game t3.  18-Cards game
        System.out.print("\tMake selection: ");
        char selection;
        Scanner s = new Scanner(System.in);
        selection = s.next().charAt(0);
        // System.out.println("\tYou have selected Game " + selection);
        return Integer.parseInt(String.valueOf(selection));
    }

    public List<Card> cardsToList(){
        Card[] deck = Card.values();
        List<Card> cards = new ArrayList<>();
        for(Card card : deck){
            cards.add(card);
        }
        Collections.shuffle(cards);
        return cards;
    }

   /* public List<Card> getCards(int selection){
        if(selection == 2){
            return new ArrayList<Card>(cardsToList().subList(0,36));
        }
        else if(selection == 3){
            return new ArrayList<Card>(cardsToList().subList(0,18));
        }
        return cardsToList();
    }*/

    private List<List<Card>> splitDeck(){
        List<Card> card = cardsToList();
        List<List<Card>> cards = new ArrayList<>();
        List<Card> userCard = new ArrayList<>();
        List<Card> computerCard = new ArrayList<>();
        for(int i = 0; i < card.size(); i++){
            if(i % 2 == 0){
                userCard.add(card.get(i));
            }
            if(i % 2 != 0){
                computerCard.add(card.get(i));
            }
        }
        cards.add(userCard);
        cards.add(computerCard);
        return cards;
    }
}