//Develop a program that prints the multiplication table for a given number.

import java.util.Scanner;

class MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Printing the Table of Multiplication Table");
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number : ");
        int num=input.nextInt();

        //calling method
         printMultiplicationTable(num);
    }

    public static void printMultiplicationTable(int num){
        int i=1;
        while (i<=10){
            System.out.println( num + " X " + i + " = " + (num * i));
            i++;
        }
    }
}
