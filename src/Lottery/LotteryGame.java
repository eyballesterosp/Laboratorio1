package Lottery;

import java.util.Scanner;

public class LotteryGame {

    static void NumberUser() {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        int[] numberUser = new int[3];
        System.out.println("Introduzca su numero cifra por cifra ");
        for (int i = 0; i < numberUser.length; i++) {
            numberUser[i] = input.nextByte();

        }
        /*System.out.println("#1");
        a = input.nextInt();
        System.out.println("#2");
        b = input.nextInt();
        System.out.println("#3");
        c = input.nextInt();*/
    }

    static void NumberWiner() {
        int[] numberWin = new int[3];
        for (int i = 0; i < numberWin.length; i++) {
            numberWin[i] = (int) Math.floor((Math.random() * 10) + 0);
            System.out.print(numberWin[i] + " ");
        }
    }

    public static void main(String[] args) {
        NumberUser();
        NumberWiner();

    }

}
