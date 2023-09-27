import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    Random randomNumber=new Random();

    boolean Play=true;

    while(Play) {
        int computerNumber = randomNumber.nextInt(101);
        System.out.println("\nNumber Generated.");
        int playerNumber;
        int tries=0;

        while (true) {
            System.out.print("Guess a number from 0 to 100: ");
            String playerGuess = scanner.nextLine();
            boolean isValid = true;

            for (int i = 0; i <= playerGuess.length() - 1; i++) {
                if (playerGuess.charAt(i) < 48 || playerGuess.charAt(i) > 57) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                tries++;
                playerNumber = Integer.parseInt(playerGuess);
                if (playerNumber == computerNumber) {
                    System.out.print("\nCongratulations!You guessed the right number from "+ tries +" tries!");
                    break;
                } else if (playerNumber > computerNumber)
                    System.out.println("Write a lower number");
                else
                    System.out.println("Write a higher number");
            } else {
                System.out.println("Invalid input!");
            }
        }
        System.out.print("Do you want to play again? Write [Y]es: ");
        String input=scanner.nextLine();
        Play= input.equalsIgnoreCase("Y") || input.equalsIgnoreCase("Yes");
    }

    }
}
