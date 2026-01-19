/*rite a program in java to calculate the perimeter of rectangle.
Area ofRectangle ABCD=A+B+C+D */

import java.util.Scanner;

public class QNo10 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Welcome to Perimeter Calculator");
        System.out.println("Enter the lenght of side A of a Rectangle: ");
        double sideA=input.nextDouble();
        System.out.println("Enter the lenght of side B of a Rectangle: ");
        double sideB=input.nextDouble();
        System.out.println("Enter the lenght of side C of a Rectangle: ");
        double sideC=input.nextDouble();
        System.out.println("Enter the lenght of side D of a Rectangle: ");
        double sideD=input.nextDouble();
        double perimeterOfRectangle=sideA+sideB+sideC+sideD;
        System.out.println("Perimeter of a rectangle is equal to " + perimeterOfRectangle);
    }
}
