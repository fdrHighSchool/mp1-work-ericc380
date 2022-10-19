
/**
 * Write a description of class randomnumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.util.Scanner;
import java.util.Random;
public class NumberGame
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int mysterynumber=Random.nextint(maximum)+1;
        System.out.println("what game mode?\nEasy\nMedium\nHArd");
        String mode=s .nextLine();
        mode=mode.toLowerCase();
        int maximum;
        int minimum;
        if (mode.equals("easy")){
            maximum=10;
            minimum=1;
        }
        else if(mode=="medium"){
            maximum=50;
            minimum=1;
        }
        else{
          maximum=100;
          minimum=1;
        }
         mysteryNumber=(Math.random()*(maximum-minimum+1)+minimum);
         int mysteryNumber = 5; // just a placeholder for now
         System.out.print("Enter your guess: ");
         int playerGuess = s.nextInt();
        
        // if the player guessed incorrectly
        if(playerGuess != mysteryNumber) {
            // if the player guessed too low
            if(playerGuess < mysteryNumber) {
                System.out.println("You were off by " + (mysteryNumber - playerGuess));
            } // end inner if statement
            // if the player didn't guess too low (meaning, incorrect and too high!)
            else {
                System.out.println("You were off by " + (playerGuess - mysteryNumber));
            } // end inner else statement
        } // end outer if statement
        // if the player didn't guess incorrectly (meaning, correct guess)
        else {
            System.out.println("Correct!!!");
        } // end outer else statement
    } // end main method
} // end class

