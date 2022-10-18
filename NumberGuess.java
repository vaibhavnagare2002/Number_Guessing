package company11;

import java.util.Scanner;
import java.util.Random;

class NumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = (new Random()).nextInt(100) + 1, guess = 0;

        System.out.println("Guess a number between 1 and 100");

        while (guess != number) {
            System.out.print("Enter the Number : ");
            guess = scanner.nextInt();

            if (guess < number) {
                System.out.println("Your number is smaller than actual number");
                System.out.println("");
            }
            else if (guess > number) {
                System.out.println("Your number is greater than actual number");
                System.out.println("");
            }
        }
        System.out.println("Congratulations!,You Guess a Correct Number "+number);
    }
}