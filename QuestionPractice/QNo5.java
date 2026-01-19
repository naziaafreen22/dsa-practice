/*Write a java program to add to number.Taking the input from the  user */

import java.util.Scanner;

public class QNo5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to our sum Calculator");
        System.out.println("Enter the first number: ");
        int num1=input.nextInt();
        System.out.println("Enter the second number: ");
        int num2= input.nextInt();
        int sum=num1+num2;
        System.out.println("The sum of two numbers are " + sum);
        
    }

    
}