package com.rajiv.deckOfCards;

public abstract class Card {

    private Boolean available = true;

    protected Integer faceValue;
    private Suit suit;

    public Card(Integer fv, Suit s){
        this.faceValue = fv;
        this.suit = s;
    }

    public abstract int value();
    public Suit suit(){
        return suit;
    }

    public Boolean isAvailable() {return available;}
    public void markUnavailable() {this.available = false;}
    public void markAvailable() {this.available = true;}

}
