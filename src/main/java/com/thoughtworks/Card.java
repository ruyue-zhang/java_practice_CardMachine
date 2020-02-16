package com.thoughtworks;

import java.util.ArrayList;

public class Card {
    private ArrayList<String> card = new ArrayList<>();

    public Card(ArrayList<String> card) {
        this.card = card;
    }

    public ArrayList<String> getCard() {
        return card;
    }

    public void setCard(ArrayList<String> card) {
        this.card = card;
    }
}
