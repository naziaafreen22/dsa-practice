/*
Write a program in java to calculate the Simple Interest.
Simple Interest=(P*T*R)/100
*/

import java.util.Scanner;

public class QNo12 {
    public static void main(String[] args) {
    Scanner input= new Scanner (System.in);
    System.out.println("Welcome to Simple Interest Calculator ");
    System.out.println("Enter the Principle Amount: ");
    double principle=input.nextDouble();
    System.out.println("Enter the Rate: ");
    double rate= input.nextDouble();
    System.out.println("Enter the Interest: ");
    double interest= input.nextDouble();
    double simpleInterest=(principle*rate*interest)/100;
    System.out.println("Simple Interest is " + simpleInterest);
    }
    
}
