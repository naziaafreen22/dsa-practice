/*Write a java program to determine if a number is even or odd */

import java.util.Scanner;

public class QNo16 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the number: ");
        double num=input.nextDouble();
        if (num%2==0) {
            System.out.println("The Number is an even number.");
            
        }else{
            System.out.println("The Number is an odd number.");
        }
    }
    
}
