/*
Write a program in java to calculate the area of triangle.
Area of Triangle=1/2*B*H 
*/

import java.util.Scanner;

public class QNo11 {
    
public static void main(String[] args) {
    Scanner input= new Scanner (System.in);
    System.out.println("Welcome to area Calculator of Triangle");
    System.out.println("Enter the base of triangle: ");
    double base=input.nextDouble();
    System.out.println("Enter the height of the triangle: ");
    double height= input.nextDouble();
    double area=0.2*base*height;
    System.out.println("The Area of a Triangle is " + area); 
}
}
