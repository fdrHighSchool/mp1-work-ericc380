
/**
 * Write a description of class date here.
 *
 * @author (your name)
 * @version (a version number or a date)
 * 
 */
import java.util.Scanner;
public class date
{
  public static void main(String[]args){
    //end of main method
  Scanner s =new Scanner(System.in);
  System.out.print("what day of the week is it?");
  String day=s.nextLine();
  
  System.out.print("what month is it?");
  String month=s.nextLine();
  
  System.out.print("what year is it?");
  String year=s.nextLine();
  
  System.out.print("what day of the month is it?");
  String num=s.nextLine();
  
  System.out.println("American format:"+day+","+month+" " +num+"," +year);
  System.out.println("European format:"+day+","+num+","+month+" "+year);
}//end of main method
}//end of date class
