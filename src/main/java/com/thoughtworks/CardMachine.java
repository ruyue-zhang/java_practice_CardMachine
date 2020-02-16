package com.thoughtworks;


import java.util.Scanner;

public class CardMachine {

    public int getInput() {
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
}

