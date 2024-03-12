//10.Create a program to calculate Perimeter of a rectangle.
// Perimeter of rectangle ABCD = A+B+C+D

import java.util.Scanner;

class Perimeter {
    public static void main(String[] args){
//        Declaring Input variable for all
        Scanner input=new Scanner(System.in);

        System.out.println("Program to calculate Perimeter of Triangle");
        System.out.print("Enter the value of side A: ");
        float sideA=input.nextFloat();

        System.out.print("Enter the value of side B: ");
        float sideB=input.nextFloat();

        System.out.print("Enter the value of side C: ");
        float sideC=input.nextFloat();

        System.out.print("Enter the value of side D: ");
        float sideD=input.nextFloat();

        float perimeter=sideA+sideB+sideC+sideD;
        System.out.println("The perimeter is ="+perimeter+(" cm"));

//        11.Create a program to calculate the Area of a Triangle.
//        Area of triangle = ½2*B*H

    }
}
