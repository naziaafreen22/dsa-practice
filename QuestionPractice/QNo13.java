import java.util.Scanner;

public class QNo13 {
    public static void main(String[] args) {
    
    Scanner input= new Scanner (System.in);
    System.out.println("Welcome to Compound Interest Calculator ");
    System.out.println("Enter the Principle Amount: ");
    double principle=input.nextDouble();
    System.out.println("Enter the Rate: ");
    double rate= input.nextDouble();
    System.out.println("Enter the Time: ");
    double time= input.nextDouble();
    double compoundInterest= principle*(1+rate/100)*time;
    System.out.println("Compound Interest is " + compoundInterest);
           
    }
    
}
