/*Write a java program to determine if a given year is a leap year or not(Considering condition like divisible by 4 but not 100,unless also divisible by 400) */

import java.util.Scanner;

public class QNo18 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year=input.nextInt();
        if (year%400==0  && (year%4==0||year%100!=0 )) {
            System.out.println("The Year is a Leap year.");
        }
        else{
            System.out.println("The year is not a Leap Year");
        }
    }
    
}
