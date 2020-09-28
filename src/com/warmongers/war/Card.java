package com.warmongers.war;

public enum Card {

    TWO_SPADES(2),
    THREE_SPADES(3),
    FOUR_SPADES(4),
    FIVE_SPADES(5),
    SIX_SPADES(6),
    SEVEN_SPADES(7),
    EIGHT_SPADES(8),
    NINE_SPADES(9),
    TEN_SPADES(10),
    JACK_SPADES(11),
    QUEEN_SPADES(12),
    KING_SPADES(13),
    ACE_SPADES(14),
    TWO_HEARTS(2),
    THREE_HEARTS(3),
    FOUR_HEARTS(4),
    FIVE_HEARTS(5),
    SIX_HEARTS(6),
    SEVEN_HEARTS(7),
    EIGHT_HEARTS(8),
    NINE_HEARTS(9),
    TEN_HEARTS(10),
    JACK_HEARTS(11),
    QUEEN_HEARTS(12),
    KING_HEARTS(13),
    ACE_HEARTS(14),
    TWO_CLUBS(2),
    THREE_CLUBS(3),
    FOUR_CLUBS(4),
    FIVE_CLUBS(5),
    SIX_CLUBS(6),
    SEVEN_CLUBS(7),
    EIGHT_CLUBS(8),
    NINE_CLUBS(9),
    TEN_CLUBS(10),
    JACK_CLUBS(11),
    QUEEN_CLUBS(12),
    KING_CLUBS(13),
    ACE_CLUBS(14),
    TWO_DIAMONDS(2),
    THREE_DIAMONDS(3),
    FOUR_DIAMONDS(4),
    FIVE_DIAMONDS(5),
    SIX_DIAMONDS(6),
    SEVEN_DIAMONDS(7),
    EIGHT_DIAMONDS(8),
    NINE_DIAMONDS(9),
    TEN_DIAMONDS(10),
    JACK_DIAMONDS(11),
    QUEEN_DIAMONDS(12),
    KING_DIAMONDS(13),
    ACE_DIAMONDS(14);


    //variables
    private int value;


    // ctor
    private Card(int value){
        this.value = value;
    }


    //getter/accessor
    public int getValue() {
        return this.value;
    }
}