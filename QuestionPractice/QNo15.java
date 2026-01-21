/* Write a program in java that determines  idf a number is positive,negative,or zero.*/

import java.util.Scanner;

public class QNo15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        double num=input.nextDouble();
        if (num<0) {
            System.out.println("The number is a negative number");}
            else if (num>0) {
                System.out.println("The number is a positive number");
            }  else {
                System.out.println("The number is zero");
            }
            
        
    }
    
}
