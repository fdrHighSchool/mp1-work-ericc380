
/**
 * Write a description of class samplecode here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;

public class Lanternfly
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("there was a recent test in school ");
        System.out.println("the scores are out");
        
        System.out.print("what did you get on your recent test? ");
        int num=input.nextInt();
        
        if (num <40){
            System.out.println("You can do better than that!");
        } // end if statement
        else if (num <64){
             System.out.println("your getting close..");
            }
        else if (num<80) {
            System.out.println("your almost there");
        
        }
        else if (num<90) {
            System.out.println("your very close ");
        }
        else if (num<=100) {
            System.out.println("good job");
        }
        else
         System.out.println("your very smart");
        
        } // end else statement
        
    } // end main method
//}// end class
