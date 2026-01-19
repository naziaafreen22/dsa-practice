/*Write a program in java to swap two numbers.Taking the input for user. */

import java.util.Scanner;

public class QNo7 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to Swapping Station");
        System.out.println("Please enter the first number: ");
        int a= input.nextInt();
        System.out.println("Enter the second number: ");
        int b= input.nextInt();
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("After Swapping the Numbers");
        System.out.println("The Value of first number: " + a);
        System.out.println("the Value of Second number: " + b);


    }
    
}
