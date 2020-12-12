package com.rajiv.deckOfCards;

import java.util.ArrayList;
import java.util.Random;

public class Deck <T extends Card> {

    private ArrayList<T> cards;
    private int dealtIndex = 0;

    public void setDeckOfCards(ArrayList<T> deckOfCards){
        cards = deckOfCards;
    }

    public void shuffle(){
        Random random = new Random();
        for (int i = 0; i < cards.size(); i++) {
            int j = random.nextInt(cards.size() - 1);
            T card1 = cards.get(i);
            T card2 = cards.get(j);
            cards.set(i, card2);
            cards.set(j, card1);
        }
    }

    public int remainingCards(){
        return cards.size() - dealtIndex;
    }

    public T[] dealHand(int number){
        if (remainingCards() < number) {
            return null;
        }

        T[] hand = (T[]) new Card[number];
        int count = 0;
        while (count < number) {
            T card = dealCard();
            if (card != null) {
                hand[count] = card;
                count++;
            }
        }

        return hand;
    }

    public T dealCard(){
        if (remainingCards() == 0) {
            return null;
        }

        T card = cards.get(dealtIndex);
        card.markUnavailable();
        dealtIndex++;

        return card;
    }

}
