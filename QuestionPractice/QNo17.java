/*Write a program in java to determimne the greater of three number. */

import java.util.Scanner;

public class QNo17 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the First number: ");
        double num1= input.nextDouble();
        System.out.println("Enter the Second Number:");
        double num2= input.nextDouble();
        System.out.println("Enter the Third Number: ");
        double num3= input.nextDouble();
        if (num1>=num2 && num1>=num3) {
            System.out.println("First number is the Greatest number.");}
            else if (num2>=num3) {
            System.out.println("The Greatest number is Second number.");
             } else {
            System.out.println("Third Number is the Greatest number.");   
            }
            
        }
        
    }

