package com.rajiv.deckOfCards;

public enum Suit {

    SPADE (0), HEART (1), DIAMOND (2), CLUB (3);

    private int value;

    private Suit(int v){
        this.value = v;
    }

    public int getValue(){
        return this.value;
    }

    public static Suit getSuitFromValue(int value){
        return Suit.values()[value];
    }

}
