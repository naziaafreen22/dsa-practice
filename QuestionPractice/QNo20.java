/* Write a java program that categorize a person into different age group
child-13
teen-below 20
adult- below 60
senior- above 60*/

import java.util.Scanner;

public class QNo20 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age= input.nextInt();
        if (age<13) {
            System.out.println("Child");
             }
             if (age>=13 && age<20) {
                System.out.println("Teen");
                
             } else if (age>20 && age<60) {
                System.out.println("Adult");
                
             } else {
                System.out.println("Senior");
                
             }  

             
    }

    
}
