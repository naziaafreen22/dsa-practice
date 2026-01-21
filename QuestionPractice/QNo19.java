/* Write a program in java that calculate grades based on masks:
A-- above 90%
B-- above 75% 
C-- above 60%
D-- above 30%
F-- below 30% */

import java.util.Scanner;

public class QNo19 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Your grades: ");
        double grades = input.nextDouble();
        if (grades<30) {
            System.out.println("F");
            
        }
        else if (grades>30 && grades<60) {
            System.out.println("D");
            
        }
        else if (grades>60 && grades<75) {
            System.out.println("C");
            
        } else if (grades<75 && grades<90) {
            System.out.println("B");
            
        }else {
            System.out.println("A");
            
        }
    }
    
}
