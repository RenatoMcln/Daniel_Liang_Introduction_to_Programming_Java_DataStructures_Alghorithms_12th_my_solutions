package Chapter05.CaseStudies;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = (int) (Math.random() * 101);

        System.out.println("Guess a magic number between 0 and 100");

        System.out.print("Enter your guess: ");
        double guess = input.nextDouble();

        while (number != guess) {

            if (guess < number) {
                System.out.println("Your guess is too low");
            } else {
                System.out.println("Your guess is too high");
            }

            System.out.print("Enter your guess: ");
            guess = input.nextDouble();

        }

        System.out.printf("Yes, the number is %d", number);

    }

}
