package com.thoughtworks;


import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class CardMachine {

    private int getInput() {
        boolean isTrue = false;
        int n = 0;
        while(!isTrue) {
            System.out.print("请输入抽取牌的数量：");
            Scanner input = new Scanner(System.in);
            n = input.nextInt();
            if(n < 1 || n > 52) {
                System.out.println("Out of range, please enter again.");
            } else {
                isTrue = true;
            }
        }
        return n;
    }

    public ArrayList<String> drawCard(ArrayList<String> card) {
        ArrayList<String> resultCard = new ArrayList<>();
        int n = getInput();
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            int index = r.nextInt(52 - i);
            resultCard.add(card.remove(index));
        }
        return resultCard;
    }
}

