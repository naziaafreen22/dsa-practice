/*Write a program in java that takes two number and shows result of all arithmetic operators. */

import java.util.Scanner;

public class QNo8 {
    public static void main(String[] args) {
        Scanner input= new Scanner (System.in);
        System.out.println("Welcome to Arithmatic Operator Calculator");
        System.out.println("Enter the First Number: ");
        int a= input.nextInt();
        System.out.println("Enter the Second Number: ");
        int b= input.nextInt();
        int add=a+b;
        int sub=a-b;
        int mul=a*b;
        int div=a/b;
        int mod=a%b;
        System.out.println("Addition is " + add);
        System.out.println("Subtraction is " + sub);
        System.out.println("Multiplication is " + mul);
        System.out.println("Division is " + div);
        System.out.println("Modulus is " + mod);
}
    
}

