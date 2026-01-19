/*Write the program in java to calculate the product of two floating numbers. */

import java.util.Scanner;

public class QNo9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our Product Calculator");
        System.out.println("Enter the first number: ");
        float num1=input.nextFloat();
        System.out.println("Enter the second number: ");
        float num2= input.nextFloat();
        float product=num1*num2;
        System.out.println("The Product of two Floating numbers are " + product);
        
    }

    
}
