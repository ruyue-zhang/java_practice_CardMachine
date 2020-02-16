package com.thoughtworks;

import java.util.ArrayList;

public class Card {
    private ArrayList<String> card;

    public Card(ArrayList<String> card) {
        this.card = card;
    }

    public ArrayList<String> getCard() {
        return card;
    }
}
