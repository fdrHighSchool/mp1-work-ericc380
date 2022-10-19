import java.util.Scanner;
import java.util.Random;

public class rng2
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        System.out.println("What mode do you want?\nEasy\nMedium\nHard");
        String mode = s.nextLine();

        int maximum;
        int minimum;
        if(mode.equals("Easy")) {
          maximum = 10;
          minimum = 1;
        } // end if statement
        else if (mode.equals("Medium")) {
          maximum = 50;
          minimum=1;
        
        } // end else if statement
        else {
          maximum = 100;
          minimum=1;
        } // end else statement
        
        int mysteryNumber = r.nextInt(maximum-minimum) + 1; // place-holder for now
        System.out.println(mysteryNumber);
        int playerGuess = 0;
        
        while(playerGuess != mysteryNumber) {
            System.out.print("Enter your guess: ");
            playerGuess = s.nextInt();
            // if the player guessed incorrectly
            if(playerGuess != mysteryNumber) {
            // if the player guessed too low
                if(playerGuess < mysteryNumber) {
                    System.out.println("Too low!");
                } // end inner if statement
                // if the player didn't guess too low (meaning, incorrect and too high!)
                else {
                    System.out.println("Too high!");
                } // end inner else statement
            } // end outer if statement
            // if the player didn't guess incorrectly (meaning, correct guess)
            else {
                System.out.println("Correct!!!");
            } // end outer else statement
            
        }

        s.close();
    } // end main method
} // end class