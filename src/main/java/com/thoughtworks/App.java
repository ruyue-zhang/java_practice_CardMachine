package com.thoughtworks;

import java.util.ArrayList;

public class App {

  public static void main(String[] args) {
    Card card = new Card(createCard());
    CardMachine cardMachine = new CardMachine();
    cardMachine.drawCard(card.getCard());
  }

  public static ArrayList<String> createCard() {
    String[] pattern = {"黑桃","红桃","梅花","方片"};
    String[] number = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    ArrayList<String> card = new ArrayList<>();
    for (String s : pattern) {
      for (String value : number) {
        card.add(s + value);
      }
    }
    return card;
  }
}
