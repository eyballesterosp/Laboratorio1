package DiceGame;

import java.util.Scanner;

public class DiceGame {

    static int dadosPc() {
        int dado1 = (int) Math.floor((Math.random() * 6) + 1);
        int dado2 = (int) Math.floor((Math.random() * 6) + 1);
        //System.out.println("Dado 1: " + dado1 + " " + "Dado 2: " + dado2);
        int Pc = dado1 + dado2;
        return Pc;
    }

    static int dadosJugador1() {
        int player = 0;
        int dado1 = (int) Math.floor((Math.random() * 6) + 1);
        int dado2 = (int) Math.floor((Math.random() * 6) + 1);
        int Player = dado1 + dado2;
        //System.out.println("Su puntaje es: " + dado1 + "  " + dado2);

        return Player;
    }

    static void Game() {

        Scanner input = new Scanner(System.in);
        int PuntajePc = 0, PuntajePlayer = 0;
        char playAgain = 'y';
        while (playAgain == 'y') {
            while (PuntajePc < 100 && PuntajePlayer < 100) {
                int b = dadosJugador1();
                if (b < 2) {
                    b = dadosJugador1();
                } else {
                    PuntajePlayer = PuntajePlayer + b;
                }
                int a = dadosPc();
                if (a < 2) {
                    a = dadosPc();

                } else {
                    PuntajePc = PuntajePc + a;
                }
            }
            System.out.println("Quieres tirar" + "  'y/n' ");
            playAgain = input.next().charAt(0);
        }
        if (PuntajePc <= PuntajePlayer) {
            System.out.println("Ganasate");
        } else {
            System.out.println("Perdiste");
        }
        System.out.println("\n  PC \t\t Player");
        System.out.println(" " + PuntajePc + "\t\t  " + PuntajePlayer);

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
/*
Create the logic for the dice game Pig. in which a player can
compete with the computer. The object of the game is to be
the ﬁrst to score 100 points. The user and computer take
turns “rolling” a pair of dice following these rules:

o On a turn. each player rolls two dice. If no 1 appears, the
dice values are added to a running total for the turn, and
the player can choose whether to roll again or pass the turn
to the other player. When a player passes, the accumulated
turn total is added to the player's game total.

o [fa 1 appears on one of the dice, the player’s tum total
becomes 0; in other words. nothing more is added to the
player's game total for that turn, and it becomes the other
player‘s turn.

- If a 1 appears on both of the dice, not only is the player's
turn over, but the player’s entire accumulated total is reset
to 0.

o When the computer does not roll a l and can choose
whether to roll again, generate a random value from 1 to 2.
The computer will then decide to continue when the value
is 1 and decide to quit and pass the turn to the player when
the value is not 1.*/
