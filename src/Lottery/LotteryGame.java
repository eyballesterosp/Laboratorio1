package Lottery;

import java.util.Arrays;
import java.util.Scanner;

public class LotteryGame {

    static int[] NumberUser() {
        Scanner input = new Scanner(System.in);
        int[] numberUser = new int[3];
        for (int i = 0; i < numberUser.length; i++) {
            System.out.println("Introduzca la cifra # " + (i + 1) + " De su numero.");
            numberUser[i] = input.nextByte();

        }
        return numberUser;
    }

    static int[] NumberWiner() {
        int[] numberWin = new int[3];
        for (int i = 0; i < numberWin.length; i++) {
            numberWin[i] = (int) Math.floor((Math.random() * 10) + 0);
            System.out.print(numberWin[i] + " ");
        }
        return numberWin;
    }

    static void Compare(int a[], int b[]) {
        int j = 0, money = 0, k = 0;
        int count = 0, count1 = 0, count2 = 0, count3 = 0;

        boolean compare = Arrays.equals(a, b);
        //System.out.println(compare);
        while (compare == true) {
            money = 1000000;
            System.out.println("Ganaste");
            break;
        }
        while (compare == false) {
            if (a[0] == b[0]) {
                count1 = 1;
            } else if (a[0] == b[1]) {
                count1 = 1;
            } else if (a[0] == b[2]) {
                count1 = 1;
            }
            if (a[1] == b[0]) {
                count2 = 1;
            } else if (a[1] == b[1]) {
                count2 = 1;
            } else if (a[1] == b[2]) {
                count2 = 1;
            }
            if (a[2] == b[0]) {
                count3 = 1;
            } else if (a[2] == b[1]) {
                count3 = 1;
            } else if (a[2] == b[2]) {
                count3 = 1;
            }
            count = count1 + count2 + count3;
            switch (count) {
                case 1:
                    money = 10;
                    break;
                case 2:
                    money = 100;
                    break;
                case 3:
                    money = 1000;
            }
            break;

        }
        System.out.println("count" + count);
        System.out.println("Tu premio: $" + money);

    }

    static void Game() {
        Compare(NumberWiner(), NumberUser());

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char playAgain = 'y';
        while (playAgain == 'y') {
            Game();
            System.out.println("Quieres volver a jugar" + "  'y/n' ");
            playAgain = input.next().charAt(0);
        }
    }
}
