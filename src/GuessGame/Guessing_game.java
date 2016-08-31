package GuessGame;

import java.util.Scanner;

public class Guessing_game {

    public static void GuessingGame() {
        int answer = (int) Math.floor((Math.random() * 100) + 1); //generador de numeros aleatorios en un rango de 100 iniciando desde 1
        Scanner input = new Scanner(System.in);
        int guess = 0, numGuesses;
        for (numGuesses = 1; numGuesses <= 7 || guess == answer; numGuesses++) {
            System.out.println("Adivina el numero");
            guess = input.nextInt();
            if (guess < answer) {
                System.out.println("Mas alto");
            } else if (guess > answer) {
                System.out.println("Mas bajo");
            } else {
                System.out.println("Ganaste");
                break;
            }

        }
        if (numGuesses > 7) {
            System.out.println("Perdiste");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char playAgain = 'y';
        while (playAgain == 'y') {
            GuessingGame();
            System.out.println("Quieres volver a jugar" + "  'y/n' ");
            playAgain = input.next().charAt(0);
        }
    }

}
