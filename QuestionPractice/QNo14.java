/*Write a program in java to convert the fahrenheit to celsius.
 C=(F-32)*5/9
  */
import java.util.Scanner;

public class QNo14 {
    public static void main(String[] args) {
    Scanner input = new Scanner (System.in);
    System.out.println("Welcome to Temperature  Convertor ");
    System.out.println("Enter the temperature in fahrenheit: ");
    double fah=input.nextDouble();
    double celsius= (fah-32)*5/9;
    System.out.println("Temperature in celsius is " + celsius );
           
        
    }
}
